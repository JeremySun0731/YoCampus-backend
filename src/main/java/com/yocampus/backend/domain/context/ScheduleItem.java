package com.yocampus.backend.domain.context;

import java.time.LocalDateTime;

/**
 * Represents a scheduled time-based item such as a class, meeting, or event.
 */
public class ScheduleItem {


    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    /**
     * Default constructor.
     * Required for frameworks and serialization.
     */
    public ScheduleItem() {
    }

    /**
     * Creates a new ScheduleItem with a title, start time, and end time.
     *
     * @param title title of the schedule item
     * @param startTime start date and time
     * @param endTime end date and time
     */
    public ScheduleItem(String title, LocalDateTime startTime, LocalDateTime endTime) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Returns the title of the schedule item.
     *
     * @return schedule item title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the schedule item.
     *
     * @param title schedule item title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the start time.
     *
     * @return start date and time
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time.
     *
     * @param startTime start date and time
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Returns the end time.
     *
     * @return end date and time
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the end time.
     *
     * @param endTime end date and time
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
