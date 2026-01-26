package com.yocampus.backend;

import com.yocampus.backend.pipeline.decision.PromptComposer;

public class LocalTest {

    public static void main(String[] args) {

        PromptComposer composer = new PromptComposer();

        String prompt = composer.compose(
                "Professor emailed me about homework",
                "medium"
        );

        System.out.println(prompt);
    }
}
