package ASIS;

import java.util.Arrays;
import java.util.List;

public class SystemSpecifications {

    // Method to generate an English sentence based on student's data
    public static String generateEnglishSentence(String studentID, String year, String major, String grade) {
        // Build the English sentence based on the student's input
        return "If the student with ID " + studentID + " is in year " + year + ", studying " + major +
                ", and has a grade of " + grade + " in their prerequisite course, then ";
    }

    // Method to parse an English sentence into a logical expression and display results
    public static String parseEnglishToLogic(String englishSentence, String studentID, String year, String grade) {
        // Check if the ID is valid (last 4 digits determine year)
        boolean isValidID = isValidStudentID(studentID);
        boolean isValidYear = isValidYear(year);
        boolean isValidGrade = isValidGrade(grade);

        // Initialize variables
        String logicalExpression = "";
        String fullSentence = englishSentence;

        // Define atomic propositions
        String p = "p: This student does Computer Engineering.";
        String q = "q: This student is in year " + year + ".";
        String r = "r: This student has a grade of " + grade + ".";

        // Check the validity of inputs and construct the logical expression
        if (isValidID && isValidYear && isValidGrade) {
            if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
                logicalExpression = "p ∧ q ∧ r → a";  // approve
                fullSentence += "APPROVED.";
            } else if (grade.equals("D") || grade.equals("E")) {
                logicalExpression = "p ∧ q ∧ ¬r → d";  // disapprove
                fullSentence += "DISAPPROVED.";
            }
        } else if (!isValidID) {
            logicalExpression = "¬p → d";  // disapprove if ID is invalid
            fullSentence += "DISAPPROVED: Invalid student ID.";
        } else if (!isValidYear) {
            logicalExpression = "¬q → d";  // disapprove if year is invalid
            fullSentence += "DISAPPROVED: Invalid year.";
        } else if (!isValidGrade) {
            logicalExpression = "¬r → d";  // disapprove if grade is invalid
            fullSentence += "DISAPPROVED: Invalid grade.";
        }

        // Return all required components
        return fullSentence + "\n\nAtomic Propositions:\n" + p + "\n" + q + "\n" + r +
                "\n\nLogical Expression: " + logicalExpression;
    }

    // Method to validate a student ID (based on the last 4 digits representing the year)
    public static boolean isValidStudentID(String studentID) {
        try {
            int id = Integer.parseInt(studentID);
            int year = id % 10000;  // Last 4 digits represent the year (e.g., 2027 -> Year 2)
            return (year >= 1 && year <= 4);
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

    // Method to check if the student's grade is valid (A, B, C, D, E)
    public static boolean isValidGrade(String grade) {
        List<String> validGrades = Arrays.asList("A", "B", "C", "D", "E");
        return validGrades.contains(grade);  // Check if grade is A, B, C, D, or E
    }

    // Method to validate a logical expression
    public static boolean isValidLogicExpression(String logicalExpression) {
        // Example validation: if the logical expression is either "p ∧ q ∧ r → a" or "p ∧ q ∧ ¬r → d"
        List<String> validExpressions = Arrays.asList("p ∧ q ∧ r → a", "p ∧ q ∧ ¬r → d", "¬p → d", "¬q → d", "¬r → d");
        return validExpressions.contains(logicalExpression);
    }
}
