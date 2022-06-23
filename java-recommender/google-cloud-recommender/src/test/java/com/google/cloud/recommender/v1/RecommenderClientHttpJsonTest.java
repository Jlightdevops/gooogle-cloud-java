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

package com.google.cloud.recommender.v1;

import static com.google.cloud.recommender.v1.RecommenderClient.ListInsightsPagedResponse;
import static com.google.cloud.recommender.v1.RecommenderClient.ListRecommendationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.recommender.v1.stub.HttpJsonRecommenderStub;
import com.google.common.collect.Lists;
import com.google.protobuf.Duration;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class RecommenderClientHttpJsonTest {
  private static MockHttpService mockService;
  private static RecommenderClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonRecommenderStub.getMethodDescriptors(),
            RecommenderSettings.getDefaultEndpoint());
    RecommenderSettings settings =
        RecommenderSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                RecommenderSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RecommenderClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void listInsightsTest() throws Exception {
    Insight responsesElement = Insight.newBuilder().build();
    ListInsightsResponse expectedResponse =
        ListInsightsResponse.newBuilder()
            .setNextPageToken("")
            .addAllInsights(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    InsightTypeName parent =
        InsightTypeName.ofProjectLocationInsightTypeName(
            "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]");

    ListInsightsPagedResponse pagedListResponse = client.listInsights(parent);

    List<Insight> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInsightsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listInsightsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InsightTypeName parent =
          InsightTypeName.ofProjectLocationInsightTypeName(
              "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]");
      client.listInsights(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listInsightsTest2() throws Exception {
    Insight responsesElement = Insight.newBuilder().build();
    ListInsightsResponse expectedResponse =
        ListInsightsResponse.newBuilder()
            .setNextPageToken("")
            .addAllInsights(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-8290/locations/location-8290/insightTypes/insightType-8290";

    ListInsightsPagedResponse pagedListResponse = client.listInsights(parent);

    List<Insight> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInsightsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listInsightsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8290/locations/location-8290/insightTypes/insightType-8290";
      client.listInsights(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInsightTest() throws Exception {
    Insight expectedResponse =
        Insight.newBuilder()
            .setName(
                InsightName.ofProjectLocationInsightTypeInsightName(
                        "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllTargetResources(new ArrayList<String>())
            .setInsightSubtype("insightSubtype841535170")
            .setContent(Struct.newBuilder().build())
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setObservationPeriod(Duration.newBuilder().build())
            .setStateInfo(InsightStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedRecommendations(new ArrayList<Insight.RecommendationReference>())
            .build();
    mockService.addResponse(expectedResponse);

    InsightName name =
        InsightName.ofProjectLocationInsightTypeInsightName(
            "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");

    Insight actualResponse = client.getInsight(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getInsightExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InsightName name =
          InsightName.ofProjectLocationInsightTypeInsightName(
              "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
      client.getInsight(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInsightTest2() throws Exception {
    Insight expectedResponse =
        Insight.newBuilder()
            .setName(
                InsightName.ofProjectLocationInsightTypeInsightName(
                        "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllTargetResources(new ArrayList<String>())
            .setInsightSubtype("insightSubtype841535170")
            .setContent(Struct.newBuilder().build())
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setObservationPeriod(Duration.newBuilder().build())
            .setStateInfo(InsightStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedRecommendations(new ArrayList<Insight.RecommendationReference>())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-3636/locations/location-3636/insightTypes/insightType-3636/insights/insight-3636";

    Insight actualResponse = client.getInsight(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getInsightExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-3636/locations/location-3636/insightTypes/insightType-3636/insights/insight-3636";
      client.getInsight(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markInsightAcceptedTest() throws Exception {
    Insight expectedResponse =
        Insight.newBuilder()
            .setName(
                InsightName.ofProjectLocationInsightTypeInsightName(
                        "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllTargetResources(new ArrayList<String>())
            .setInsightSubtype("insightSubtype841535170")
            .setContent(Struct.newBuilder().build())
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setObservationPeriod(Duration.newBuilder().build())
            .setStateInfo(InsightStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedRecommendations(new ArrayList<Insight.RecommendationReference>())
            .build();
    mockService.addResponse(expectedResponse);

    InsightName name =
        InsightName.ofProjectLocationInsightTypeInsightName(
            "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Insight actualResponse = client.markInsightAccepted(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markInsightAcceptedExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InsightName name =
          InsightName.ofProjectLocationInsightTypeInsightName(
              "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markInsightAccepted(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markInsightAcceptedTest2() throws Exception {
    Insight expectedResponse =
        Insight.newBuilder()
            .setName(
                InsightName.ofProjectLocationInsightTypeInsightName(
                        "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllTargetResources(new ArrayList<String>())
            .setInsightSubtype("insightSubtype841535170")
            .setContent(Struct.newBuilder().build())
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setObservationPeriod(Duration.newBuilder().build())
            .setStateInfo(InsightStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedRecommendations(new ArrayList<Insight.RecommendationReference>())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-3636/locations/location-3636/insightTypes/insightType-3636/insights/insight-3636";
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Insight actualResponse = client.markInsightAccepted(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markInsightAcceptedExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-3636/locations/location-3636/insightTypes/insightType-3636/insights/insight-3636";
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markInsightAccepted(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listRecommendationsTest() throws Exception {
    Recommendation responsesElement = Recommendation.newBuilder().build();
    ListRecommendationsResponse expectedResponse =
        ListRecommendationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllRecommendations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    RecommenderName parent =
        RecommenderName.ofProjectLocationRecommenderName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");

    ListRecommendationsPagedResponse pagedListResponse = client.listRecommendations(parent);

    List<Recommendation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRecommendationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listRecommendationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommenderName parent =
          RecommenderName.ofProjectLocationRecommenderName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
      client.listRecommendations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listRecommendationsTest2() throws Exception {
    Recommendation responsesElement = Recommendation.newBuilder().build();
    ListRecommendationsResponse expectedResponse =
        ListRecommendationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllRecommendations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-6437/locations/location-6437/recommenders/recommender-6437";

    ListRecommendationsPagedResponse pagedListResponse = client.listRecommendations(parent);

    List<Recommendation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRecommendationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listRecommendationsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-6437/locations/location-6437/recommenders/recommender-6437";
      client.listRecommendations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listRecommendationsTest3() throws Exception {
    Recommendation responsesElement = Recommendation.newBuilder().build();
    ListRecommendationsResponse expectedResponse =
        ListRecommendationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllRecommendations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    RecommenderName parent =
        RecommenderName.ofProjectLocationRecommenderName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
    String filter = "filter-1274492040";

    ListRecommendationsPagedResponse pagedListResponse = client.listRecommendations(parent, filter);

    List<Recommendation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRecommendationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listRecommendationsExceptionTest3() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommenderName parent =
          RecommenderName.ofProjectLocationRecommenderName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
      String filter = "filter-1274492040";
      client.listRecommendations(parent, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listRecommendationsTest4() throws Exception {
    Recommendation responsesElement = Recommendation.newBuilder().build();
    ListRecommendationsResponse expectedResponse =
        ListRecommendationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllRecommendations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-6437/locations/location-6437/recommenders/recommender-6437";
    String filter = "filter-1274492040";

    ListRecommendationsPagedResponse pagedListResponse = client.listRecommendations(parent, filter);

    List<Recommendation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRecommendationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listRecommendationsExceptionTest4() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-6437/locations/location-6437/recommenders/recommender-6437";
      String filter = "filter-1274492040";
      client.listRecommendations(parent, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getRecommendationTest() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    RecommendationName name =
        RecommendationName.ofProjectLocationRecommenderRecommendationName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");

    Recommendation actualResponse = client.getRecommendation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getRecommendationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommendationName name =
          RecommendationName.ofProjectLocationRecommenderRecommendationName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
      client.getRecommendation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getRecommendationTest2() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";

    Recommendation actualResponse = client.getRecommendation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getRecommendationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
      client.getRecommendation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationClaimedTest() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    RecommendationName name =
        RecommendationName.ofProjectLocationRecommenderRecommendationName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationClaimed(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationClaimedExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommendationName name =
          RecommendationName.ofProjectLocationRecommenderRecommendationName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationClaimed(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationClaimedTest2() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationClaimed(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationClaimedExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationClaimed(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationSucceededTest() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    RecommendationName name =
        RecommendationName.ofProjectLocationRecommenderRecommendationName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationSucceeded(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationSucceededExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommendationName name =
          RecommendationName.ofProjectLocationRecommenderRecommendationName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationSucceeded(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationSucceededTest2() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationSucceeded(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationSucceededExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationSucceeded(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationFailedTest() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    RecommendationName name =
        RecommendationName.ofProjectLocationRecommenderRecommendationName(
            "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationFailed(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationFailedExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecommendationName name =
          RecommendationName.ofProjectLocationRecommenderRecommendationName(
              "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationFailed(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void markRecommendationFailedTest2() throws Exception {
    Recommendation expectedResponse =
        Recommendation.newBuilder()
            .setName(
                RecommendationName.ofProjectLocationRecommenderRecommendationName(
                        "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                    .toString())
            .setDescription("description-1724546052")
            .setRecommenderSubtype("recommenderSubtype1811451601")
            .setLastRefreshTime(Timestamp.newBuilder().build())
            .setPrimaryImpact(Impact.newBuilder().build())
            .addAllAdditionalImpact(new ArrayList<Impact>())
            .setContent(RecommendationContent.newBuilder().build())
            .setStateInfo(RecommendationStateInfo.newBuilder().build())
            .setEtag("etag3123477")
            .addAllAssociatedInsights(new ArrayList<Recommendation.InsightReference>())
            .setXorGroupId("xorGroupId-2095769825")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
    Map<String, String> stateMetadata = new HashMap<>();
    String etag = "etag3123477";

    Recommendation actualResponse = client.markRecommendationFailed(name, stateMetadata, etag);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void markRecommendationFailedExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9152/locations/location-9152/recommenders/recommender-9152/recommendations/recommendation-9152";
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      client.markRecommendationFailed(name, stateMetadata, etag);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}