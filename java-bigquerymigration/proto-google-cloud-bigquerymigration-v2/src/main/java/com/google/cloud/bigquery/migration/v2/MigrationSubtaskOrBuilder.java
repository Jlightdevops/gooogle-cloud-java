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
// source: google/cloud/bigquery/migration/v2/migration_entities.proto

package com.google.cloud.bigquery.migration.v2;

public interface MigrationSubtaskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.MigrationSubtask)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The resource name for the migration subtask. The ID
   * is server-generated.
   * Example: `projects/123/locations/us/workflows/345/subtasks/678`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The resource name for the migration subtask. The ID
   * is server-generated.
   * Example: `projects/123/locations/us/workflows/345/subtasks/678`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The unique ID of the task to which this subtask belongs.
   * </pre>
   *
   * <code>string task_id = 2;</code>
   *
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   *
   *
   * <pre>
   * The unique ID of the task to which this subtask belongs.
   * </pre>
   *
   * <code>string task_id = 2;</code>
   *
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString getTaskIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the Subtask. The migration service does not check whether this
   * is a known type. It is up to the task creator (i.e. orchestrator or worker)
   * to ensure it only creates subtasks for which there are compatible workers
   * polling for Subtasks.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of the Subtask. The migration service does not check whether this
   * is a known type. It is up to the task creator (i.e. orchestrator or worker)
   * to ensure it only creates subtasks for which there are compatible workers
   * polling for Subtasks.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the subtask.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2.MigrationSubtask.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the subtask.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2.MigrationSubtask.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.bigquery.migration.v2.MigrationSubtask.State getState();

  /**
   *
   *
   * <pre>
   * Output only. An explanation that may be populated when the task is in
   * FAILED state.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo processing_error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the processingError field is set.
   */
  boolean hasProcessingError();
  /**
   *
   *
   * <pre>
   * Output only. An explanation that may be populated when the task is in
   * FAILED state.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo processing_error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The processingError.
   */
  com.google.rpc.ErrorInfo getProcessingError();
  /**
   *
   *
   * <pre>
   * Output only. An explanation that may be populated when the task is in
   * FAILED state.
   * </pre>
   *
   * <code>.google.rpc.ErrorInfo processing_error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.ErrorInfoOrBuilder getProcessingErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Provides details to errors and issues encountered while
   * processing the subtask. Presence of error details does not mean that the
   * subtask failed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.ResourceErrorDetail resource_error_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.ResourceErrorDetail>
      getResourceErrorDetailsList();
  /**
   *
   *
   * <pre>
   * Output only. Provides details to errors and issues encountered while
   * processing the subtask. Presence of error details does not mean that the
   * subtask failed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.ResourceErrorDetail resource_error_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.ResourceErrorDetail getResourceErrorDetails(int index);
  /**
   *
   *
   * <pre>
   * Output only. Provides details to errors and issues encountered while
   * processing the subtask. Presence of error details does not mean that the
   * subtask failed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.ResourceErrorDetail resource_error_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getResourceErrorDetailsCount();
  /**
   *
   *
   * <pre>
   * Output only. Provides details to errors and issues encountered while
   * processing the subtask. Presence of error details does not mean that the
   * subtask failed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.ResourceErrorDetail resource_error_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.ResourceErrorDetailOrBuilder>
      getResourceErrorDetailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Provides details to errors and issues encountered while
   * processing the subtask. Presence of error details does not mean that the
   * subtask failed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.migration.v2.ResourceErrorDetail resource_error_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.migration.v2.ResourceErrorDetailOrBuilder
      getResourceErrorDetailsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The number or resources with errors. Note: This is not the total
   * number of errors as each resource can have more than one error.
   * This is used to indicate truncation by having a `resource_error_count`
   * that is higher than the size of `resource_error_details`.
   * </pre>
   *
   * <code>int32 resource_error_count = 13;</code>
   *
   * @return The resourceErrorCount.
   */
  int getResourceErrorCount();

  /**
   *
   *
   * <pre>
   * Time when the subtask was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Time when the subtask was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Time when the subtask was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time when the subtask was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 8;</code>
   *
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Time when the subtask was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 8;</code>
   *
   * @return The lastUpdateTime.
   */
  com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Time when the subtask was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The metrics for the subtask.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.TimeSeries metrics = 11;</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.TimeSeries> getMetricsList();
  /**
   *
   *
   * <pre>
   * The metrics for the subtask.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.TimeSeries metrics = 11;</code>
   */
  com.google.cloud.bigquery.migration.v2.TimeSeries getMetrics(int index);
  /**
   *
   *
   * <pre>
   * The metrics for the subtask.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.TimeSeries metrics = 11;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * The metrics for the subtask.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.TimeSeries metrics = 11;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.TimeSeriesOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metrics for the subtask.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.TimeSeries metrics = 11;</code>
   */
  com.google.cloud.bigquery.migration.v2.TimeSeriesOrBuilder getMetricsOrBuilder(int index);
}