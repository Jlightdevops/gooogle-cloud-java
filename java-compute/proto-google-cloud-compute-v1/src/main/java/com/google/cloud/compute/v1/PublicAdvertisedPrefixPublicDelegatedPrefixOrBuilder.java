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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface PublicAdvertisedPrefixPublicDelegatedPrefixOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IP address range of the public delegated prefix
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return Whether the ipRange field is set.
   */
  boolean hasIpRange();
  /**
   *
   *
   * <pre>
   * The IP address range of the public delegated prefix
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return The ipRange.
   */
  java.lang.String getIpRange();
  /**
   *
   *
   * <pre>
   * The IP address range of the public delegated prefix
   * </pre>
   *
   * <code>optional string ip_range = 145092645;</code>
   *
   * @return The bytes for ipRange.
   */
  com.google.protobuf.ByteString getIpRangeBytes();

  /**
   *
   *
   * <pre>
   * The name of the public delegated prefix
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The name of the public delegated prefix
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the public delegated prefix
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The project number of the public delegated prefix
   * </pre>
   *
   * <code>optional string project = 227560217;</code>
   *
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   *
   *
   * <pre>
   * The project number of the public delegated prefix
   * </pre>
   *
   * <code>optional string project = 227560217;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The project number of the public delegated prefix
   * </pre>
   *
   * <code>optional string project = 227560217;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
