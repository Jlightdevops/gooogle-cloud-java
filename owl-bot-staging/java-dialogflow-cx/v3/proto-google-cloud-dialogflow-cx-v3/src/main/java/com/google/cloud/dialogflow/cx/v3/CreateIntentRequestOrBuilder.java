// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/intent.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to create an intent for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to create an intent for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The intent.
   */
  com.google.cloud.dialogflow.cx.v3.Intent getIntent();
  /**
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder();

  /**
   * <pre>
   * The language of the following fields in `intent`:
   * *   `Intent.training_phrases.parts.text`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language of the following fields in `intent`:
   * *   `Intent.training_phrases.parts.text`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
