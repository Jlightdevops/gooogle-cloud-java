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

package com.google.cloud.domains.v1beta1.samples;

// [START
// domains_v1beta1_generated_domainsclient_transferdomain_stringregistrationmoneyauthorizationcode_sync]
import com.google.cloud.domains.v1beta1.AuthorizationCode;
import com.google.cloud.domains.v1beta1.DomainsClient;
import com.google.cloud.domains.v1beta1.LocationName;
import com.google.cloud.domains.v1beta1.Registration;
import com.google.type.Money;

public class SyncTransferDomainStringRegistrationMoneyAuthorizationcode {

  public static void main(String[] args) throws Exception {
    syncTransferDomainStringRegistrationMoneyAuthorizationcode();
  }

  public static void syncTransferDomainStringRegistrationMoneyAuthorizationcode() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      Registration registration = Registration.newBuilder().build();
      Money yearlyPrice = Money.newBuilder().build();
      AuthorizationCode authorizationCode = AuthorizationCode.newBuilder().build();
      Registration response =
          domainsClient
              .transferDomainAsync(parent, registration, yearlyPrice, authorizationCode)
              .get();
    }
  }
}
// [END
// domains_v1beta1_generated_domainsclient_transferdomain_stringregistrationmoneyauthorizationcode_sync]