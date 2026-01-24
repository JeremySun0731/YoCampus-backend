package com.yocampus.backend.domain.decision;

import com.yocampus.backend.domain.action.ActionItem;

import java.util.List;

public class CampusDecisionResult {
    /**
     * AI-generated summary describing the user's situation.
     */
    private String summary;
    /**
     * List of actions suggested by the AI (preview only).
     */
    private List<ActionItem> suggestedActions;
    /**
     * Confidence score of the AI decision (0.0 - 1.0).
     * May be null if confidence is not provided.
     */
    private Double confidence;//"Descriptive Model" of AI Decision Results
    /**
     * High-level intent of the decision (what the AI is trying to do).
     */
    private DecisionIntent intent;
    /**
     * Default constructor.
     */
    public CampusDecisionResult(){
    }
    /**
     * Creates a new CampusDecisionResult.
     *
     * @param summary AI-generated summary
     * @param suggestedActions list of suggested actions
     * @param confidence confidence score of the decision
     */
    public CampusDecisionResult(String summary,List<ActionItem> suggestedActions,double confidence,DecisionIntent intent){
        this.summary = summary;
        this.suggestedActions = suggestedActions;
        this.confidence = confidence;
        this.intent = intent;
    }
    /**
     * Returns the AI-generated summary.
     *
     * @return summary text
     */
    public String getSummary() {
        return summary;
    }
    /**
     * Sets the AI-generated summary.
     *
     * @param summary summary text
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
    /**
     * Returns the suggested actions.
     *
     * @return list of actions
     */
    public List<ActionItem> getSuggestedActions() {
        return suggestedActions;
    }
    /**
     * Sets the suggested actions.
     *
     * @param suggestedActions list of actions
     */
    public void setSuggestedActions(List<ActionItem> suggestedActions) {
        this.suggestedActions = suggestedActions;
    }
    /**
     * Returns the confidence score.
     *
     * @return confidence score or null if not available
     */
    public Double getConfidence() {
        return confidence;
    }
    /**
     * Sets the confidence score.
     *
     * @param confidence confidence score
     */
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }
    /**
     * Returns the high-level intent of the AI decision.
     *
     * @return decision intent
     */
    public DecisionIntent getIntent() {
        return intent;
    }
    /**
     * Sets the high-level intent of the AI decision.
     *
     * @param intent decision intent
     */
    public void setIntent(DecisionIntent intent) {
        this.intent = intent;
    }
}
