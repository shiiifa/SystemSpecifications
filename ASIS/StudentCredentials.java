package ASIS;

import java.util.Objects;

public class StudentCredentials implements getStudentInfo {
    private int year;
    private int studentID;
    private double cgpa;
    private String major;
    private String gradeForPrerequisite;

    // Constructor
    public StudentCredentials(int year, int studentID, double cgpa, String major, String gradeForPrerequisite) {
        this.year = year;
        this.studentID = studentID;
        this.cgpa = cgpa;
        this.major = major;
        this.gradeForPrerequisite = gradeForPrerequisite;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getMajor() {
        return major;
    }

    public String getGradeForPrerequisite() {
        return gradeForPrerequisite;
    }

    // Setters (if needed)
    public void setYear(int year) {
        this.year = year;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGradeForPrerequisite(String gradeForPrerequisite) {
        this.gradeForPrerequisite = gradeForPrerequisite;
    }
}
