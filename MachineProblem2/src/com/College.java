package com;

/**
 * Created by gianadine on 1/29/14.
 */
public class College {
    String schoolName;
    String schoolColor;
    String location;

    public College() {

    }

    public College(String schoolName, String schoolColor, String location) {
        this.schoolName = schoolName;
        this.schoolColor = schoolColor;
        this.location = location;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolColor() {
        return schoolColor;
    }

    public String getLocation() {
        return location;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolColor(String schoolColor) {
        this.schoolColor = schoolColor;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void printCollegeInfo(){
        System.out.println("School: " + this.schoolName);
        System.out.println("Color: " + this.schoolColor);
        System.out.println("Location: " + this.location);
    }

    public void addProgram(UndergradProgram program){
        program.schoolName = this.schoolName;
        program.schoolColor = this.schoolColor;
        program.location = this.location;
    }
}
