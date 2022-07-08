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
// source: google/cloud/aiplatform/v1beta1/pipeline_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PipelineJobDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PipelineJobDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The context of the pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_context = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pipelineContext field is set.
   */
  boolean hasPipelineContext();
  /**
   *
   *
   * <pre>
   * Output only. The context of the pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_context = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pipelineContext.
   */
  com.google.cloud.aiplatform.v1beta1.Context getPipelineContext();
  /**
   *
   *
   * <pre>
   * Output only. The context of the pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_context = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ContextOrBuilder getPipelineContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The context of the current pipeline run.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_run_context = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pipelineRunContext field is set.
   */
  boolean hasPipelineRunContext();
  /**
   *
   *
   * <pre>
   * Output only. The context of the current pipeline run.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_run_context = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pipelineRunContext.
   */
  com.google.cloud.aiplatform.v1beta1.Context getPipelineRunContext();
  /**
   *
   *
   * <pre>
   * Output only. The context of the current pipeline run.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Context pipeline_run_context = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ContextOrBuilder getPipelineRunContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The runtime details of the tasks under the pipeline.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail task_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail> getTaskDetailsList();
  /**
   *
   *
   * <pre>
   * Output only. The runtime details of the tasks under the pipeline.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail task_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail getTaskDetails(int index);
  /**
   *
   *
   * <pre>
   * Output only. The runtime details of the tasks under the pipeline.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail task_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTaskDetailsCount();
  /**
   *
   *
   * <pre>
   * Output only. The runtime details of the tasks under the pipeline.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail task_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PipelineTaskDetailOrBuilder>
      getTaskDetailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The runtime details of the tasks under the pipeline.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail task_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetailOrBuilder getTaskDetailsOrBuilder(
      int index);
}