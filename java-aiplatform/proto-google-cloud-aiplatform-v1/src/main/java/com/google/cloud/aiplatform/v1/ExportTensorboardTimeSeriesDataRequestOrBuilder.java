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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface ExportTensorboardTimeSeriesDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportTensorboardTimeSeriesDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to export data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboardTimeSeries.
   */
  java.lang.String getTensorboardTimeSeries();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to export data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboardTimeSeries.
   */
  com.google.protobuf.ByteString getTensorboardTimeSeriesBytes();

  /**
   *
   *
   * <pre>
   * Exports the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Exports the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of data points to return per page.
   * The default page_size will be 1000. Values must be between 1 and 10000.
   * Values above 10000 will be coerced to 10000.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [TensorboardService.ExportTensorboardTimeSeries][] call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [TensorboardService.ExportTensorboardTimeSeries][] must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [TensorboardService.ExportTensorboardTimeSeries][] call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [TensorboardService.ExportTensorboardTimeSeries][] must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Field to use to sort the TensorboardTimeSeries' data.
   * By default, TensorboardTimeSeries' data will be returned in a pseudo random
   * order.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Field to use to sort the TensorboardTimeSeries' data.
   * By default, TensorboardTimeSeries' data will be returned in a pseudo random
   * order.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}