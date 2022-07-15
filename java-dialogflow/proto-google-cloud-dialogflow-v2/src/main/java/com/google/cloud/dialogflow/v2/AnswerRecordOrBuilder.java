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
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

public interface AnswerRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AnswerRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of this answer record.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/answerRecords/&lt;Answer Record ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of this answer record.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/answerRecords/&lt;Answer Record ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2.AnswerRecords.UpdateAnswerRecord] in order to give us feedback about
   * this answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AnswerFeedback answer_feedback = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the answerFeedback field is set.
   */
  boolean hasAnswerFeedback();
  /**
   *
   *
   * <pre>
   * Required. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2.AnswerRecords.UpdateAnswerRecord] in order to give us feedback about
   * this answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AnswerFeedback answer_feedback = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The answerFeedback.
   */
  com.google.cloud.dialogflow.v2.AnswerFeedback getAnswerFeedback();
  /**
   *
   *
   * <pre>
   * Required. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2.AnswerRecords.UpdateAnswerRecord] in order to give us feedback about
   * this answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AnswerFeedback answer_feedback = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.AnswerFeedbackOrBuilder getAnswerFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AgentAssistantRecord agent_assistant_record = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the agentAssistantRecord field is set.
   */
  boolean hasAgentAssistantRecord();
  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AgentAssistantRecord agent_assistant_record = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The agentAssistantRecord.
   */
  com.google.cloud.dialogflow.v2.AgentAssistantRecord getAgentAssistantRecord();
  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AgentAssistantRecord agent_assistant_record = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.AgentAssistantRecordOrBuilder getAgentAssistantRecordOrBuilder();

  public com.google.cloud.dialogflow.v2.AnswerRecord.RecordCase getRecordCase();
}