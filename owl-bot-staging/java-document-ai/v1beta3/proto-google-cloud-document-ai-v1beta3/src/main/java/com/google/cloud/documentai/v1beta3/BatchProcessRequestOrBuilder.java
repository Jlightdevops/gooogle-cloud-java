// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface BatchProcessRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.BatchProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig> 
      getInputConfigsList();
  /**
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig getInputConfigs(int index);
  /**
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getInputConfigsCount();
  /**
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfigOrBuilder> 
      getInputConfigsOrBuilderList();
  /**
   * <pre>
   * The input config for each single document in the batch process.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfig input_configs = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchInputConfigOrBuilder getInputConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];</code>
   * @deprecated google.cloud.documentai.v1beta3.BatchProcessRequest.output_config is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=378
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Deprecated boolean hasOutputConfig();
  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];</code>
   * @deprecated google.cloud.documentai.v1beta3.BatchProcessRequest.output_config is deprecated.
   *     See google/cloud/documentai/v1beta3/document_processor_service.proto;l=378
   * @return The outputConfig.
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig getOutputConfig();
  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfig output_config = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.documentai.v1beta3.BatchProcessRequest.BatchOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   * @return Whether the inputDocuments field is set.
   */
  boolean hasInputDocuments();
  /**
   * <pre>
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   * @return The inputDocuments.
   */
  com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getInputDocuments();
  /**
   * <pre>
   * The input documents for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig input_documents = 5;</code>
   */
  com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder getInputDocumentsOrBuilder();

  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   * @return Whether the documentOutputConfig field is set.
   */
  boolean hasDocumentOutputConfig();
  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   * @return The documentOutputConfig.
   */
  com.google.cloud.documentai.v1beta3.DocumentOutputConfig getDocumentOutputConfig();
  /**
   * <pre>
   * The overall output config for batch process.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentOutputConfig document_output_config = 6;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentOutputConfigOrBuilder getDocumentOutputConfigOrBuilder();

  /**
   * <pre>
   * Whether Human Review feature should be skipped for this request. Default to
   * false.
   * </pre>
   *
   * <code>bool skip_human_review = 4;</code>
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();
}
