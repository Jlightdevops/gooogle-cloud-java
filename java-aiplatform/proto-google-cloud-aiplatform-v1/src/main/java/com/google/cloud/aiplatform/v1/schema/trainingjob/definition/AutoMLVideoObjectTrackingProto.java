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
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_object_tracking.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLVideoObjectTrackingProto {
  private AutoMLVideoObjectTrackingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n[google/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_video_object_t"
          + "racking.proto\0228google.cloud.aiplatform.v"
          + "1.schema.trainingjob.definition\032\034google/"
          + "api/annotations.proto\"\206\001\n\031AutoMlVideoObj"
          + "ectTracking\022i\n\006inputs\030\001 \001(\0132Y.google.clo"
          + "ud.aiplatform.v1.schema.trainingjob.defi"
          + "nition.AutoMlVideoObjectTrackingInputs\"\345"
          + "\002\n\037AutoMlVideoObjectTrackingInputs\022w\n\nmo"
          + "del_type\030\001 \001(\0162c.google.cloud.aiplatform"
          + ".v1.schema.trainingjob.definition.AutoMl"
          + "VideoObjectTrackingInputs.ModelType\"\310\001\n\t"
          + "ModelType\022\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005CLOUD\020\001\022\026\n\022MOBILE_VERSATILE_1\020\002\022\034\n\030MOBI"
          + "LE_CORAL_VERSATILE_1\020\003\022\036\n\032MOBILE_CORAL_L"
          + "OW_LATENCY_1\020\004\022\035\n\031MOBILE_JETSON_VERSATIL"
          + "E_1\020\005\022\037\n\033MOBILE_JETSON_LOW_LATENCY_1\020\006B\373"
          + "\002\n<com.google.cloud.aiplatform.v1.schema"
          + ".trainingjob.definitionB\036AutoMLVideoObje"
          + "ctTrackingProtoP\001Zbgoogle.golang.org/gen"
          + "proto/googleapis/cloud/aiplatform/v1/sch"
          + "ema/trainingjob/definition;definition\252\0028"
          + "Google.Cloud.AIPlatform.V1.Schema.Traini"
          + "ngJob.Definition\312\0028Google\\Cloud\\AIPlatfo"
          + "rm\\V1\\Schema\\TrainingJob\\Definition\352\002>Go"
          + "ogle::Cloud::AIPlatform::V1::Schema::Tra"
          + "iningJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}