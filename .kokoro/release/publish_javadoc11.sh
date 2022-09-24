#!/bin/bash
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -eo pipefail

if [[ -z "${CREDENTIALS}" ]]; then
  CREDENTIALS=${KOKORO_KEYSTORE_DIR}/73713_docuploader_service_account
fi

if [[ -z "${STAGING_BUCKET_V2}" ]]; then
  echo "Need to set STAGING_BUCKET_V2 environment variable"
  exit 1
fi

# work from the git root directory
pushd $(dirname "$0")/../../

# install docuploader package
python3 -m pip install gcp-docuploader

apt-get update
# install jq to extract field from json file
apt-get install -y jq

doclet_name="java-docfx-doclet-1.7.0.jar"

# compile all packages
#mvn clean install -B -q -DskipTests -Dcheckstyle.skip -Denforcer.skip=true -T 1C

# Retrieve list of modules from aggregator pom
modules=$(mvn help:evaluate -Dexpression=project.modules | grep '<.*>.*</.*>' | sed -e 's/<.*>\(.*\)<\/.*>/\1/g')
excluded_modules=('CoverageAggregator' 'google-cloud-gapic-bom')

for module in $modules
do
  # Proceed if module is not excluded
  if [[ ! "${excluded_modules[*]}" =~ $module ]]; then
    pushd $module
    # Extract Cloud RAD module name
    NAME=$(jq -r '.distribution_name' .repo-metadata.json | cut -d ':' -f 2)
    # Extract (current) version from versions.txt and remove `-SNAPSHOT`
    VERSION=$(grep ${NAME}: versions.txt | cut -d: -f3 | sed -e 's/-SNAPSHOT//g')
    echo "Running for ${NAME}-${VERSION}"

    # cloud RAD generation
    mvn clean javadoc:aggregate -B -P docFX -DdocletPath=${KOKORO_GFILE_DIR}/${doclet_name}
    # include CHANGELOG
    cp CHANGELOG.md target/docfx-yml/history.md

    pushd target/docfx-yml

    # create metadata
    python3 -m docuploader create-metadata \
     --name ${NAME} \
     --version ${VERSION} \
     --xrefs devsite://java/gax \
     --xrefs devsite://java/google-cloud-core \
     --xrefs devsite://java/api-common \
     --xrefs devsite://java/proto-google-common-protos \
     --xrefs devsite://java/google-api-client \
     --xrefs devsite://java/google-http-client \
     --xrefs devsite://java/protobuf \
     --language java

    # upload yml to production bucket
    python3 -m docuploader upload . \
     --credentials ${CREDENTIALS} \
     --staging-bucket ${STAGING_BUCKET_V2} \
     --destination-prefix docfx

    popd # out of target/docfx-yml
    popd # out of $module
  fi
done
