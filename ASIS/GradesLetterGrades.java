package ASIS;

import java.util.Map;
import java.util.TreeMap;

public class GradesLetterGrades {

    // Use TreeMap to store ranges of grades with their corresponding letter grades
    private final TreeMap<Integer, String> letterGrades;

    public GradesLetterGrades() {
        letterGrades = new TreeMap<>();
        letterGrades.put(85, "Grade A+");
        letterGrades.put(80, "Grade A");
        letterGrades.put(75, "Grade B+");
        letterGrades.put(70, "Grade B");
        letterGrades.put(65, "Grade C+");
        letterGrades.put(60, "Grade C");
        letterGrades.put(55, "Grade D+");
        letterGrades.put(50, "Grade D");
        letterGrades.put(45, "Grade E");
        letterGrades.put(0, "Grade F");  // Covers grades < 45
    }

    public String getLetterGrade(int numericGrade) {
        Map.Entry<Integer, String> entry = letterGrades.floorEntry(numericGrade);
        return entry != null ? entry.getValue() : "Invalid Grade";
    }


}