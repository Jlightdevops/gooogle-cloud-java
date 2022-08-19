// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface BoundingPolyConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.BoundingPolyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The annotationSpecSet.
   */
  java.lang.String getAnnotationSpecSet();
  /**
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for annotationSpecSet.
   */
  com.google.protobuf.ByteString
      getAnnotationSpecSetBytes();

  /**
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The instructionMessage.
   */
  java.lang.String getInstructionMessage();
  /**
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for instructionMessage.
   */
  com.google.protobuf.ByteString
      getInstructionMessageBytes();
}
