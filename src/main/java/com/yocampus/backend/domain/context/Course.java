package com.yocampus.backend.domain.context;
/**
 * Represents an academic course in the system.
 * A course is identified by a unique course code and has a human-readable name.
 */
public class Course {
    private String courseCode;
    private String courseName;
    /**
     * Default the constructor
     */
    public Course(){
    }
    /**
     * Creates a new Course with the given code and name.
     *
     * @param courseCode unique course identifier
     * @param courseName name of the course
     */
    public Course(String courseCode,String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    /**
     * Returns the course code.
     *
     * @return course code
     */
    public String getCourseCode() {
        return courseCode;
    }
    /**
     * Sets the course code.
     *
     * @param courseCode set up each course code
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    /**
     * Returns the course name.
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }
    /**
     * Sets the course name.
     * @param courseName name of the course
     * */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
