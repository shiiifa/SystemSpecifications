package ASIS;

public class SystemSpecifications {
    //This is where we will handle the system specification sentences and logic translations
    //In this class, we will also take care of the rules governing propositional syntax
    //For example, two operations cannot follow each other, such as (∨¬/pq/p∧∧q)
    //The only exception in this is (¬¬)

    // Copy and paste these symbols as and when you need them:
    // And - ∧
    // Or - ∨
    // Not - ¬
    // Implies - →
    // If and only if - ↔

    //THIS CODE IS INCOMPLETE
    /**
     * Generates an English sentence based on the student's information.
     * @param studentID The student's ID.
     * @param yearGroup The student's year group.
     * @return The corresponding English sentence.
     */

    public static String generateEnglishSentence(String studentID, String yearGroup) {
        // Check if the student ID ends with the specified year group
        if (studentID.endsWith(yearGroup)) {
            return "This user is in " + yearGroup + ".";
        }
        return "This user is not in " + yearGroup + ".";
    }

    /**
     * Converts an English sentence into a logical expression.
     * @param sentence The English sentence.
     * @return The logical expression.
     */
    public static String parseEnglishToLogic(String sentence) {
        // Replace common keywords with logical symbols
        String logic = sentence
                .replaceAll("(?i)\\bif and only if\\b", " ↔ ")
                .replaceAll("(?i)\\bimplies\\b", " → ")
                .replaceAll("(?i)\\band\\b", " ∧ ")
                .replaceAll("(?i)\\bor\\b", " ∨ ")
                .replaceAll("(?i)\\bnot\\b", " ¬ ");

        return logic;
    }

    /**
     * Validates a logical expression to ensure it adheres to propositional syntax rules.
     * @param expression The logical expression to validate.
     * @return true if the expression is valid; false otherwise.
     */

    public static boolean isValidLogicExpression(String expression) {
        // Remove all whitespaces for easier validation
        expression = expression.replaceAll("\\s+", "");

        //ERROR HANDLING SECTION
        // Check for consecutive operators (except ¬¬)
        if (expression.matches(".*[∧∨→↔]{2,}.*") || expression.matches(".*¬[∧∨→↔].*")) {
            return false;
        }

        // Ensure the expression does not start or end with operators (except ¬ at the start)
        if (expression.matches("^[∧∨→↔].*") || expression.matches(".*[∧∨→↔]$")) {
            return false;
        }

        return true;
    }
}
