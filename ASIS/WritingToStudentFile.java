package ASIS;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToStudentFile {

    public WritingToStudentFile(String year, String id, String cgpa, String major, String grade){
        String fileName = "StudentFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(year);
            writer.newLine();
            writer.write(id);
            writer.newLine();
            writer.write(cgpa);
            writer.newLine();
            writer.write(major);
            writer.newLine();
            writer.write(grade);

            System.out.println("File written successfully");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
