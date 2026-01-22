package com.yocampus.backend.domain.context;

import java.time.LocalDateTime;
/**
 * Represents a deadline for an academic task like homework or midterm.
 */
public class Deadline {

    private String title;
    private LocalDateTime dueAt;
    /**
     * Default constructor.
     */
    public Deadline() {

    }

    /**
     * Creates a new Deadline with a title and due date.
     *
     * @param title title of the deadline
     * @param dueAt due date and time
     */
    public Deadline(String title, LocalDateTime dueAt) {
        this.title = title;
        this.dueAt = dueAt;
    }
    /**
     * Returns the title of the deadline.
     *
     * @return deadline title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the title of the deadline.
     *
     * @param title deadline title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Returns the due date and time.
     *
     * @return due date and time
     */
    public LocalDateTime getDueAt() {
        return dueAt;
    }
    /**
     * Sets the due date and time.
     *
     * @param dueAt due date and time
     */
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }
}
