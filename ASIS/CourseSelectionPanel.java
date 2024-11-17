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
        year1Courses.add("");
        year1Courses.add("");
        year1Courses.add("");
        year1Courses.add("");
        year1Courses.add("");


        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");
        year2Courses.add("");


        year3Courses.add("");
        year3Courses.add("");
        year3Courses.add("");
        year3Courses.add("");
        year3Courses.add("");
        year3Courses.add("");


        year4Courses.add("");
        year4Courses.add("");
        year4Courses.add("");

        year4Courses.add("");

        year4Courses.add("");



        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");
        additionalCourses.add("");







    }

}