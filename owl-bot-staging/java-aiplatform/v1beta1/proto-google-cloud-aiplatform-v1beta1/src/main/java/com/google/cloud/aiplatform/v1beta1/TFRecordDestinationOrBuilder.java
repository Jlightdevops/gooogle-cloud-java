// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

public interface TFRecordDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.TFRecordDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsDestination.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getGcsDestination();
  /**
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();
}
