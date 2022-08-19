// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface DeletePredictionApiKeyRegistrationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The API key to unregister including full resource path.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store/predictionApiKeyRegistrations/&lt;YOUR_API_KEY&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The API key to unregister including full resource path.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/eventStores/default_event_store/predictionApiKeyRegistrations/&lt;YOUR_API_KEY&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
