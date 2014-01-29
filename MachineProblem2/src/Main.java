/**
 * Created by gianadine on 1/29/14.
 */

import com.*;

public class Main {
    public static void main(String[] args){
        College DLSU = new College("De La Salle University", "Green", "Manila");
        UndergradProgram Engineering = new UndergradProgram("Gokongwei College of Engineering", 12);
        UndergradProgram Business = new UndergradProgram("Ramon V. Del Rosario College of Business", 9);
        Course CompEng = new Course("Computer Engineering", "CPE");

        System.out.println("===College Information===");
        DLSU.printCollegeInfo();

        System.out.println("===*Add Business and Engineering programs to DLSU*===");
        DLSU.addProgram(Business);
        DLSU.addProgram(Engineering);

        System.out.println("===Program Information===");
        System.out.print("Business - ");
        Business.printProgramInfo();
        System.out.print("Engineering - ");
        Engineering.printProgramInfo();

        System.out.println("===*Add CPE course to Engineering program*===");
        Engineering.addCourse(CompEng);

        System.out.println("===Course Information===");
        CompEng.printCourseInfo();
    }
}
