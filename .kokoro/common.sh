#!/bin/bash
# Copyright 2020 Google LLC
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

excluded_modules=('CoverageAggregator' 'google-cloud-gapic-bom')

function retry_with_backoff {
    attempts_left=$1
    sleep_seconds=$2
    shift 2
    command=$@


    # store current flag state
    flags=$-
    
    # allow a failures to continue
    set +e
    ${command}
    exit_code=$?

    # restore "e" flag
    if [[ ${flags} =~ e ]]
    then set -e
    else set +e
    fi

    if [[ $exit_code == 0 ]]
    then
        return 0
    fi

    # failure
    if [[ ${attempts_left} -gt 0 ]]
    then
        echo "failure (${exit_code}), sleeping ${sleep_seconds}..."
        sleep ${sleep_seconds}
        new_attempts=$((${attempts_left} - 1))
        new_sleep=$((${sleep_seconds} * 2))
        retry_with_backoff ${new_attempts} ${new_sleep} ${command}
    fi

    return $exit_code
}

## Helper functions
function now() { date +"%Y-%m-%d %H:%M:%S" | tr -d '\n'; }
function msg() { println "$*" >&2; }
function println() { printf '%s\n' "$(now) $*"; }

function generate_modified_modules_list() {
  # Find the files changed from when the PR branched to the last commit
  # Filter for java modules and get all the unique elements
  # grep returns 1 (error code) and exits the pipeline if there is no match
  # If there is no match, it will return true so the rest of the commands can run
  modified_files=$(git diff --name-only $KOKORO_GITHUB_PULL_REQUEST_COMMIT $KOKORO_GITHUB_PULL_REQUEST_TARGET_BRANCH)
  printf "Modified files:\n%s\n" "${modified_files}"

  modified_module_list=()
  # If root pom.xml is touched, run ITs on all the modules
  root_pom_modified=$(echo "${modified_files}" | grep -e '^pom.xml$' || true)
  if [[ ( -n $root_pom_modified ) || ( "${TEST_ALL_MODULES}" == "true" ) ]]; then
    modules=$(mvn help:evaluate -Dexpression=project.modules | grep '<.*>.*</.*>' | sed -e 's/<.*>\(.*\)<\/.*>/\1/g')
    for module in $modules; do
      if [[ ! "${excluded_modules[*]}" =~ $module ]]; then
        modified_module_list+=("${module}")
      fi
    done
    echo "Testing the entire monorepo"
  else
    modules=$(echo "${modified_files}" | grep -e 'java-.*' || true)
    printf "Files in java modules:\n%s\n" "${modules}"
    if [[ -n $modules ]]; then
      modules=$(echo "${modules}" | cut -d '/' -f1 | sort -u)
      for module in $modules; do
        modified_module_list+=("${module}")
      done
    else
      echo "Found no changes in the java modules"
    fi
  fi
}

function assign_modules_to_job() {
  modules_assigned_list=()
  num=0
  for module in "${modified_module_list[@]}"; do
    # Add 1 as JOB_NUMBER is 1-indexed instead of 0-indexed
    mod_num=$((num % NUM_JOBS + 1))
    if [[ ! "${excluded_modules[*]}" =~ $module ]] && [[ $mod_num -eq $JOB_NUMBER ]]; then
      modules_assigned_list+=("${module}")
    fi
    num=$((num + 1))
  done
}

function run_graalvm_tests() {
  printf "Running GraalVM ITs on:\n%s\n" "${module_list[*]}"
  mvn -B ${INTEGRATION_TEST_ARGS} \
    -pl "${module_list},!CoverageAggregator" \
    -amd \
    -ntp \
    -DtrimStackTrace=false \
    -Dclirr.skip=true \
    -Denforcer.skip=true \
    -Dcheckstyle.skip=true \
    -Dflatten.skip=true \
    -Danimal.sniffer.skip=true \
    -Pnative \
    -fae \
    test
  RETURN_CODE=$?
  printf "Finished Unit and Integration Tests for GraalVM:\n%s\n" "${module_list}"
}

function generate_graalvm_modules_list() {
  if [[ "${TEST_ALL_MODULES}" == "true" ]]; then
    # This will get a list of all modules
    generate_modified_modules_list
    assign_modules_to_job
    # Combine each entry with a comma
    module_list=$(
      IFS=,
      echo "${modules_assigned_list[*]}"
    )
    printf "Module list is:\n%s\n" "${module_list}"
  else
    module_list="${MAVEN_MODULES}"
    printf "Running the GraalVM test on pre-selected maven modules: %s\n" "${MAVEN_MODULES}"
  fi
}

function install_modules() {
  mvn -B -pl "${module_list},!CoverageAggregator" \
    -amd \
    -ntp \
    -DtrimStackTrace=false \
    -Dclirr.skip=true \
    -Denforcer.skip=true \
    -Dcheckstyle.skip=true \
    -Dflatten.skip=true \
    -Danimal.sniffer.skip=true \
    -DskipTests=true \
    -Djacoco.skip=true \
    -T 1C \
    install
}