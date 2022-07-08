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

package com.google.cloud.speech.v1p1beta1.samples;

// [START speech_v1p1beta1_generated_speechclient_longrunningrecognize_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1p1beta1.RecognitionAudio;
import com.google.cloud.speech.v1p1beta1.RecognitionConfig;
import com.google.cloud.speech.v1p1beta1.SpeechClient;
import com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig;

public class AsyncLongRunningRecognizeLRO {

  public static void main(String[] args) throws Exception {
    asyncLongRunningRecognizeLRO();
  }

  public static void asyncLongRunningRecognizeLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SpeechClient speechClient = SpeechClient.create()) {
      LongRunningRecognizeRequest request =
          LongRunningRecognizeRequest.newBuilder()
              .setConfig(RecognitionConfig.newBuilder().build())
              .setAudio(RecognitionAudio.newBuilder().build())
              .setOutputConfig(TranscriptOutputConfig.newBuilder().build())
              .build();
      OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> future =
          speechClient.longRunningRecognizeOperationCallable().futureCall(request);
      // Do something.
      LongRunningRecognizeResponse response = future.get();
    }
  }
}
// [END speech_v1p1beta1_generated_speechclient_longrunningrecognize_lro_async]