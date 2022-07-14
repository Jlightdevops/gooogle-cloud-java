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
// source: google/cloud/automl/v1/text_segment.proto

package com.google.cloud.automl.v1;

public final class TextSegmentProto {
  private TextSegmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/automl/v1/text_segment.pr"
          + "oto\022\026google.cloud.automl.v1\"H\n\013TextSegme"
          + "nt\022\017\n\007content\030\003 \001(\t\022\024\n\014start_offset\030\001 \001("
          + "\003\022\022\n\nend_offset\030\002 \001(\003B\274\001\n\032com.google.clo"
          + "ud.automl.v1B\020TextSegmentProtoP\001Z<google"
          + ".golang.org/genproto/googleapis/cloud/au"
          + "toml/v1;automl\252\002\026Google.Cloud.AutoML.V1\312"
          + "\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud"
          + "::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1_TextSegment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_TextSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSegment_descriptor,
            new java.lang.String[] {
              "Content", "StartOffset", "EndOffset",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
