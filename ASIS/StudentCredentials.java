package ASIS;

import java.util.Objects;

public class StudentCredentials {
    private String courseID;
    private String courseName;
    private boolean isCourseMet;

    public String getCourseID() {
        return courseID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCredentials that = (StudentCredentials) o;
        return isCourseMet == that.isCourseMet && Objects.equals(courseID, that.courseID) && Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        int result = 9;
        result = 33*result+(surname==null?0:surname.hashCode());
        result=33*result+age;
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



}
