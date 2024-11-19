package ASIS;

import java.util.List;

public class CourseSelectionSystem {
    private final int iD;
    private final String course;

    public CourseSelectionSystem(int ID, String Course){
        this.iD = ID;
        this.course = Course;
    }

    public String getCourse(){
        return course;
    }

    public int getiD(){
        return iD;
    }

}
