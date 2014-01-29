package com;

/**
 * Created by gianadine on 1/29/14.
 */
public class UndergradProgram extends College{
    String collegeName;
    int degreePrograms;

    public UndergradProgram(){

    }

    public UndergradProgram(String collegeName, int degreePrograms) {
        this.collegeName = collegeName;
        this.degreePrograms = degreePrograms;
    }

    public UndergradProgram(String schoolName, String schoolColor, String location, String collegeName, int degreePrograms) {
        super(schoolName, schoolColor, location);
        this.collegeName = collegeName;
        this.degreePrograms = degreePrograms;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getDegreePrograms() {
        return degreePrograms;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setDegreePrograms(int degreePrograms) {
        this.degreePrograms = degreePrograms;
    }

    public void printProgramInfo(){
        System.out.println("This Undergraduate Program is offered at " + this.schoolName + "'s " + this.collegeName + ".");
    }

    public void addCourse(Course course){
        course.schoolName = this.schoolName;
        course.schoolColor = this.schoolColor;
        course.location = this.location;
        course.collegeName = this.collegeName;
        course.degreePrograms = this.degreePrograms;
    }
}
