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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

public interface ErrorResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.ErrorResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Path in the git repo of the erroneous config
   * </pre>
   *
   * <code>string source_path = 1;</code>
   *
   * @return The sourcePath.
   */
  java.lang.String getSourcePath();
  /**
   *
   *
   * <pre>
   * Path in the git repo of the erroneous config
   * </pre>
   *
   * <code>string source_path = 1;</code>
   *
   * @return The bytes for sourcePath.
   */
  com.google.protobuf.ByteString getSourcePathBytes();

  /**
   *
   *
   * <pre>
   * Metadata name of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   *
   *
   * <pre>
   * Metadata name of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Namespace of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_namespace = 3;</code>
   *
   * @return The resourceNamespace.
   */
  java.lang.String getResourceNamespace();
  /**
   *
   *
   * <pre>
   * Namespace of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_namespace = 3;</code>
   *
   * @return The bytes for resourceNamespace.
   */
  com.google.protobuf.ByteString getResourceNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GroupVersionKind resource_gvk = 4;</code>
   *
   * @return Whether the resourceGvk field is set.
   */
  boolean hasResourceGvk();
  /**
   *
   *
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GroupVersionKind resource_gvk = 4;</code>
   *
   * @return The resourceGvk.
   */
  com.google.cloud.gkehub.configmanagement.v1.GroupVersionKind getResourceGvk();
  /**
   *
   *
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GroupVersionKind resource_gvk = 4;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.GroupVersionKindOrBuilder getResourceGvkOrBuilder();
}
