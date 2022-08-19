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

package com.google.cloud.retail.v2.samples;

// [START retail_v2_generated_productserviceclient_createproduct_sync]
import com.google.cloud.retail.v2.BranchName;
import com.google.cloud.retail.v2.CreateProductRequest;
import com.google.cloud.retail.v2.Product;
import com.google.cloud.retail.v2.ProductServiceClient;

public class SyncCreateProduct {

  public static void main(String[] args) throws Exception {
    syncCreateProduct();
  }

  public static void syncCreateProduct() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductServiceClient productServiceClient = ProductServiceClient.create()) {
      CreateProductRequest request =
          CreateProductRequest.newBuilder()
              .setParent(
                  BranchName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[BRANCH]").toString())
              .setProduct(Product.newBuilder().build())
              .setProductId("productId-1051830678")
              .build();
      Product response = productServiceClient.createProduct(request);
    }
  }
}
// [END retail_v2_generated_productserviceclient_createproduct_sync]
