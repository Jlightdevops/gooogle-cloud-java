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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface GenerateRandomBytesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.GenerateRandomBytesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project-specific location in which to generate random bytes.
   * For example, "projects/my-project/locations/us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The project-specific location in which to generate random bytes.
   * For example, "projects/my-project/locations/us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * The length in bytes of the amount of randomness to retrieve.  Minimum 8
   * bytes, maximum 1024 bytes.
   * </pre>
   *
   * <code>int32 length_bytes = 2;</code>
   *
   * @return The lengthBytes.
   */
  int getLengthBytes();

  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
   * generating the random data. Currently, only
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
   * supported.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
   * generating the random data. Currently, only
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
   * supported.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
   *
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();
}