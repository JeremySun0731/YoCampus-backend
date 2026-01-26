package com.yocampus.backend.pipeline.decision;

import com.yocampus.backend.domain.decision.DecisionIntent;
public class PromptComposer {
    public String compose(String rawText, String stressLevel){
        String safeText = rawText == null ? "" : rawText;
        String safeStress = (stressLevel == null || stressLevel.isBlank())
                ? "unknown"
                : stressLevel;

        return """
            You are Campus Buddy, an AI assistant for students.

            Return ONLY valid JSON. No markdown. No explanations.

            JSON format:
            {
              "summary": "string",
              "intent": "CREATE_TASK | DRAFT_REPLY | SCHEDULE_EVENT | NO_ACTION",
              "suggestedActions": [
                {
                  "type": "string",
                  "label": "string",
                  "requiresConfirmation": true,
                  "reason": "string"
                }
              ],
              "confidence": 0.0
            }

            Student stress level: %s
            Student message:
            %s
            """.formatted(safeStress, safeText);
    }
}
