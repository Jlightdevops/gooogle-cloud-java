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

package com.google.cloud.tasks.v2beta3.samples;

// [START tasks_v2beta3_generated_cloudtasksclient_createqueue_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.tasks.v2beta3.CloudTasksClient;
import com.google.cloud.tasks.v2beta3.CreateQueueRequest;
import com.google.cloud.tasks.v2beta3.LocationName;
import com.google.cloud.tasks.v2beta3.Queue;

public class AsyncCreateQueue {

  public static void main(String[] args) throws Exception {
    asyncCreateQueue();
  }

  public static void asyncCreateQueue() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      CreateQueueRequest request =
          CreateQueueRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setQueue(Queue.newBuilder().build())
              .build();
      ApiFuture<Queue> future = cloudTasksClient.createQueueCallable().futureCall(request);
      // Do something.
      Queue response = future.get();
    }
  }
}
// [END tasks_v2beta3_generated_cloudtasksclient_createqueue_async]
