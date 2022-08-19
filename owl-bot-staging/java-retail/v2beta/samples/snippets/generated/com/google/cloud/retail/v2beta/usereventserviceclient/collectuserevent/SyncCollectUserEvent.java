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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_usereventserviceclient_collectuserevent_sync]
import com.google.api.HttpBody;
import com.google.cloud.retail.v2beta.CollectUserEventRequest;
import com.google.cloud.retail.v2beta.UserEventServiceClient;

public class SyncCollectUserEvent {

  public static void main(String[] args) throws Exception {
    syncCollectUserEvent();
  }

  public static void syncCollectUserEvent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      CollectUserEventRequest request =
          CollectUserEventRequest.newBuilder()
              .setParent("parent-995424086")
              .setUserEvent("userEvent315571599")
              .setUri("uri116076")
              .setEts(100772)
              .build();
      HttpBody response = userEventServiceClient.collectUserEvent(request);
    }
  }
}
// [END retail_v2beta_generated_usereventserviceclient_collectuserevent_sync]
