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
// source: google/cloud/automl/v1beta1/geometry.proto

package com.google.cloud.automl.v1beta1;

public interface BoundingPolyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only . The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.NormalizedVertex normalized_vertices = 2;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.NormalizedVertex> getNormalizedVerticesList();
  /**
   *
   *
   * <pre>
   * Output only . The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.NormalizedVertex normalized_vertices = 2;</code>
   */
  com.google.cloud.automl.v1beta1.NormalizedVertex getNormalizedVertices(int index);
  /**
   *
   *
   * <pre>
   * Output only . The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.NormalizedVertex normalized_vertices = 2;</code>
   */
  int getNormalizedVerticesCount();
  /**
   *
   *
   * <pre>
   * Output only . The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.NormalizedVertex normalized_vertices = 2;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.NormalizedVertexOrBuilder>
      getNormalizedVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only . The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.NormalizedVertex normalized_vertices = 2;</code>
   */
  com.google.cloud.automl.v1beta1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}
