package ASIS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFromStudentFile {
    List<StudentCredentials> listOfStudents;
    public ReadingFromStudentFile(){
        String fileName = "StudentFile.txt";

        listOfStudents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Read values from the file

            while(reader.readLine() != null){
                String y = reader.readLine();
                String id = reader.readLine();
                String cgpa = reader.readLine();
                String major = reader.readLine();
                String grade = reader.readLine();

                int year = Integer.parseInt(y);
                int stdID = Integer.parseInt(id);
                double stdGPA = Double.parseDouble(cgpa);

                StudentCredentials student = new StudentCredentials(year, stdID, stdGPA, major, grade);
                listOfStudents.add(student);

            }


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
    public List<StudentCredentials> getListOfStudents(){
        return listOfStudents;
    }

}

