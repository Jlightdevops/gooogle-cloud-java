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

package com.google.cloud.iot.v1.samples;

// [START iot_v1_generated_devicemanagerclient_listdevices_paged_async]
import com.google.cloud.iot.v1.Device;
import com.google.cloud.iot.v1.DeviceManagerClient;
import com.google.cloud.iot.v1.GatewayListOptions;
import com.google.cloud.iot.v1.ListDevicesRequest;
import com.google.cloud.iot.v1.ListDevicesResponse;
import com.google.cloud.iot.v1.RegistryName;
import com.google.common.base.Strings;
import com.google.protobuf.FieldMask;
import java.util.ArrayList;

public class AsyncListDevicesPaged {

  public static void main(String[] args) throws Exception {
    asyncListDevicesPaged();
  }

  public static void asyncListDevicesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
      ListDevicesRequest request =
          ListDevicesRequest.newBuilder()
              .setParent(RegistryName.of("[PROJECT]", "[LOCATION]", "[REGISTRY]").toString())
              .addAllDeviceNumIds(new ArrayList<Long>())
              .addAllDeviceIds(new ArrayList<String>())
              .setFieldMask(FieldMask.newBuilder().build())
              .setGatewayListOptions(GatewayListOptions.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListDevicesResponse response = deviceManagerClient.listDevicesCallable().call(request);
        for (Device element : response.getDevicesList()) {
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
// [END iot_v1_generated_devicemanagerclient_listdevices_paged_async]
