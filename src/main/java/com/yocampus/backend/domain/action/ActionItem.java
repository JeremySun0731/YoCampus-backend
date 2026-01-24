package com.yocampus.backend.domain.action;

public class ActionItem {
    /**
     * Action type suggested by the AI.
     */
    private String type;
    /**
     * Human-readable description for the user.
     */
    private String label;
    /**
     * Indicates whether user confirmation is required.
     */
    private boolean requiresConfirmation;
    /**
     * Default constructor.
     */
    public ActionItem() {
    }
    /**
     * Creates a new ActionItem.
     *
     * @param type action type suggested by the AI
     * @param label description shown to the user
     * @param requiresConfirmation whether user confirmation is required
     */
    public ActionItem(String type, String label, boolean requiresConfirmation){
        this.type = type;
        this.label = label;
        this.requiresConfirmation = requiresConfirmation;
    }
    /**
     * Returns the action type.
     *
     * @return action type
     */
    public String getType() {
        return type;
    }
    /**
     * Sets the action type.
     *
     * @param type action type
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Returns the user-facing label.
     *
     * @return label text
     */
    public String getLabel() {
        return label;
    }
    /**
     * Sets the user-facing label.
     *
     * @param label label text
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * Indicates whether confirmation is required.
     *
     * @return true if confirmation is required
     */
    public boolean isRequiresConfirmation() {
        return requiresConfirmation;
    }
    /**
     * Sets whether user confirmation is required.
     *
     * @param requiresConfirmation confirmation requirement flag
     */
    public void setRequiresConfirmation(boolean requiresConfirmation) {
        this.requiresConfirmation = requiresConfirmation;
    }
}
