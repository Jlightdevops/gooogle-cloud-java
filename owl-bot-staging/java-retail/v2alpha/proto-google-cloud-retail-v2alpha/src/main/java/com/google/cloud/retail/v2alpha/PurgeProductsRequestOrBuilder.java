// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/purge_config.proto

package com.google.cloud.retail.v2alpha;

public interface PurgeProductsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.PurgeProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the branch under which the products are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the branch under which the products are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/branches/${branchId}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The filter string to specify the products to be deleted with a
   * length limit of 5,000 characters.
   * Empty string filter is not allowed. "*" implies delete all items in a
   * branch.
   * The eligible fields for filtering are:
   * * `availability`: Double quoted
   * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
   * string.
   * * `create_time` : in ISO 8601 "zulu" format.
   * Supported syntax:
   * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z"
   *   * availability = "IN_STOCK"
   * * Conjunctions ("AND")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
   * * Disjunctions ("OR")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
   * * Can support nested queries.
   *   Examples:
   *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
   *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
   * * Filter Limits:
   *   * Filter should not contain more than 6 conditions.
   *   * Max nesting depth should not exceed 2 levels.
   * Examples queries:
   * * Delete back order products created before a timestamp.
   *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Required. The filter string to specify the products to be deleted with a
   * length limit of 5,000 characters.
   * Empty string filter is not allowed. "*" implies delete all items in a
   * branch.
   * The eligible fields for filtering are:
   * * `availability`: Double quoted
   * [Product.availability][google.cloud.retail.v2alpha.Product.availability]
   * string.
   * * `create_time` : in ISO 8601 "zulu" format.
   * Supported syntax:
   * * Comparators ("&gt;", "&lt;", "&gt;=", "&lt;=", "=").
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z"
   *   * availability = "IN_STOCK"
   * * Conjunctions ("AND")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER"
   * * Disjunctions ("OR")
   *   Examples:
   *   * create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "IN_STOCK"
   * * Can support nested queries.
   *   Examples:
   *   * (create_time &lt;= "2015-02-13T17:05:46Z" AND availability = "PREORDER")
   *   OR (create_time &gt;= "2015-02-14T13:03:32Z" AND availability = "IN_STOCK")
   * * Filter Limits:
   *   * Filter should not contain more than 6 conditions.
   *   * Max nesting depth should not exceed 2 levels.
   * Examples queries:
   * * Delete back order products created before a timestamp.
   *   create_time &lt;= "2015-02-13T17:05:46Z" OR availability = "BACKORDER"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Actually perform the purge.
   * If `force` is set to false, the method will return the expected purge count
   * without deleting any products.
   * </pre>
   *
   * <code>bool force = 3;</code>
   * @return The force.
   */
  boolean getForce();
}
