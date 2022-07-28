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
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public interface VolumeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique name for the volume.
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
   * Unique name for the volume.
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
   * Underlying volume type, e.g. 'tmpfs'.
   * </pre>
   *
   * <code>string volume_type = 2;</code>
   *
   * @return The volumeType.
   */
  java.lang.String getVolumeType();
  /**
   *
   *
   * <pre>
   * Underlying volume type, e.g. 'tmpfs'.
   * </pre>
   *
   * <code>string volume_type = 2;</code>
   *
   * @return The bytes for volumeType.
   */
  com.google.protobuf.ByteString getVolumeTypeBytes();

  /**
   *
   *
   * <pre>
   * Volume size in gigabytes.
   * </pre>
   *
   * <code>double size_gb = 3;</code>
   *
   * @return The sizeGb.
   */
  double getSizeGb();
}
