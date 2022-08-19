// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

public interface SyncStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.SyncState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token indicating the state of the repo.
   * </pre>
   *
   * <code>string source_token = 1;</code>
   * @return The sourceToken.
   */
  java.lang.String getSourceToken();
  /**
   * <pre>
   * Token indicating the state of the repo.
   * </pre>
   *
   * <code>string source_token = 1;</code>
   * @return The bytes for sourceToken.
   */
  com.google.protobuf.ByteString
      getSourceTokenBytes();

  /**
   * <pre>
   * Token indicating the state of the importer.
   * </pre>
   *
   * <code>string import_token = 2;</code>
   * @return The importToken.
   */
  java.lang.String getImportToken();
  /**
   * <pre>
   * Token indicating the state of the importer.
   * </pre>
   *
   * <code>string import_token = 2;</code>
   * @return The bytes for importToken.
   */
  com.google.protobuf.ByteString
      getImportTokenBytes();

  /**
   * <pre>
   * Token indicating the state of the syncer.
   * </pre>
   *
   * <code>string sync_token = 3;</code>
   * @return The syncToken.
   */
  java.lang.String getSyncToken();
  /**
   * <pre>
   * Token indicating the state of the syncer.
   * </pre>
   *
   * <code>string sync_token = 3;</code>
   * @return The bytes for syncToken.
   */
  com.google.protobuf.ByteString
      getSyncTokenBytes();

  /**
   * <pre>
   * Deprecated: use last_sync_time instead.
   * Timestamp of when ACM last successfully synced the repo
   * The time format is specified in https://golang.org/pkg/time/#Time.String
   * </pre>
   *
   * <code>string last_sync = 4 [deprecated = true];</code>
   * @deprecated google.cloud.gkehub.configmanagement.v1.SyncState.last_sync is deprecated.
   *     See google/cloud/gkehub/v1/configmanagement/configmanagement.proto;l=305
   * @return The lastSync.
   */
  @java.lang.Deprecated java.lang.String getLastSync();
  /**
   * <pre>
   * Deprecated: use last_sync_time instead.
   * Timestamp of when ACM last successfully synced the repo
   * The time format is specified in https://golang.org/pkg/time/#Time.String
   * </pre>
   *
   * <code>string last_sync = 4 [deprecated = true];</code>
   * @deprecated google.cloud.gkehub.configmanagement.v1.SyncState.last_sync is deprecated.
   *     See google/cloud/gkehub/v1/configmanagement/configmanagement.proto;l=305
   * @return The bytes for lastSync.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getLastSyncBytes();

  /**
   * <pre>
   * Timestamp type of when ACM last successfully synced the repo
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 7;</code>
   * @return Whether the lastSyncTime field is set.
   */
  boolean hasLastSyncTime();
  /**
   * <pre>
   * Timestamp type of when ACM last successfully synced the repo
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 7;</code>
   * @return The lastSyncTime.
   */
  com.google.protobuf.Timestamp getLastSyncTime();
  /**
   * <pre>
   * Timestamp type of when ACM last successfully synced the repo
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastSyncTimeOrBuilder();

  /**
   * <pre>
   * Sync status code
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.SyncState.SyncCode code = 5;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <pre>
   * Sync status code
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.SyncState.SyncCode code = 5;</code>
   * @return The code.
   */
  com.google.cloud.gkehub.configmanagement.v1.SyncState.SyncCode getCode();

  /**
   * <pre>
   * A list of errors resulting from problematic configs.
   * This list will be truncated after 100 errors, although it is
   * unlikely for that many errors to simultaneously exist.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1.SyncError errors = 6;</code>
   */
  java.util.List<com.google.cloud.gkehub.configmanagement.v1.SyncError> 
      getErrorsList();
  /**
   * <pre>
   * A list of errors resulting from problematic configs.
   * This list will be truncated after 100 errors, although it is
   * unlikely for that many errors to simultaneously exist.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1.SyncError errors = 6;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.SyncError getErrors(int index);
  /**
   * <pre>
   * A list of errors resulting from problematic configs.
   * This list will be truncated after 100 errors, although it is
   * unlikely for that many errors to simultaneously exist.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1.SyncError errors = 6;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * A list of errors resulting from problematic configs.
   * This list will be truncated after 100 errors, although it is
   * unlikely for that many errors to simultaneously exist.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1.SyncError errors = 6;</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1.SyncErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * A list of errors resulting from problematic configs.
   * This list will be truncated after 100 errors, although it is
   * unlikely for that many errors to simultaneously exist.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1.SyncError errors = 6;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.SyncErrorOrBuilder getErrorsOrBuilder(
      int index);
}
