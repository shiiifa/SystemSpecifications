package ASIS;

import java.util.Objects;

public class StudentCredentials {
    private String studentFirstName;
    private String studentMidName;
    private String studentSurname;
    private int studentID;
    private String studentEmail;
    //Should student have a password too?

    //For students with middle names
    public StudentCredentials (String studentFirstName, String studentMidName,
                               String studentSurname, int studentID, String studentEmail){
        this.studentFirstName= studentFirstName;
        this.studentMidName= studentMidName;
        this.studentSurname= studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
    }

    //For students without middle names
    public StudentCredentials (String studentFirstName,
                               String studentSurname, int studentID, String studentEmail){
        this.studentFirstName= studentFirstName;
        this.studentMidName= null;
        this.studentSurname= studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
    }

    //Setters and getters
    public String getStudentFirstName(){
        return studentFirstName;
    }

    public String getStudentMidName(){
        return studentMidName;
    }

    public String getStudentSurname(){
        return studentSurname;
    }

    public int getStudentID(){
        return studentID;
    }

}
