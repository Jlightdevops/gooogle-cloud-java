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
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

public interface StartEnvironmentMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.shell.v1.StartEnvironmentMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Current state of the environment being started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Current state of the environment being started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.shell.v1.StartEnvironmentMetadata.State getState();
}
