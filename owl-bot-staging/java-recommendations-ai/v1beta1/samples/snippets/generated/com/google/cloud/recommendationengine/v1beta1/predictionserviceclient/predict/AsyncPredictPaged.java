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

// [START recommendationengine_v1beta1_generated_predictionserviceclient_predict_paged_async]
import com.google.cloud.recommendationengine.v1beta1.PlacementName;
import com.google.cloud.recommendationengine.v1beta1.PredictRequest;
import com.google.cloud.recommendationengine.v1beta1.PredictResponse;
import com.google.cloud.recommendationengine.v1beta1.PredictionServiceClient;
import com.google.cloud.recommendationengine.v1beta1.UserEvent;
import com.google.common.base.Strings;
import com.google.protobuf.Value;
import java.util.HashMap;
import java.util.Map;

public class AsyncPredictPaged {

  public static void main(String[] args) throws Exception {
    asyncPredictPaged();
  }

  public static void asyncPredictPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      PredictRequest request =
          PredictRequest.newBuilder()
              .setName(
                  PlacementName.of(
                          "[PROJECT]", "[LOCATION]", "[CATALOG]", "[EVENT_STORE]", "[PLACEMENT]")
                      .toString())
              .setUserEvent(UserEvent.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setDryRun(true)
              .putAllParams(new HashMap<String, Value>())
              .putAllLabels(new HashMap<String, String>())
              .build();
      while (true) {
        PredictResponse response = predictionServiceClient.predictCallable().call(request);
        for (Map.Entry<String, Value> element : response.getMetadataList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END recommendationengine_v1beta1_generated_predictionserviceclient_predict_paged_async]
