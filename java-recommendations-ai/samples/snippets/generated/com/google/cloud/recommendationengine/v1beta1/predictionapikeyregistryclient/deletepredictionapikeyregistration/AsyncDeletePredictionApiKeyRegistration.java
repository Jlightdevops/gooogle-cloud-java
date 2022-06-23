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

package com.google.cloud.recommendationengine.v1beta1.samples;

// [START
// recommendationengine_v1beta1_generated_predictionapikeyregistryclient_deletepredictionapikeyregistration_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest;
import com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationName;
import com.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistryClient;
import com.google.protobuf.Empty;

public class AsyncDeletePredictionApiKeyRegistration {

  public static void main(String[] args) throws Exception {
    asyncDeletePredictionApiKeyRegistration();
  }

  public static void asyncDeletePredictionApiKeyRegistration() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PredictionApiKeyRegistryClient predictionApiKeyRegistryClient =
        PredictionApiKeyRegistryClient.create()) {
      DeletePredictionApiKeyRegistrationRequest request =
          DeletePredictionApiKeyRegistrationRequest.newBuilder()
              .setName(
                  PredictionApiKeyRegistrationName.of(
                          "[PROJECT]",
                          "[LOCATION]",
                          "[CATALOG]",
                          "[EVENT_STORE]",
                          "[PREDICTION_API_KEY_REGISTRATION]")
                      .toString())
              .build();
      ApiFuture<Empty> future =
          predictionApiKeyRegistryClient
              .deletePredictionApiKeyRegistrationCallable()
              .futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END
// recommendationengine_v1beta1_generated_predictionapikeyregistryclient_deletepredictionapikeyregistration_async]