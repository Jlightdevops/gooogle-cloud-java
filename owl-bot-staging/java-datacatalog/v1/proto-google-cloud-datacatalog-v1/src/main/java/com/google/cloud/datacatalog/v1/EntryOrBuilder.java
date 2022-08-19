// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface EntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of an entry in URL format.
   * Note: The entry itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of an entry in URL format.
   * Note: The entry itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource this metadata entry refers to.
   * For Google Cloud Platform resources, `linked_resource` is the
   * [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * Output only when the entry is one of the types in the `EntryType` enum.
   * For entries with a `user_specified_type`, this field is optional and
   * defaults to an empty string.
   * The resource string must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), periods (.), colons (:), slashes (/), dashes (-),
   * and hashes (#).
   * The maximum size is 200 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   * <pre>
   * The resource this metadata entry refers to.
   * For Google Cloud Platform resources, `linked_resource` is the
   * [Full Resource Name]
   * (https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * Output only when the entry is one of the types in the `EntryType` enum.
   * For entries with a `user_specified_type`, this field is optional and
   * defaults to an empty string.
   * The resource string must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), periods (.), colons (:), slashes (/), dashes (-),
   * and hashes (#).
   * The maximum size is 200 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString
      getLinkedResourceBytes();

  /**
   * <pre>
   * Fully qualified name (FQN) of the resource. Set automatically for entries
   * representing resources from synced systems. Settable only during creation
   * and read-only afterwards. Can be used for search and lookup of the entries.
   * FQNs take two forms:
   * * For non-regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * * For regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * Example for a DPMS table:
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * </pre>
   *
   * <code>string fully_qualified_name = 29;</code>
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   * <pre>
   * Fully qualified name (FQN) of the resource. Set automatically for entries
   * representing resources from synced systems. Settable only during creation
   * and read-only afterwards. Can be used for search and lookup of the entries.
   * FQNs take two forms:
   * * For non-regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * * For regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * Example for a DPMS table:
   * `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
   * </pre>
   *
   * <code>string fully_qualified_name = 29;</code>
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString
      getFullyQualifiedNameBytes();

  /**
   * <pre>
   * The type of the entry.
   * Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries
   * created in Data Catalog must use the `user_specified_type`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryType type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of the entry.
   * Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries
   * created in Data Catalog must use the `user_specified_type`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the entry.
   * Only used for entries with types listed in the `EntryType` enum.
   * Currently, only `FILESET` enum value is allowed. All other entries
   * created in Data Catalog must use the `user_specified_type`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryType type = 2;</code>
   * @return The type.
   */
  com.google.cloud.datacatalog.v1.EntryType getType();

  /**
   * <pre>
   * Custom entry type that doesn't match any of the values allowed for input
   * and listed in the `EntryType` enum.
   * When creating an entry, first check the type values in the enum.
   * If there are no appropriate types for the new entry,
   * provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   * @return Whether the userSpecifiedType field is set.
   */
  boolean hasUserSpecifiedType();
  /**
   * <pre>
   * Custom entry type that doesn't match any of the values allowed for input
   * and listed in the `EntryType` enum.
   * When creating an entry, first check the type values in the enum.
   * If there are no appropriate types for the new entry,
   * provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   * @return The userSpecifiedType.
   */
  java.lang.String getUserSpecifiedType();
  /**
   * <pre>
   * Custom entry type that doesn't match any of the values allowed for input
   * and listed in the `EntryType` enum.
   * When creating an entry, first check the type values in the enum.
   * If there are no appropriate types for the new entry,
   * provide a custom value, for example, `my_special_type`.
   * The `user_specified_type` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   * @return The bytes for userSpecifiedType.
   */
  com.google.protobuf.ByteString
      getUserSpecifiedTypeBytes();

  /**
   * <pre>
   * Output only. Indicates the entry's source system that Data Catalog
   * integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the integratedSystem field is set.
   */
  boolean hasIntegratedSystem();
  /**
   * <pre>
   * Output only. Indicates the entry's source system that Data Catalog
   * integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for integratedSystem.
   */
  int getIntegratedSystemValue();
  /**
   * <pre>
   * Output only. Indicates the entry's source system that Data Catalog
   * integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The integratedSystem.
   */
  com.google.cloud.datacatalog.v1.IntegratedSystem getIntegratedSystem();

  /**
   * <pre>
   * Indicates the entry's source system that Data Catalog doesn't
   * automatically integrate with.
   * The `user_specified_system` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   * @return Whether the userSpecifiedSystem field is set.
   */
  boolean hasUserSpecifiedSystem();
  /**
   * <pre>
   * Indicates the entry's source system that Data Catalog doesn't
   * automatically integrate with.
   * The `user_specified_system` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   * @return The userSpecifiedSystem.
   */
  java.lang.String getUserSpecifiedSystem();
  /**
   * <pre>
   * Indicates the entry's source system that Data Catalog doesn't
   * automatically integrate with.
   * The `user_specified_system` string has the following limitations:
   * * Is case insensitive.
   * * Must begin with a letter or underscore.
   * * Can only contain letters, numbers, and underscores.
   * * Must be at least 1 character and at most 64 characters long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   * @return The bytes for userSpecifiedSystem.
   */
  com.google.protobuf.ByteString
      getUserSpecifiedSystemBytes();

  /**
   * <pre>
   * Specification that applies to a Cloud Storage fileset. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   * @return Whether the gcsFilesetSpec field is set.
   */
  boolean hasGcsFilesetSpec();
  /**
   * <pre>
   * Specification that applies to a Cloud Storage fileset. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   * @return The gcsFilesetSpec.
   */
  com.google.cloud.datacatalog.v1.GcsFilesetSpec getGcsFilesetSpec();
  /**
   * <pre>
   * Specification that applies to a Cloud Storage fileset. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   */
  com.google.cloud.datacatalog.v1.GcsFilesetSpecOrBuilder getGcsFilesetSpecOrBuilder();

  /**
   * <pre>
   * Specification that applies to a BigQuery table. Valid only for
   * entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   * @return Whether the bigqueryTableSpec field is set.
   */
  boolean hasBigqueryTableSpec();
  /**
   * <pre>
   * Specification that applies to a BigQuery table. Valid only for
   * entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   * @return The bigqueryTableSpec.
   */
  com.google.cloud.datacatalog.v1.BigQueryTableSpec getBigqueryTableSpec();
  /**
   * <pre>
   * Specification that applies to a BigQuery table. Valid only for
   * entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.v1.BigQueryTableSpecOrBuilder getBigqueryTableSpecOrBuilder();

  /**
   * <pre>
   * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD`
   * name pattern.
   * For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;</code>
   * @return Whether the bigqueryDateShardedSpec field is set.
   */
  boolean hasBigqueryDateShardedSpec();
  /**
   * <pre>
   * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD`
   * name pattern.
   * For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;</code>
   * @return The bigqueryDateShardedSpec.
   */
  com.google.cloud.datacatalog.v1.BigQueryDateShardedSpec getBigqueryDateShardedSpec();
  /**
   * <pre>
   * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD`
   * name pattern.
   * For more information, see [Introduction to partitioned tables]
   * (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;</code>
   */
  com.google.cloud.datacatalog.v1.BigQueryDateShardedSpecOrBuilder getBigqueryDateShardedSpecOrBuilder();

  /**
   * <pre>
   * Specification that applies to a table resource. Valid only
   * for entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec database_table_spec = 24;</code>
   * @return Whether the databaseTableSpec field is set.
   */
  boolean hasDatabaseTableSpec();
  /**
   * <pre>
   * Specification that applies to a table resource. Valid only
   * for entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec database_table_spec = 24;</code>
   * @return The databaseTableSpec.
   */
  com.google.cloud.datacatalog.v1.DatabaseTableSpec getDatabaseTableSpec();
  /**
   * <pre>
   * Specification that applies to a table resource. Valid only
   * for entries with the `TABLE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DatabaseTableSpec database_table_spec = 24;</code>
   */
  com.google.cloud.datacatalog.v1.DatabaseTableSpecOrBuilder getDatabaseTableSpecOrBuilder();

  /**
   * <pre>
   * Specification that applies to a data source connection. Valid only
   * for entries with the `DATA_SOURCE_CONNECTION` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSourceConnectionSpec data_source_connection_spec = 27;</code>
   * @return Whether the dataSourceConnectionSpec field is set.
   */
  boolean hasDataSourceConnectionSpec();
  /**
   * <pre>
   * Specification that applies to a data source connection. Valid only
   * for entries with the `DATA_SOURCE_CONNECTION` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSourceConnectionSpec data_source_connection_spec = 27;</code>
   * @return The dataSourceConnectionSpec.
   */
  com.google.cloud.datacatalog.v1.DataSourceConnectionSpec getDataSourceConnectionSpec();
  /**
   * <pre>
   * Specification that applies to a data source connection. Valid only
   * for entries with the `DATA_SOURCE_CONNECTION` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSourceConnectionSpec data_source_connection_spec = 27;</code>
   */
  com.google.cloud.datacatalog.v1.DataSourceConnectionSpecOrBuilder getDataSourceConnectionSpecOrBuilder();

  /**
   * <pre>
   * Specification that applies to a user-defined function or procedure. Valid
   * only for entries with the `ROUTINE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.RoutineSpec routine_spec = 28;</code>
   * @return Whether the routineSpec field is set.
   */
  boolean hasRoutineSpec();
  /**
   * <pre>
   * Specification that applies to a user-defined function or procedure. Valid
   * only for entries with the `ROUTINE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.RoutineSpec routine_spec = 28;</code>
   * @return The routineSpec.
   */
  com.google.cloud.datacatalog.v1.RoutineSpec getRoutineSpec();
  /**
   * <pre>
   * Specification that applies to a user-defined function or procedure. Valid
   * only for entries with the `ROUTINE` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.RoutineSpec routine_spec = 28;</code>
   */
  com.google.cloud.datacatalog.v1.RoutineSpecOrBuilder getRoutineSpecOrBuilder();

  /**
   * <pre>
   * Specification that applies to a fileset resource. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FilesetSpec fileset_spec = 33;</code>
   * @return Whether the filesetSpec field is set.
   */
  boolean hasFilesetSpec();
  /**
   * <pre>
   * Specification that applies to a fileset resource. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FilesetSpec fileset_spec = 33;</code>
   * @return The filesetSpec.
   */
  com.google.cloud.datacatalog.v1.FilesetSpec getFilesetSpec();
  /**
   * <pre>
   * Specification that applies to a fileset resource. Valid only
   * for entries with the `FILESET` type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.FilesetSpec fileset_spec = 33;</code>
   */
  com.google.cloud.datacatalog.v1.FilesetSpecOrBuilder getFilesetSpecOrBuilder();

  /**
   * <pre>
   * Display name of an entry.
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum size is 200 bytes when encoded in UTF-8.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of an entry.
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum size is 200 bytes when encoded in UTF-8.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Entry description that can consist of several sentences or paragraphs
   * that describe entry contents.
   * The description must not contain Unicode non-characters as well as C0
   * and C1 control codes except tabs (HT), new lines (LF), carriage returns
   * (CR), and page breaks (FF).
   * The maximum size is 2000 bytes when encoded in UTF-8.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Entry description that can consist of several sentences or paragraphs
   * that describe entry contents.
   * The description must not contain Unicode non-characters as well as C0
   * and C1 control codes except tabs (HT), new lines (LF), carriage returns
   * (CR), and page breaks (FF).
   * The maximum size is 2000 bytes when encoded in UTF-8.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Business Context of the entry. Not supported for BigQuery datasets
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BusinessContext business_context = 37;</code>
   * @return Whether the businessContext field is set.
   */
  boolean hasBusinessContext();
  /**
   * <pre>
   * Business Context of the entry. Not supported for BigQuery datasets
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BusinessContext business_context = 37;</code>
   * @return The businessContext.
   */
  com.google.cloud.datacatalog.v1.BusinessContext getBusinessContext();
  /**
   * <pre>
   * Business Context of the entry. Not supported for BigQuery datasets
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BusinessContext business_context = 37;</code>
   */
  com.google.cloud.datacatalog.v1.BusinessContextOrBuilder getBusinessContextOrBuilder();

  /**
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Schema schema = 5;</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Schema schema = 5;</code>
   * @return The schema.
   */
  com.google.cloud.datacatalog.v1.Schema getSchema();
  /**
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.v1.SchemaOrBuilder getSchemaOrBuilder();

  /**
   * <pre>
   * Timestamps from the underlying resource, not from the Data Catalog
   * entry.
   * Output only when the entry has a type listed in the `EntryType` enum.
   * For entries with `user_specified_type`, this field is optional and defaults
   * to an empty timestamp.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps source_system_timestamps = 7;</code>
   * @return Whether the sourceSystemTimestamps field is set.
   */
  boolean hasSourceSystemTimestamps();
  /**
   * <pre>
   * Timestamps from the underlying resource, not from the Data Catalog
   * entry.
   * Output only when the entry has a type listed in the `EntryType` enum.
   * For entries with `user_specified_type`, this field is optional and defaults
   * to an empty timestamp.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps source_system_timestamps = 7;</code>
   * @return The sourceSystemTimestamps.
   */
  com.google.cloud.datacatalog.v1.SystemTimestamps getSourceSystemTimestamps();
  /**
   * <pre>
   * Timestamps from the underlying resource, not from the Data Catalog
   * entry.
   * Output only when the entry has a type listed in the `EntryType` enum.
   * For entries with `user_specified_type`, this field is optional and defaults
   * to an empty timestamp.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps source_system_timestamps = 7;</code>
   */
  com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder getSourceSystemTimestampsOrBuilder();

  /**
   * <pre>
   * Output only. Resource usage statistics.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the usageSignal field is set.
   */
  boolean hasUsageSignal();
  /**
   * <pre>
   * Output only. Resource usage statistics.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The usageSignal.
   */
  com.google.cloud.datacatalog.v1.UsageSignal getUsageSignal();
  /**
   * <pre>
   * Output only. Resource usage statistics.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.datacatalog.v1.UsageSignalOrBuilder getUsageSignalOrBuilder();

  /**
   * <pre>
   * Cloud labels attached to the entry.
   * In Data Catalog, you can create and modify labels attached only to custom
   * entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Cloud labels attached to the entry.
   * In Data Catalog, you can create and modify labels attached only to custom
   * entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Cloud labels attached to the entry.
   * In Data Catalog, you can create and modify labels attached only to custom
   * entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Cloud labels attached to the entry.
   * In Data Catalog, you can create and modify labels attached only to custom
   * entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Cloud labels attached to the entry.
   * In Data Catalog, you can create and modify labels attached only to custom
   * entries. Synced entries have unmodifiable labels that come from the source
   * system.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Physical location of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource data_source = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dataSource field is set.
   */
  boolean hasDataSource();
  /**
   * <pre>
   * Output only. Physical location of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource data_source = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataSource.
   */
  com.google.cloud.datacatalog.v1.DataSource getDataSource();
  /**
   * <pre>
   * Output only. Physical location of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource data_source = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.datacatalog.v1.DataSourceOrBuilder getDataSourceOrBuilder();

  /**
   * <pre>
   * Output only. Additional information related to the entry. Private to the current user.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PersonalDetails personal_details = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the personalDetails field is set.
   */
  boolean hasPersonalDetails();
  /**
   * <pre>
   * Output only. Additional information related to the entry. Private to the current user.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PersonalDetails personal_details = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The personalDetails.
   */
  com.google.cloud.datacatalog.v1.PersonalDetails getPersonalDetails();
  /**
   * <pre>
   * Output only. Additional information related to the entry. Private to the current user.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PersonalDetails personal_details = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.datacatalog.v1.PersonalDetailsOrBuilder getPersonalDetailsOrBuilder();

  public com.google.cloud.datacatalog.v1.Entry.EntryTypeCase getEntryTypeCase();

  public com.google.cloud.datacatalog.v1.Entry.SystemCase getSystemCase();

  public com.google.cloud.datacatalog.v1.Entry.TypeSpecCase getTypeSpecCase();

  public com.google.cloud.datacatalog.v1.Entry.SpecCase getSpecCase();
}
