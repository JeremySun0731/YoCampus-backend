package com.yocampus.backend.domain.input;

import java.util.List;

/**
 * Represents raw input provided by the user.
 *
 * <p>This is the entry object of the system. It captures unstructured text
 * (emails/notifications/messages) and basic user signals (e.g., stress level).</p>
 */
public class UserInput {

    /**
     * Raw user-provided text (email/notification/task description).
     */
    private String rawText;

    /**
     * User's self-reported stress level (e.g. low/medium/high).
     */
    private String stressLevel;

    /**
     * Optional tags for demo or lightweight routing (can be empty/null).
     */
    private List<String> tags;

    public UserInput() {
    }

    public UserInput(String rawText, String stressLevel, List<String> tags) {
        this.rawText = rawText;
        this.stressLevel = stressLevel;
        this.tags = tags;

    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public String getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(String stressLevel) {
        this.stressLevel = stressLevel;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
