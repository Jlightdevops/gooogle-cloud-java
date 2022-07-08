/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.documentai.v1beta3.stub;

import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListProcessorsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.documentai.v1beta3.BatchProcessMetadata;
import com.google.cloud.documentai.v1beta3.BatchProcessRequest;
import com.google.cloud.documentai.v1beta3.BatchProcessResponse;
import com.google.cloud.documentai.v1beta3.CreateProcessorRequest;
import com.google.cloud.documentai.v1beta3.DeleteProcessorMetadata;
import com.google.cloud.documentai.v1beta3.DeleteProcessorRequest;
import com.google.cloud.documentai.v1beta3.DisableProcessorMetadata;
import com.google.cloud.documentai.v1beta3.DisableProcessorRequest;
import com.google.cloud.documentai.v1beta3.DisableProcessorResponse;
import com.google.cloud.documentai.v1beta3.EnableProcessorMetadata;
import com.google.cloud.documentai.v1beta3.EnableProcessorRequest;
import com.google.cloud.documentai.v1beta3.EnableProcessorResponse;
import com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest;
import com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse;
import com.google.cloud.documentai.v1beta3.ListProcessorsRequest;
import com.google.cloud.documentai.v1beta3.ListProcessorsResponse;
import com.google.cloud.documentai.v1beta3.ProcessRequest;
import com.google.cloud.documentai.v1beta3.ProcessResponse;
import com.google.cloud.documentai.v1beta3.Processor;
import com.google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata;
import com.google.cloud.documentai.v1beta3.ReviewDocumentRequest;
import com.google.cloud.documentai.v1beta3.ReviewDocumentResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the DocumentProcessorService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonDocumentProcessorServiceStub extends DocumentProcessorServiceStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(BatchProcessMetadata.getDescriptor())
          .add(Empty.getDescriptor())
          .add(DisableProcessorMetadata.getDescriptor())
          .add(EnableProcessorMetadata.getDescriptor())
          .add(DeleteProcessorMetadata.getDescriptor())
          .add(ReviewDocumentResponse.getDescriptor())
          .add(EnableProcessorResponse.getDescriptor())
          .add(BatchProcessResponse.getDescriptor())
          .add(DisableProcessorResponse.getDescriptor())
          .add(ReviewDocumentOperationMetadata.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<ProcessRequest, ProcessResponse>
      processDocumentMethodDescriptor =
          ApiMethodDescriptor.<ProcessRequest, ProcessResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ProcessDocument")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ProcessRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:process",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProcessResponse>newBuilder()
                      .setDefaultInstance(ProcessResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<BatchProcessRequest, Operation>
      batchProcessDocumentsMethodDescriptor =
          ApiMethodDescriptor.<BatchProcessRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/BatchProcessDocuments")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<BatchProcessRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:batchProcess",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<BatchProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<BatchProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (BatchProcessRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesMethodDescriptor =
          ApiMethodDescriptor.<FetchProcessorTypesRequest, FetchProcessorTypesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/FetchProcessorTypes")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<FetchProcessorTypesRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}:fetchProcessorTypes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<FetchProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<FetchProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<FetchProcessorTypesResponse>newBuilder()
                      .setDefaultInstance(FetchProcessorTypesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListProcessorsRequest, ListProcessorsResponse>
      listProcessorsMethodDescriptor =
          ApiMethodDescriptor.<ListProcessorsRequest, ListProcessorsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ListProcessors")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListProcessorsRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}/processors",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListProcessorsResponse>newBuilder()
                      .setDefaultInstance(ListProcessorsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateProcessorRequest, Processor>
      createProcessorMethodDescriptor =
          ApiMethodDescriptor.<CreateProcessorRequest, Processor>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/CreateProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}/processors",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("processor", request.getProcessor()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Processor>newBuilder()
                      .setDefaultInstance(Processor.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteProcessorRequest, Operation>
      deleteProcessorMethodDescriptor =
          ApiMethodDescriptor.<DeleteProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DeleteProcessor")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<EnableProcessorRequest, Operation>
      enableProcessorMethodDescriptor =
          ApiMethodDescriptor.<EnableProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/EnableProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<EnableProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:enable",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<EnableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<EnableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (EnableProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DisableProcessorRequest, Operation>
      disableProcessorMethodDescriptor =
          ApiMethodDescriptor.<DisableProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DisableProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DisableProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:disable",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DisableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DisableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DisableProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ReviewDocumentRequest, Operation>
      reviewDocumentMethodDescriptor =
          ApiMethodDescriptor.<ReviewDocumentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ReviewDocument")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ReviewDocumentRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{humanReviewConfig=projects/*/locations/*/processors/*/humanReviewConfig}:reviewDocument",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ReviewDocumentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "humanReviewConfig", request.getHumanReviewConfig());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ReviewDocumentRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearHumanReviewConfig().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ReviewDocumentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private final UnaryCallable<ProcessRequest, ProcessResponse> processDocumentCallable;
  private final UnaryCallable<BatchProcessRequest, Operation> batchProcessDocumentsCallable;
  private final OperationCallable<BatchProcessRequest, BatchProcessResponse, BatchProcessMetadata>
      batchProcessDocumentsOperationCallable;
  private final UnaryCallable<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesCallable;
  private final UnaryCallable<ListProcessorsRequest, ListProcessorsResponse> listProcessorsCallable;
  private final UnaryCallable<ListProcessorsRequest, ListProcessorsPagedResponse>
      listProcessorsPagedCallable;
  private final UnaryCallable<CreateProcessorRequest, Processor> createProcessorCallable;
  private final UnaryCallable<DeleteProcessorRequest, Operation> deleteProcessorCallable;
  private final OperationCallable<DeleteProcessorRequest, Empty, DeleteProcessorMetadata>
      deleteProcessorOperationCallable;
  private final UnaryCallable<EnableProcessorRequest, Operation> enableProcessorCallable;
  private final OperationCallable<
          EnableProcessorRequest, EnableProcessorResponse, EnableProcessorMetadata>
      enableProcessorOperationCallable;
  private final UnaryCallable<DisableProcessorRequest, Operation> disableProcessorCallable;
  private final OperationCallable<
          DisableProcessorRequest, DisableProcessorResponse, DisableProcessorMetadata>
      disableProcessorOperationCallable;
  private final UnaryCallable<ReviewDocumentRequest, Operation> reviewDocumentCallable;
  private final OperationCallable<
          ReviewDocumentRequest, ReviewDocumentResponse, ReviewDocumentOperationMetadata>
      reviewDocumentOperationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonDocumentProcessorServiceStub create(
      DocumentProcessorServiceStubSettings settings) throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDocumentProcessorServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(
        DocumentProcessorServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonDocumentProcessorServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(
        DocumentProcessorServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonDocumentProcessorServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDocumentProcessorServiceStub(
      DocumentProcessorServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonDocumentProcessorServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonDocumentProcessorServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDocumentProcessorServiceStub(
      DocumentProcessorServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(clientContext, callableFactory, typeRegistry);

    HttpJsonCallSettings<ProcessRequest, ProcessResponse> processDocumentTransportSettings =
        HttpJsonCallSettings.<ProcessRequest, ProcessResponse>newBuilder()
            .setMethodDescriptor(processDocumentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<BatchProcessRequest, Operation> batchProcessDocumentsTransportSettings =
        HttpJsonCallSettings.<BatchProcessRequest, Operation>newBuilder()
            .setMethodDescriptor(batchProcessDocumentsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
        fetchProcessorTypesTransportSettings =
            HttpJsonCallSettings
                .<FetchProcessorTypesRequest, FetchProcessorTypesResponse>newBuilder()
                .setMethodDescriptor(fetchProcessorTypesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListProcessorsRequest, ListProcessorsResponse>
        listProcessorsTransportSettings =
            HttpJsonCallSettings.<ListProcessorsRequest, ListProcessorsResponse>newBuilder()
                .setMethodDescriptor(listProcessorsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<CreateProcessorRequest, Processor> createProcessorTransportSettings =
        HttpJsonCallSettings.<CreateProcessorRequest, Processor>newBuilder()
            .setMethodDescriptor(createProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DeleteProcessorRequest, Operation> deleteProcessorTransportSettings =
        HttpJsonCallSettings.<DeleteProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<EnableProcessorRequest, Operation> enableProcessorTransportSettings =
        HttpJsonCallSettings.<EnableProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(enableProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DisableProcessorRequest, Operation> disableProcessorTransportSettings =
        HttpJsonCallSettings.<DisableProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(disableProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ReviewDocumentRequest, Operation> reviewDocumentTransportSettings =
        HttpJsonCallSettings.<ReviewDocumentRequest, Operation>newBuilder()
            .setMethodDescriptor(reviewDocumentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.processDocumentCallable =
        callableFactory.createUnaryCallable(
            processDocumentTransportSettings, settings.processDocumentSettings(), clientContext);
    this.batchProcessDocumentsCallable =
        callableFactory.createUnaryCallable(
            batchProcessDocumentsTransportSettings,
            settings.batchProcessDocumentsSettings(),
            clientContext);
    this.batchProcessDocumentsOperationCallable =
        callableFactory.createOperationCallable(
            batchProcessDocumentsTransportSettings,
            settings.batchProcessDocumentsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.fetchProcessorTypesCallable =
        callableFactory.createUnaryCallable(
            fetchProcessorTypesTransportSettings,
            settings.fetchProcessorTypesSettings(),
            clientContext);
    this.listProcessorsCallable =
        callableFactory.createUnaryCallable(
            listProcessorsTransportSettings, settings.listProcessorsSettings(), clientContext);
    this.listProcessorsPagedCallable =
        callableFactory.createPagedCallable(
            listProcessorsTransportSettings, settings.listProcessorsSettings(), clientContext);
    this.createProcessorCallable =
        callableFactory.createUnaryCallable(
            createProcessorTransportSettings, settings.createProcessorSettings(), clientContext);
    this.deleteProcessorCallable =
        callableFactory.createUnaryCallable(
            deleteProcessorTransportSettings, settings.deleteProcessorSettings(), clientContext);
    this.deleteProcessorOperationCallable =
        callableFactory.createOperationCallable(
            deleteProcessorTransportSettings,
            settings.deleteProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.enableProcessorCallable =
        callableFactory.createUnaryCallable(
            enableProcessorTransportSettings, settings.enableProcessorSettings(), clientContext);
    this.enableProcessorOperationCallable =
        callableFactory.createOperationCallable(
            enableProcessorTransportSettings,
            settings.enableProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.disableProcessorCallable =
        callableFactory.createUnaryCallable(
            disableProcessorTransportSettings, settings.disableProcessorSettings(), clientContext);
    this.disableProcessorOperationCallable =
        callableFactory.createOperationCallable(
            disableProcessorTransportSettings,
            settings.disableProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.reviewDocumentCallable =
        callableFactory.createUnaryCallable(
            reviewDocumentTransportSettings, settings.reviewDocumentSettings(), clientContext);
    this.reviewDocumentOperationCallable =
        callableFactory.createOperationCallable(
            reviewDocumentTransportSettings,
            settings.reviewDocumentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(processDocumentMethodDescriptor);
    methodDescriptors.add(batchProcessDocumentsMethodDescriptor);
    methodDescriptors.add(fetchProcessorTypesMethodDescriptor);
    methodDescriptors.add(listProcessorsMethodDescriptor);
    methodDescriptors.add(createProcessorMethodDescriptor);
    methodDescriptors.add(deleteProcessorMethodDescriptor);
    methodDescriptors.add(enableProcessorMethodDescriptor);
    methodDescriptors.add(disableProcessorMethodDescriptor);
    methodDescriptors.add(reviewDocumentMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<ProcessRequest, ProcessResponse> processDocumentCallable() {
    return processDocumentCallable;
  }

  @Override
  public UnaryCallable<BatchProcessRequest, Operation> batchProcessDocumentsCallable() {
    return batchProcessDocumentsCallable;
  }

  @Override
  public OperationCallable<BatchProcessRequest, BatchProcessResponse, BatchProcessMetadata>
      batchProcessDocumentsOperationCallable() {
    return batchProcessDocumentsOperationCallable;
  }

  @Override
  public UnaryCallable<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesCallable() {
    return fetchProcessorTypesCallable;
  }

  @Override
  public UnaryCallable<ListProcessorsRequest, ListProcessorsResponse> listProcessorsCallable() {
    return listProcessorsCallable;
  }

  @Override
  public UnaryCallable<ListProcessorsRequest, ListProcessorsPagedResponse>
      listProcessorsPagedCallable() {
    return listProcessorsPagedCallable;
  }

  @Override
  public UnaryCallable<CreateProcessorRequest, Processor> createProcessorCallable() {
    return createProcessorCallable;
  }

  @Override
  public UnaryCallable<DeleteProcessorRequest, Operation> deleteProcessorCallable() {
    return deleteProcessorCallable;
  }

  @Override
  public OperationCallable<DeleteProcessorRequest, Empty, DeleteProcessorMetadata>
      deleteProcessorOperationCallable() {
    return deleteProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<EnableProcessorRequest, Operation> enableProcessorCallable() {
    return enableProcessorCallable;
  }

  @Override
  public OperationCallable<EnableProcessorRequest, EnableProcessorResponse, EnableProcessorMetadata>
      enableProcessorOperationCallable() {
    return enableProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<DisableProcessorRequest, Operation> disableProcessorCallable() {
    return disableProcessorCallable;
  }

  @Override
  public OperationCallable<
          DisableProcessorRequest, DisableProcessorResponse, DisableProcessorMetadata>
      disableProcessorOperationCallable() {
    return disableProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<ReviewDocumentRequest, Operation> reviewDocumentCallable() {
    return reviewDocumentCallable;
  }

  @Override
  public OperationCallable<
          ReviewDocumentRequest, ReviewDocumentResponse, ReviewDocumentOperationMetadata>
      reviewDocumentOperationCallable() {
    return reviewDocumentOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}