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
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface RatingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Rating)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Overall score.
   * </pre>
   *
   * <code>double overall = 1;</code>
   *
   * @return The overall.
   */
  double getOverall();

  /**
   *
   *
   * <pre>
   * The minimum value for the score.
   * </pre>
   *
   * <code>double min = 2;</code>
   *
   * @return The min.
   */
  double getMin();

  /**
   *
   *
   * <pre>
   * The maximum value for the score.
   * </pre>
   *
   * <code>double max = 3;</code>
   *
   * @return The max.
   */
  double getMax();

  /**
   *
   *
   * <pre>
   * The steps within the score (for example, interval = 1 max = 5
   * min = 1 indicates that the score can be 1, 2, 3, 4, or 5)
   * </pre>
   *
   * <code>double interval = 4;</code>
   *
   * @return The interval.
   */
  double getInterval();
}