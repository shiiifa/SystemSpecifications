package ASIS;

import java.util.Objects;

public class AdditionalCourses implements getCourseInfo {

    private String courseID;
    private String courseName;
    private boolean isCourseMet;
    private int numberOfCreditHours;
    public double threshold = 3.3;
    public double gradePointAverage;

    public String getCourseID() {
        return courseID;
    }

    public int getNumberOfCreditHours() {
        return numberOfCreditHours;
    }

    public void setNumberOfCreditHours(int numberOfCreditHours) {
        this.numberOfCreditHours = numberOfCreditHours;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalCourses that = (AdditionalCourses) o;
        return isCourseMet == that.isCourseMet && Objects.equals(courseID, that.courseID) && Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        int result = 9;
        result = 33*result+(courseID==null?0:courseID.hashCode());
        result=33*result+numberOfCreditHours;
        return result;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isCourseMet() {
        return isCourseMet;
    }

    public void setCourseMet(boolean courseMet) {
        isCourseMet = courseMet;
    }


    public AdditionalCourses(double threshold, double gradePointAverage, int numberOfCreditHours){
        if (gradePointAverage>=threshold){
            System.out.println("You are eligible to take additional courses");
        }
        //such a person is eligible to take additional courses only if the number of credit hours for that semester is not greater than 5.5

        if (numberOfCreditHours> 5.5){
            System.out.println("You are not eligible to take any additional courses this semester");
        }
    }
    //This class is for students who want to take additional courses
    //There should be a condition here.
    // If the person's GPA is not within a particular threshold,
    // they can't take the course. Also, the number of credits should not exceed 5.5
}