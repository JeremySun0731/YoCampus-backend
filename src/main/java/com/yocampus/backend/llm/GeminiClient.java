package com.yocampus.backend.llm;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GeminiClient {
    private static final String BASE_ENDPOINT =
            "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-pro:generateContent";
    private final HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
    private final String apiKey;
    public GeminiClient(){
        this.apiKey = System.getenv("GEMINI_API_KEY");
        if (this.apiKey == null || this.apiKey.isBlank()) {
            throw new IllegalStateException("Missing env var: GEMINI_API_KEY");
        }
    }
    public String generate(String prompt) {
        String safePrompt = prompt
                .replace("\\", "\\\\")
                .replace("\"", "\\\"");
        String requestBody = """
        {
          "contents": [
            {
              "parts": [
                { "text": "%s" }
              ]
            }
          ]
        }
        """.formatted(safePrompt);
        try {
            String endpoint = BASE_ENDPOINT + "?key=" + apiKey;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .timeout(Duration.ofSeconds(30))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response =
                    httpClient.send(request, HttpResponse.BodyHandlers.ofString()); 

            if (response.statusCode() != 200) {
                throw new RuntimeException("Gemini API error: " + response.statusCode() + " body=" + response.body());
            }

            return response.body();
        } catch (Exception e) {
            throw new RuntimeException("Gemini API call failed", e);
        }
    }
}
