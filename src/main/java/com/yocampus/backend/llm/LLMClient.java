package com.yocampus.backend.llm;

public interface LLMClient {
    /**
     * Sends prompt to LLM and returns raw response text.
     */
    String generate(String prompt);
}
