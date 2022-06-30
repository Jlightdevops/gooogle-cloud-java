// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/version.proto

package com.google.cloud.dialogflow.cx.v3;

public final class VersionProto {
  private VersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateVersionOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_GetVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_UpdateVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_DeleteVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_LoadVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_LoadVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/cx/v3/version." +
      "proto\022\035google.cloud.dialogflow.cx.v3\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032(google/" +
      "cloud/dialogflow/cx/v3/flow.proto\032#googl" +
      "e/longrunning/operations.proto\032\033google/p" +
      "rotobuf/empty.proto\032 google/protobuf/fie" +
      "ld_mask.proto\032\037google/protobuf/timestamp" +
      ".proto\"Y\n\036CreateVersionOperationMetadata" +
      "\0227\n\007version\030\001 \001(\tB&\372A#\n!dialogflow.googl" +
      "eapis.com/Version\"\316\003\n\007Version\022\014\n\004name\030\001 " +
      "\001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013descri" +
      "ption\030\003 \001(\t\022E\n\014nlu_settings\030\004 \001(\0132*.goog" +
      "le.cloud.dialogflow.cx.v3.NluSettingsB\003\340" +
      "A\003\0224\n\013create_time\030\005 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\022@\n\005state\030\006 \001(\0162,.google" +
      ".cloud.dialogflow.cx.v3.Version.StateB\003\340" +
      "A\003\"F\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RU" +
      "NNING\020\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006FAILED\020\003:~\352A{\n" +
      "!dialogflow.googleapis.com/Version\022Vproj" +
      "ects/{project}/locations/{location}/agen" +
      "ts/{agent}/flows/{flow}/versions/{versio" +
      "n}\"w\n\023ListVersionsRequest\0229\n\006parent\030\001 \001(" +
      "\tB)\340A\002\372A#\022!dialogflow.googleapis.com/Ver" +
      "sion\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 " +
      "\001(\t\"i\n\024ListVersionsResponse\0228\n\010versions\030" +
      "\001 \003(\0132&.google.cloud.dialogflow.cx.v3.Ve" +
      "rsion\022\027\n\017next_page_token\030\002 \001(\t\"L\n\021GetVer" +
      "sionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!dialo" +
      "gflow.googleapis.com/Version\"\217\001\n\024CreateV" +
      "ersionRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!d" +
      "ialogflow.googleapis.com/Version\022<\n\007vers" +
      "ion\030\002 \001(\0132&.google.cloud.dialogflow.cx.v" +
      "3.VersionB\003\340A\002\"\212\001\n\024UpdateVersionRequest\022" +
      "<\n\007version\030\001 \001(\0132&.google.cloud.dialogfl" +
      "ow.cx.v3.VersionB\003\340A\002\0224\n\013update_mask\030\002 \001" +
      "(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"O\n\024D" +
      "eleteVersionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A" +
      "#\n!dialogflow.googleapis.com/Version\"u\n\022" +
      "LoadVersionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#" +
      "\n!dialogflow.googleapis.com/Version\022&\n\036a" +
      "llow_override_agent_resources\030\002 \001(\010\"\263\001\n\026" +
      "CompareVersionsRequest\022?\n\014base_version\030\001" +
      " \001(\tB)\340A\002\372A#\n!dialogflow.googleapis.com/" +
      "Version\022A\n\016target_version\030\002 \001(\tB)\340A\002\372A#\n" +
      "!dialogflow.googleapis.com/Version\022\025\n\rla" +
      "nguage_code\030\003 \001(\t\"\223\001\n\027CompareVersionsRes" +
      "ponse\022!\n\031base_version_content_json\030\001 \001(\t" +
      "\022#\n\033target_version_content_json\030\002 \001(\t\0220\n" +
      "\014compare_time\030\003 \001(\0132\032.google.protobuf.Ti" +
      "mestamp2\342\014\n\010Versions\022\307\001\n\014ListVersions\0222." +
      "google.cloud.dialogflow.cx.v3.ListVersio" +
      "nsRequest\0323.google.cloud.dialogflow.cx.v" +
      "3.ListVersionsResponse\"N\202\323\344\223\002?\022=/v3/{par" +
      "ent=projects/*/locations/*/agents/*/flow" +
      "s/*}/versions\332A\006parent\022\264\001\n\nGetVersion\0220." +
      "google.cloud.dialogflow.cx.v3.GetVersion" +
      "Request\032&.google.cloud.dialogflow.cx.v3." +
      "Version\"L\202\323\344\223\002?\022=/v3/{name=projects/*/lo" +
      "cations/*/agents/*/flows/*/versions/*}\332A" +
      "\004name\022\361\001\n\rCreateVersion\0223.google.cloud.d" +
      "ialogflow.cx.v3.CreateVersionRequest\032\035.g" +
      "oogle.longrunning.Operation\"\213\001\202\323\344\223\002H\"=/v" +
      "3/{parent=projects/*/locations/*/agents/" +
      "*/flows/*}/versions:\007version\332A\016parent,ve" +
      "rsion\312A)\n\007Version\022\036CreateVersionOperatio" +
      "nMetadata\022\332\001\n\rUpdateVersion\0223.google.clo" +
      "ud.dialogflow.cx.v3.UpdateVersionRequest" +
      "\032&.google.cloud.dialogflow.cx.v3.Version" +
      "\"l\202\323\344\223\002P2E/v3/{version.name=projects/*/l" +
      "ocations/*/agents/*/flows/*/versions/*}:" +
      "\007version\332A\023version,update_mask\022\252\001\n\rDelet" +
      "eVersion\0223.google.cloud.dialogflow.cx.v3" +
      ".DeleteVersionRequest\032\026.google.protobuf." +
      "Empty\"L\202\323\344\223\002?*=/v3/{name=projects/*/loca" +
      "tions/*/agents/*/flows/*/versions/*}\332A\004n" +
      "ame\022\350\001\n\013LoadVersion\0221.google.cloud.dialo" +
      "gflow.cx.v3.LoadVersionRequest\032\035.google." +
      "longrunning.Operation\"\206\001\202\323\344\223\002G\"B/v3/{nam" +
      "e=projects/*/locations/*/agents/*/flows/" +
      "*/versions/*}:load:\001*\332A\004name\312A/\n\025google." +
      "protobuf.Empty\022\026google.protobuf.Struct\022\361" +
      "\001\n\017CompareVersions\0225.google.cloud.dialog" +
      "flow.cx.v3.CompareVersionsRequest\0326.goog" +
      "le.cloud.dialogflow.cx.v3.CompareVersion" +
      "sResponse\"o\202\323\344\223\002Z\"U/v3/{base_version=pro" +
      "jects/*/locations/*/agents/*/flows/*/ver" +
      "sions/*}:compareVersions:\001*\332A\014base_versi" +
      "on\032x\312A\031dialogflow.googleapis.com\322AYhttps" +
      "://www.googleapis.com/auth/cloud-platfor" +
      "m,https://www.googleapis.com/auth/dialog" +
      "flowB\300\001\n!com.google.cloud.dialogflow.cx." +
      "v3B\014VersionProtoP\001Z?google.golang.org/ge" +
      "nproto/googleapis/cloud/dialogflow/cx/v3" +
      ";cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.Cx" +
      ".V3\352\002!Google::Cloud::Dialogflow::CX::V3b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateVersionOperationMetadata_descriptor,
        new java.lang.String[] { "Version", });
    internal_static_google_cloud_dialogflow_cx_v3_Version_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_Version_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "NluSettings", "CreateTime", "State", });
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListVersionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_ListVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_ListVersionsResponse_descriptor,
        new java.lang.String[] { "Versions", "NextPageToken", });
    internal_static_google_cloud_dialogflow_cx_v3_GetVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_GetVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_GetVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_CreateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CreateVersionRequest_descriptor,
        new java.lang.String[] { "Parent", "Version", });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_UpdateVersionRequest_descriptor,
        new java.lang.String[] { "Version", "UpdateMask", });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_DeleteVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_cx_v3_LoadVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_LoadVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_LoadVersionRequest_descriptor,
        new java.lang.String[] { "Name", "AllowOverrideAgentResources", });
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsRequest_descriptor,
        new java.lang.String[] { "BaseVersion", "TargetVersion", "LanguageCode", });
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_cx_v3_CompareVersionsResponse_descriptor,
        new java.lang.String[] { "BaseVersionContentJson", "TargetVersionContentJson", "CompareTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.FlowProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
