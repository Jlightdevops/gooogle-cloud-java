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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_text_classification.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTextClassificationProto {
  private AutoMLTextClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nYgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_text_classific"
          + "ation.proto\0228google.cloud.aiplatform.v1."
          + "schema.trainingjob.definition\032\034google/ap"
          + "i/annotations.proto\"\204\001\n\030AutoMlTextClassi"
          + "fication\022h\n\006inputs\030\001 \001(\0132X.google.cloud."
          + "aiplatform.v1.schema.trainingjob.definit"
          + "ion.AutoMlTextClassificationInputs\"5\n\036Au"
          + "toMlTextClassificationInputs\022\023\n\013multi_la"
          + "bel\030\001 \001(\010B\372\002\n<com.google.cloud.aiplatfor"
          + "m.v1.schema.trainingjob.definitionB\035Auto"
          + "MLTextClassificationProtoP\001Zbgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/aiplatf"
          + "orm/v1/schema/trainingjob/definition;def"
          + "inition\252\0028Google.Cloud.AIPlatform.V1.Sch"
          + "ema.TrainingJob.Definition\312\0028Google\\Clou"
          + "d\\AIPlatform\\V1\\Schema\\TrainingJob\\Defin"
          + "ition\352\002>Google::Cloud::AIPlatform::V1::S"
          + "chema::TrainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassification_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor,
            new java.lang.String[] {
              "MultiLabel",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}