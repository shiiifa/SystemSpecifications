package ASIS;

import java.util.ArrayList;

public class CourseSelectionPanel {
    ArrayList<String>year1Courses= new ArrayList<>();
    ArrayList<String>year2Courses= new ArrayList<>();
    ArrayList<String>year3Courses= new ArrayList<>();
    ArrayList<String>year4Courses= new ArrayList<>();
    ArrayList<String>additionalCourses= new ArrayList<>();


    public ArrayList<String> getYear1Courses() {
        return year1Courses;
    }

    public void setYear1Courses(ArrayList<String> year1Courses) {
        this.year1Courses = year1Courses;
    }

    public ArrayList<String> getYear2Courses() {
        return year2Courses;
    }

    public void setYear2Courses(ArrayList<String> year2Courses) {
        this.year2Courses = year2Courses;
    }

    public ArrayList<String> getYear3Courses() {
        return year3Courses;
    }

    public void setYear3Courses(ArrayList<String> year3Courses) {
        this.year3Courses = year3Courses;
    }

    public ArrayList<String> getYear4Courses() {
        return year4Courses;
    }

    public void setYear4Courses(ArrayList<String> year4Courses) {
        this.year4Courses = year4Courses;
    }

    public ArrayList<String> getAdditionalCourses() {
        return additionalCourses;
    }

    public void setAdditionalCourses(ArrayList<String> additionalCourses) {
        this.additionalCourses = additionalCourses;
    }

    public CourseSelectionPanel(){
        year1Courses.add("ENGR112: Introduction to Engineering");
        year1Courses.add("BUSA161: Foundations of Design and Entrepreneurship I");
        year1Courses.add("ENGL112: Written and Oral Communication");
        year1Courses.add("BUSA162: Foundations of Design and Entrepreneurship II");
        year1Courses.add("MATH161: Engineering Calculus");
        year1Courses.add("CS112: Computer Programming for Engineering");
        year1Courses.add("MATH211: Multivariable Calculus and Linear Algebra");
        year1Courses.add("SOAN111: Leadership Seminar I: What Makes a Good Leader?");

        year2Courses.add("SOAN234: African Music and the Art Music Scen");
        year2Courses.add("CS212: Computer Programming for CS");
        year2Courses.add("CS221: Discrete Structures and Theory");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");


        year3Courses.add("SOAN322: African Cultural Institutions");
        year3Courses.add("CS341: Web Technologies");
        year3Courses.add("ENGR311: System Dynamics");
        year3Courses.add("EE32O: Signals and Systems");
        year3Courses.add("");
        year3Courses.add("");


        year4Courses.add("CS462: Cloud Computing");
        year4Courses.add("CS331: Computer Organization and Architecture");
        year4Courses.add("CS442: E-Commerce");
        year4Courses.add("CS432: Networks and Data Communication");
        year4Courses.add("CE451: Embedded Systems");
        year4Courses.add("CS433: Operating Systems");
        year4Courses.add("CS452: Machine Learning");
        year4Courses.add("CS458: Internet of Things");
        year4Courses.add("ENGR401: Engineering Capstone Seminar");
        year4Courses.add("IS451: Information and Systems Security");
        year4Courses.add("SOAN441: Leadership Seminar IV for Engineers: Leadership as Service");



        additionalCourses.add("CS491: Undergraduate Thesis I (CS)");
        additionalCourses.add("IS351: Systems Analysis and Design");
        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");







    }

}