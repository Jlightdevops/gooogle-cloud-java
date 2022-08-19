// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_error_details.proto

package com.google.cloud.bigquery.migration.v2alpha;

public interface ResourceErrorDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.ResourceErrorDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Information about the resource where the error is located.
   * </pre>
   *
   * <code>.google.rpc.ResourceInfo resource_info = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the resourceInfo field is set.
   */
  boolean hasResourceInfo();
  /**
   * <pre>
   * Required. Information about the resource where the error is located.
   * </pre>
   *
   * <code>.google.rpc.ResourceInfo resource_info = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resourceInfo.
   */
  com.google.rpc.ResourceInfo getResourceInfo();
  /**
   * <pre>
   * Required. Information about the resource where the error is located.
   * </pre>
   *
   * <code>.google.rpc.ResourceInfo resource_info = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.rpc.ResourceInfoOrBuilder getResourceInfoOrBuilder();

  /**
   * <pre>
   * Required. The error details for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.ErrorDetail error_details = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2alpha.ErrorDetail> 
      getErrorDetailsList();
  /**
   * <pre>
   * Required. The error details for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.ErrorDetail error_details = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.ErrorDetail getErrorDetails(int index);
  /**
   * <pre>
   * Required. The error details for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.ErrorDetail error_details = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getErrorDetailsCount();
  /**
   * <pre>
   * Required. The error details for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.ErrorDetail error_details = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2alpha.ErrorDetailOrBuilder> 
      getErrorDetailsOrBuilderList();
  /**
   * <pre>
   * Required. The error details for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.ErrorDetail error_details = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.ErrorDetailOrBuilder getErrorDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. How many errors there are in total for the resource. Truncation can be
   * indicated by having an `error_count` that is higher than the size of
   * `error_details`.
   * </pre>
   *
   * <code>int32 error_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The errorCount.
   */
  int getErrorCount();
}
