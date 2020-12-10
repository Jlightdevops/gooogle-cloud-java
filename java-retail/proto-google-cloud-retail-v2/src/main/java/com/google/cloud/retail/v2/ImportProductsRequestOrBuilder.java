/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

public interface ImportProductsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ImportProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * "projects/1234/locations/global/catalogs/default_catalog/branches/default_branch"
   * If no updateMask is specified, requires products.create permission.
   * If updateMask is specified, requires products.update permission.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * "projects/1234/locations/global/catalogs/default_catalog/branches/default_branch"
   * If no updateMask is specified, requires products.create permission.
   * If updateMask is specified, requires products.update permission.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.retail.v2.ProductInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ProductInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.ProductInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return The errorsConfig.
   */
  com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   */
  com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'products' to update. If
   * not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'products' to update. If
   * not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided imported 'products' to update. If
   * not set, will by default update all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
