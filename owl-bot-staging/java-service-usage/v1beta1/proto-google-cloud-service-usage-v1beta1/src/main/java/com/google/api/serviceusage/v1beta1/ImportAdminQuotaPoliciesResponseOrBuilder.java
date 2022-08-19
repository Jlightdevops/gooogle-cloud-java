// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

public interface ImportAdminQuotaPoliciesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> 
      getPoliciesList();
  /**
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  com.google.api.serviceusage.v1beta1.AdminQuotaPolicy getPolicies(int index);
  /**
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  int getPoliciesCount();
  /**
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder> 
      getPoliciesOrBuilderList();
  /**
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder getPoliciesOrBuilder(
      int index);
}
