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

package com.google.cloud.datafusion.v1beta1.samples;

// [START datafusion_v1beta1_generated_datafusionclient_updateinstance_instancefieldmask_sync]
import com.google.cloud.datafusion.v1beta1.DataFusionClient;
import com.google.cloud.datafusion.v1beta1.Instance;
import com.google.protobuf.FieldMask;

public class SyncUpdateInstanceInstanceFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateInstanceInstanceFieldmask();
  }

  public static void syncUpdateInstanceInstanceFieldmask() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataFusionClient dataFusionClient = DataFusionClient.create()) {
      Instance instance = Instance.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      Instance response = dataFusionClient.updateInstanceAsync(instance, updateMask).get();
    }
  }
}
// [END datafusion_v1beta1_generated_datafusionclient_updateinstance_instancefieldmask_sync]
