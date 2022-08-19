// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface RoutineSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.RoutineSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the routine.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.RoutineSpec.RoutineType routine_type = 1;</code>
   * @return The enum numeric value on the wire for routineType.
   */
  int getRoutineTypeValue();
  /**
   * <pre>
   * The type of the routine.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.RoutineSpec.RoutineType routine_type = 1;</code>
   * @return The routineType.
   */
  com.google.cloud.datacatalog.v1.RoutineSpec.RoutineType getRoutineType();

  /**
   * <pre>
   * The language the routine is written in. The exact value depends on the
   * source system. For BigQuery routines, possible values are:
   * * `SQL`
   * * `JAVASCRIPT`
   * </pre>
   *
   * <code>string language = 2;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * The language the routine is written in. The exact value depends on the
   * source system. For BigQuery routines, possible values are:
   * * `SQL`
   * * `JAVASCRIPT`
   * </pre>
   *
   * <code>string language = 2;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * Arguments of the routine.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.RoutineSpec.Argument routine_arguments = 3;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.RoutineSpec.Argument> 
      getRoutineArgumentsList();
  /**
   * <pre>
   * Arguments of the routine.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.RoutineSpec.Argument routine_arguments = 3;</code>
   */
  com.google.cloud.datacatalog.v1.RoutineSpec.Argument getRoutineArguments(int index);
  /**
   * <pre>
   * Arguments of the routine.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.RoutineSpec.Argument routine_arguments = 3;</code>
   */
  int getRoutineArgumentsCount();
  /**
   * <pre>
   * Arguments of the routine.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.RoutineSpec.Argument routine_arguments = 3;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.RoutineSpec.ArgumentOrBuilder> 
      getRoutineArgumentsOrBuilderList();
  /**
   * <pre>
   * Arguments of the routine.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.RoutineSpec.Argument routine_arguments = 3;</code>
   */
  com.google.cloud.datacatalog.v1.RoutineSpec.ArgumentOrBuilder getRoutineArgumentsOrBuilder(
      int index);

  /**
   * <pre>
   * Return type of the argument. The exact value depends on the source system
   * and the language.
   * </pre>
   *
   * <code>string return_type = 4;</code>
   * @return The returnType.
   */
  java.lang.String getReturnType();
  /**
   * <pre>
   * Return type of the argument. The exact value depends on the source system
   * and the language.
   * </pre>
   *
   * <code>string return_type = 4;</code>
   * @return The bytes for returnType.
   */
  com.google.protobuf.ByteString
      getReturnTypeBytes();

  /**
   * <pre>
   * The body of the routine.
   * </pre>
   *
   * <code>string definition_body = 5;</code>
   * @return The definitionBody.
   */
  java.lang.String getDefinitionBody();
  /**
   * <pre>
   * The body of the routine.
   * </pre>
   *
   * <code>string definition_body = 5;</code>
   * @return The bytes for definitionBody.
   */
  com.google.protobuf.ByteString
      getDefinitionBodyBytes();

  /**
   * <pre>
   * Fields specific for BigQuery routines.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryRoutineSpec bigquery_routine_spec = 6;</code>
   * @return Whether the bigqueryRoutineSpec field is set.
   */
  boolean hasBigqueryRoutineSpec();
  /**
   * <pre>
   * Fields specific for BigQuery routines.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryRoutineSpec bigquery_routine_spec = 6;</code>
   * @return The bigqueryRoutineSpec.
   */
  com.google.cloud.datacatalog.v1.BigQueryRoutineSpec getBigqueryRoutineSpec();
  /**
   * <pre>
   * Fields specific for BigQuery routines.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryRoutineSpec bigquery_routine_spec = 6;</code>
   */
  com.google.cloud.datacatalog.v1.BigQueryRoutineSpecOrBuilder getBigqueryRoutineSpecOrBuilder();

  public com.google.cloud.datacatalog.v1.RoutineSpec.SystemSpecCase getSystemSpecCase();
}
