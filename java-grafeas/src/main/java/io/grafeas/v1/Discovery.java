/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/discovery.proto

package io.grafeas.v1;

public final class Discovery {
  private Discovery() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_DiscoveryNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_DiscoveryNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_DiscoveryOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_DiscoveryOccurrence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\032grafeas/v1/discovery.proto\022\ngrafeas.v1"
          + "\032\037google/api/field_behavior.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\027google/rpc/s"
          + "tatus.proto\032\027grafeas/v1/common.proto\"<\n\r"
          + "DiscoveryNote\022+\n\ranalysis_kind\030\001 \001(\0162\024.g"
          + "rafeas.v1.NoteKind\"\303\004\n\023DiscoveryOccurren"
          + "ce\022O\n\023continuous_analysis\030\001 \001(\01622.grafea"
          + "s.v1.DiscoveryOccurrence.ContinuousAnaly"
          + "sis\022G\n\017analysis_status\030\002 \001(\0162..grafeas.v"
          + "1.DiscoveryOccurrence.AnalysisStatus\0221\n\025"
          + "analysis_status_error\030\003 \001(\0132\022.google.rpc"
          + ".Status\022\013\n\003cpe\030\004 \001(\t\0222\n\016last_scan_time\030\005"
          + " \001(\0132\032.google.protobuf.Timestamp\0225\n\014arch"
          + "ive_time\030\006 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\"S\n\022ContinuousAnalysis\022#\n\037CONTINU"
          + "OUS_ANALYSIS_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014"
          + "\n\010INACTIVE\020\002\"\221\001\n\016AnalysisStatus\022\037\n\033ANALY"
          + "SIS_STATUS_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\014\n"
          + "\010SCANNING\020\002\022\024\n\020FINISHED_SUCCESS\020\003\022\023\n\017FIN"
          + "ISHED_FAILED\020\004\022\030\n\024FINISHED_UNSUPPORTED\020\005"
          + "BQ\n\rio.grafeas.v1P\001Z8google.golang.org/g"
          + "enproto/googleapis/grafeas/v1;grafeas\242\002\003"
          + "GRAb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              io.grafeas.v1.Common.getDescriptor(),
            });
    internal_static_grafeas_v1_DiscoveryNote_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_DiscoveryNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_DiscoveryNote_descriptor,
            new java.lang.String[] {
              "AnalysisKind",
            });
    internal_static_grafeas_v1_DiscoveryOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_DiscoveryOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_DiscoveryOccurrence_descriptor,
            new java.lang.String[] {
              "ContinuousAnalysis",
              "AnalysisStatus",
              "AnalysisStatusError",
              "Cpe",
              "LastScanTime",
              "ArchiveTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    io.grafeas.v1.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
