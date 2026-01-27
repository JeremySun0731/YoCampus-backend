package com.yocampus.backend.llm;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Simple client for calling the Gemini API.
 */
public class GeminiClient {

    // Gemini API key
    private static final String API_KEY = "YOUR_API_KEY";

    // Gemini API endpoint
    private static final String ENDPOINT =
            "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-pro:generateContent?key=" + API_KEY;

    // HTTP client
    private final HttpClient httpClient = HttpClient.newHttpClient();

    /**
     * Sends a prompt to Gemini and returns the response.
     *
     * @param prompt text prompt
     * @return API response as JSON string
     */
    public String generate(String prompt) {

        // Request body for Gemini API
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
        """.formatted(prompt.replace("\"", "\\\""));

        try {
            // Build HTTP request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(ENDPOINT))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            // Send request
            HttpResponse<String> response =
                    httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Return response body
            return response.body();

        } catch (Exception e) {
            throw new RuntimeException("Gemini API call failed", e);
        }
    }
}
