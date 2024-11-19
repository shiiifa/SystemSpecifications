package ASIS;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCourseSelection {

    public WritingCourseSelection(String id, String courseSelection){
        String filename = "CourseSelection.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.newLine();
            writer.write(id);
            writer.newLine();
            writer.write(courseSelection);

            System.out.println("File written successfully");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }


    }
}
