// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/bigquery.proto

package com.google.cloud.datacatalog.v1;

public interface CloudSqlBigQueryConnectionSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cloud SQL instance ID in the format of `project:location:instance`.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * Cloud SQL instance ID in the format of `project:location:instance`.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 2;</code>
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 2;</code>
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString
      getDatabaseBytes();

  /**
   * <pre>
   * Type of the Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.DatabaseType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.DatabaseType type = 3;</code>
   * @return The type.
   */
  com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.DatabaseType getType();
}
