package ASIS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingCourseSelection {
    List<CourseSelectionSystem> listOfSelectedCourses;

    public ReadingCourseSelection(){
        String filename = "CourseSelection.txt";

        listOfSelectedCourses = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Read values from the file

            while(reader.readLine() != null){
                String id = reader.readLine();
                String selectedCourse = reader.readLine();

                int stdID = Integer.parseInt(id);

                CourseSelectionSystem course = new CourseSelectionSystem(stdID, selectedCourse);
                listOfSelectedCourses.add(course);

            }


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
    public List<CourseSelectionSystem> getListOfSelectedCourses(){
        return listOfSelectedCourses;

    }
}
