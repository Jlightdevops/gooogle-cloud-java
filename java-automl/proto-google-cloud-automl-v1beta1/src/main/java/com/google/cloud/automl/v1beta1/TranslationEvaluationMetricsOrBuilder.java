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
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

public interface TranslationEvaluationMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. BLEU score.
   * </pre>
   *
   * <code>double bleu_score = 1;</code>
   *
   * @return The bleuScore.
   */
  double getBleuScore();

  /**
   *
   *
   * <pre>
   * Output only. BLEU score for base model.
   * </pre>
   *
   * <code>double base_bleu_score = 2;</code>
   *
   * @return The baseBleuScore.
   */
  double getBaseBleuScore();
}
