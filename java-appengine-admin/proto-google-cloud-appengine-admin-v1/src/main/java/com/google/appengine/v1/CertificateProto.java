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
// source: google/appengine/v1/certificate.proto

package com.google.appengine.v1;

public final class CertificateProto {
  private CertificateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_AuthorizedCertificate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_AuthorizedCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_CertificateRawData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_CertificateRawData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ManagedCertificate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ManagedCertificate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/appengine/v1/certificate.proto\022"
          + "\023google.appengine.v1\032\037google/protobuf/ti"
          + "mestamp.proto\"\333\002\n\025AuthorizedCertificate\022"
          + "\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022\024\n\014display_nam"
          + "e\030\003 \001(\t\022\024\n\014domain_names\030\004 \003(\t\022/\n\013expire_"
          + "time\030\005 \001(\0132\032.google.protobuf.Timestamp\022E"
          + "\n\024certificate_raw_data\030\006 \001(\0132\'.google.ap"
          + "pengine.v1.CertificateRawData\022D\n\023managed"
          + "_certificate\030\007 \001(\0132\'.google.appengine.v1"
          + ".ManagedCertificate\022\037\n\027visible_domain_ma"
          + "ppings\030\010 \003(\t\022\035\n\025domain_mappings_count\030\t "
          + "\001(\005\"E\n\022CertificateRawData\022\032\n\022public_cert"
          + "ificate\030\001 \001(\t\022\023\n\013private_key\030\002 \001(\t\"\202\001\n\022M"
          + "anagedCertificate\0225\n\021last_renewal_time\030\001"
          + " \001(\0132\032.google.protobuf.Timestamp\0225\n\006stat"
          + "us\030\002 \001(\0162%.google.appengine.v1.Managemen"
          + "tStatus*\306\001\n\020ManagementStatus\022!\n\035MANAGEME"
          + "NT_STATUS_UNSPECIFIED\020\000\022\006\n\002OK\020\001\022\013\n\007PENDI"
          + "NG\020\002\022\037\n\033FAILED_RETRYING_NOT_VISIBLE\020\004\022\024\n"
          + "\020FAILED_PERMANENT\020\006\022!\n\035FAILED_RETRYING_C"
          + "AA_FORBIDDEN\020\007\022 \n\034FAILED_RETRYING_CAA_CH"
          + "ECKING\020\010B\302\001\n\027com.google.appengine.v1B\020Ce"
          + "rtificateProtoP\001Z<google.golang.org/genp"
          + "roto/googleapis/appengine/v1;appengine\252\002"
          + "\031Google.Cloud.AppEngine.V1\312\002\031Google\\Clou"
          + "d\\AppEngine\\V1\352\002\034Google::Cloud::AppEngin"
          + "e::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_AuthorizedCertificate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_AuthorizedCertificate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_AuthorizedCertificate_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "DisplayName",
              "DomainNames",
              "ExpireTime",
              "CertificateRawData",
              "ManagedCertificate",
              "VisibleDomainMappings",
              "DomainMappingsCount",
            });
    internal_static_google_appengine_v1_CertificateRawData_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_CertificateRawData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_CertificateRawData_descriptor,
            new java.lang.String[] {
              "PublicCertificate", "PrivateKey",
            });
    internal_static_google_appengine_v1_ManagedCertificate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_ManagedCertificate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ManagedCertificate_descriptor,
            new java.lang.String[] {
              "LastRenewalTime", "Status",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}