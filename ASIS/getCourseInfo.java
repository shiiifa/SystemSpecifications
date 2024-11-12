package ASIS;

public interface getCourseInfo {
    String getCourseID();
    String getCourseName();
    boolean isCourseMet();
    void setCourseID(String courseID);
    void setCourseName(String courseName);
    void setCourseMet(boolean courseMet);
}
