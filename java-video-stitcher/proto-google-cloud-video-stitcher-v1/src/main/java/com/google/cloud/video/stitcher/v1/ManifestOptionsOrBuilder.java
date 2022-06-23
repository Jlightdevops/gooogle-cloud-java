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
// source: google/cloud/video/stitcher/v1/sessions.proto

package com.google.cloud.video.stitcher.v1;

public interface ManifestOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.ManifestOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If specified, the output manifest will only return renditions matching the
   * specified filters.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.RenditionFilter include_renditions = 1;</code>
   */
  java.util.List<com.google.cloud.video.stitcher.v1.RenditionFilter> getIncludeRenditionsList();
  /**
   *
   *
   * <pre>
   * If specified, the output manifest will only return renditions matching the
   * specified filters.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.RenditionFilter include_renditions = 1;</code>
   */
  com.google.cloud.video.stitcher.v1.RenditionFilter getIncludeRenditions(int index);
  /**
   *
   *
   * <pre>
   * If specified, the output manifest will only return renditions matching the
   * specified filters.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.RenditionFilter include_renditions = 1;</code>
   */
  int getIncludeRenditionsCount();
  /**
   *
   *
   * <pre>
   * If specified, the output manifest will only return renditions matching the
   * specified filters.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.RenditionFilter include_renditions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.stitcher.v1.RenditionFilterOrBuilder>
      getIncludeRenditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If specified, the output manifest will only return renditions matching the
   * specified filters.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.RenditionFilter include_renditions = 1;</code>
   */
  com.google.cloud.video.stitcher.v1.RenditionFilterOrBuilder getIncludeRenditionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If specified, the output manifest will orders the video and muxed
   * renditions by bitrate according to the ordering policy.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ManifestOptions.OrderPolicy bitrate_order = 2;</code>
   *
   * @return The enum numeric value on the wire for bitrateOrder.
   */
  int getBitrateOrderValue();
  /**
   *
   *
   * <pre>
   * If specified, the output manifest will orders the video and muxed
   * renditions by bitrate according to the ordering policy.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ManifestOptions.OrderPolicy bitrate_order = 2;</code>
   *
   * @return The bitrateOrder.
   */
  com.google.cloud.video.stitcher.v1.ManifestOptions.OrderPolicy getBitrateOrder();
}