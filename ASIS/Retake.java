package ASIS;

public class Retake implements getStudentInfo, getCourseInfo {

    // Fields for storing course and student information
    private String studentID;
    private String courseID;
    private boolean prerequisitesMet;

    // Constructor to initialize the Retake object
    public Retake(String studentID, String courseID, boolean prerequisitesMet) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.prerequisitesMet = prerequisitesMet;
    }

    // Getter for student ID
    public String getStudentID() {
        return studentID;
    }

    // Getter for course ID
    public String getCourseID() {
        return courseID;
    }

    @Override
    public String getCourseName() {
        return "";
    }

    @Override
    public boolean isCourseMet() {
        return false;
    }

    @Override
    public void setCourseID(String courseID) {

    }

    @Override
    public void setCourseName(String courseName) {

    }

    @Override
    public void setCourseMet(boolean courseMet) {

    }

    // Getter for prerequisite status
    public boolean isPrerequisitesMet() {
        return prerequisitesMet;
    }

    // Method to determine if a student should retake the course
    public String checkRetakeEligibility() {
        if (prerequisitesMet) {
            return "Student " + studentID + " is eligible for " + courseID + " without retake.";
        } else {
            return "Student " + studentID + " must retake " + courseID + " because prerequisites are not met.";
        }
    }
}
