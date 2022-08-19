// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface UpdateEntryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdateEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Updates for the entry. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   * <pre>
   * Required. Updates for the entry. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entry.
   */
  com.google.cloud.datacatalog.v1.Entry getEntry();
  /**
   * <pre>
   * Required. Updates for the entry. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.EntryOrBuilder getEntryOrBuilder();

  /**
   * <pre>
   * Names of fields whose values to overwrite on an entry.
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * You can modify only the fields listed below.
   * For entries with type `DATA_STREAM`:
   * * `schema`
   * For entries with type `FILESET`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `gcs_fileset_spec`
   * * `gcs_fileset_spec.file_patterns`
   * For entries with `user_specified_type`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `user_specified_type`
   * * `user_specified_system`
   * * `linked_resource`
   * * `source_system_timestamps`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Names of fields whose values to overwrite on an entry.
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * You can modify only the fields listed below.
   * For entries with type `DATA_STREAM`:
   * * `schema`
   * For entries with type `FILESET`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `gcs_fileset_spec`
   * * `gcs_fileset_spec.file_patterns`
   * For entries with `user_specified_type`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `user_specified_type`
   * * `user_specified_system`
   * * `linked_resource`
   * * `source_system_timestamps`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Names of fields whose values to overwrite on an entry.
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * You can modify only the fields listed below.
   * For entries with type `DATA_STREAM`:
   * * `schema`
   * For entries with type `FILESET`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `gcs_fileset_spec`
   * * `gcs_fileset_spec.file_patterns`
   * For entries with `user_specified_type`:
   * * `schema`
   * * `display_name`
   * * `description`
   * * `user_specified_type`
   * * `user_specified_system`
   * * `linked_resource`
   * * `source_system_timestamps`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
