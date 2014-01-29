package com;

/**
 * Created by gianadine on 1/29/14.
 */
public class Course extends UndergradProgram {
    String deptName;
    String courseCode;

    public Course(String deptName, String courseCode) {
        this.deptName = deptName;
        this.courseCode = courseCode;
    }

    public Course(String collegeName, int degreePrograms, String deptName, String courseCode) {
        super(collegeName, degreePrograms);
        this.deptName = deptName;
        this.courseCode = courseCode;
    }

    public Course(String schoolName, String schoolColor, String location, String collegeName, int degreePrograms, String deptName, String courseCode) {
        super(schoolName, schoolColor, location, collegeName, degreePrograms);
        this.deptName = deptName;
        this.courseCode = courseCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void printCourseInfo(){
        System.out.println("This course is offered at " + this.schoolName + " under the " + this.deptName + " department.");
    }
}
