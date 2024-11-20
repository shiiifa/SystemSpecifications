
package ASIS;

import java.util.Arrays;
import java.util.List;

public class SystemSpecifications {
    private static String logicalExpression;
    private static String fullSentence;
    private static String gradeProposition;
    private static String idProposition;
    private static String yearProposition;

    // Method to generate an English sentence based on student's data
    public static String generateEnglishSentence(String studentID, String year, String major, String grade) {
        // Build the English sentence based on the student's input
        return "If the student with ID " + studentID + " is in year " + year + ", studying " + major +
                ", and has a grade of " + grade + " in their prerequisite course, then let the course be ";
    }

    // Method to parse an English sentence into a logical expression and display results
    public static String parseEnglishToLogic(String username, String imageStatus, String studentID, String year, String major, String grade) {
        // Check if the ID is valid (last 4 digits determine year)
        boolean isValidID = isValidStudentID(studentID);
        boolean isValidYear = isValidYear(year);
        boolean isAboveGradeThreshold = isGradeAboveThreshold(grade);

        // Initialize variables
        logicalExpression = "";
        fullSentence = generateEnglishSentence(studentID, year, major, grade);

        // Define atomic propositions dynamically
        char[] alphabet = "pqrstuvwxyz".toCharArray();
        int propositionIndex = 0;
        idProposition = alphabet[propositionIndex++] + ": This user has a valid student ID.";
        yearProposition = alphabet[propositionIndex++] + ": This user's year group is valid.";
        gradeProposition = alphabet[propositionIndex++] + ": This user's grade is above threshold (C).";

        // Logical proposition keys
        String idKey = String.valueOf(alphabet[propositionIndex - 3]);
        String yearKey = String.valueOf(alphabet[propositionIndex - 2]);
        String gradeKey = String.valueOf(alphabet[propositionIndex - 1]);

        // Check conditions and construct the logical expression
        int failureCount = 0;
        if (!isValidID) failureCount++;
        if (!isValidYear) failureCount++;
        if (!isAboveGradeThreshold) failureCount++;

        if (failureCount >= 2) {
            logicalExpression = "¬" + idKey + " ∨ ¬" + yearKey + " ∨ ¬" + gradeKey + " → d";  // disapprove
            fullSentence += "DISAPPROVED.";
        } else {
            logicalExpression = idKey + " ∧ " + yearKey + " ∧ " + gradeKey + " → a";  // approve
            fullSentence += "APPROVED.";
        }

        // Return the full output as a formatted string
        return //"Username: " + username + "\n" +
                //"Image: " + imageStatus + "\n\n" +
                "Atomic Propositions:\n" + idProposition + "\n" + yearProposition + "\n" +
                gradeProposition;
                        //+ "\n\nGenerated Sentence: " + fullSentence + "\n\n" +
               // "Logical Expression: " + logicalExpression;
    }

    // Method to validate a student ID (based on the last 4 digits representing the year)
    public static boolean isValidStudentID(String studentID) {
        try {
            int id = Integer.parseInt(studentID);
            int year = id % 10000;  // Last 4 digits represent the year (e.g., 2027 -> Year 2)
            return (year >= 2025 && year <= 2028);  // Valid years: 2025, 2026, 2027, 2028
        } catch (NumberFormatException e) {
            return false;  // Invalid ID format
        }
    }

    // Method to check if the student's year is valid (1-4)
    public static boolean isValidYear(String year) {
        try {
            int y = Integer.parseInt(year);
            return (y >= 1 && y <= 4);  // Valid years: 1, 2, 3, 4
        } catch (NumberFormatException e) {
            return false;  // Invalid year
        }
    }

    // Method to check if the grade is above threshold (A, B, or C)
    public static boolean isGradeAboveThreshold(String grade) {
        List<String> validGrades = Arrays.asList("A", "B", "C");
        return validGrades.contains(grade);  // Check if grade is A, B, or C
    }

    public static boolean isValidLogicExpression(String logicalExpression) {
        return false;
    }

    public static String getFullSentence() {
        return fullSentence;
    }

    public static String getLogicalExpression() {
        return logicalExpression;
    }

    public static String getAtomicP(){
        return "<html>" +idProposition + "\n" + yearProposition + "\n" +
                gradeProposition + "</html>";
    }
}
