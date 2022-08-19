// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ReviewDocumentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ReviewDocumentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   * @return The gcsDestination.
   */
  java.lang.String getGcsDestination();
  /**
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   * @return The bytes for gcsDestination.
   */
  com.google.protobuf.ByteString
      getGcsDestinationBytes();

  /**
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentResponse.State state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ReviewDocumentResponse.State state = 2;</code>
   * @return The state.
   */
  com.google.cloud.documentai.v1beta3.ReviewDocumentResponse.State getState();

  /**
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   * @return The rejectionReason.
   */
  java.lang.String getRejectionReason();
  /**
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   * @return The bytes for rejectionReason.
   */
  com.google.protobuf.ByteString
      getRejectionReasonBytes();
}
