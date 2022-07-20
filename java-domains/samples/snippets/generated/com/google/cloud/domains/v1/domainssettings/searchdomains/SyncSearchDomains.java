/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.domains.v1.samples;

// [START domains_v1_generated_domainssettings_searchdomains_sync]
import com.google.cloud.domains.v1.DomainsSettings;
import java.time.Duration;

public class SyncSearchDomains {

  public static void main(String[] args) throws Exception {
    syncSearchDomains();
  }

  public static void syncSearchDomains() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    DomainsSettings.Builder domainsSettingsBuilder = DomainsSettings.newBuilder();
    domainsSettingsBuilder
        .searchDomainsSettings()
        .setRetrySettings(
            domainsSettingsBuilder
                .searchDomainsSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    DomainsSettings domainsSettings = domainsSettingsBuilder.build();
  }
}
// [END domains_v1_generated_domainssettings_searchdomains_sync]
