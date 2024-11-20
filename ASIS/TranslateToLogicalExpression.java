package ASIS;
import java.util.*;

public class TranslateToLogicalExpression {
    private static int Counter = 0;
    private static final Map<String, String> propositionMap = new HashMap<>();

    public static String translateToLogic(String input) {
        propositionMap.clear();
        Counter = 0;

        // Convert to lowercase for easier processing
        input = input.toLowerCase().trim();

        // Different patterns to handle:
        if (input.contains("if") && input.contains("then")) {
            return handleIfThenStatement(input);
        } else if (input.contains("and")) {
            return handleAndStatement(input);
        } else if (input.contains("or")) {
            return handleOrStatement(input);
        } else if (input.contains("not")) {
            return handleNotStatement(input);
        } else {
            // Single proposition
            String prop = nextProposition();
            propositionMap.put(input, prop);
            return prop;
        }
    }

    private static String handleIfThenStatement(String input) {
        // Remove 'if' and split on 'then'
        String[] parts = input.replace("if", "").split("then");

        if (parts.length >= 2) {
            String antecedent = parts[0].trim();
            String consequent = parts[1].trim();

            // Handle compound antecedents (with AND/OR)
            String processedAntecedent;
            if (antecedent.contains("and")) {
                processedAntecedent = handleAndStatement(antecedent);
            } else if (antecedent.contains("or")) {
                processedAntecedent = handleOrStatement(antecedent);
            } else {
                String prop = nextProposition();
                propositionMap.put(antecedent.replace("not", "").trim(), prop);
                processedAntecedent = antecedent.contains("not") ? "¬" + prop : prop;
            }

            // Handle consequent
            String prop = nextProposition();
            propositionMap.put(consequent.replace("not", "").trim(), prop);
            String processedConsequent = consequent.contains("not") ? "¬" + prop : prop;

            return String.format("%s → %s", processedAntecedent, processedConsequent);
        }
        return "Invalid if-then statement";
    }

    private static String handleAndStatement(String input) {
        String[] parts = input.split("and");
        List<String> processedParts = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            String prop = nextProposition();
            propositionMap.put(part.replace("not", "").trim(), prop);
            processedParts.add(part.contains("not") ? "¬" + prop : prop);
        }

        return String.join(" ∧ ", processedParts);
    }

    private static String handleOrStatement(String input) {
        String[] parts = input.split("or");
        List<String> processedParts = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            String prop = nextProposition();
            propositionMap.put(part.replace("not", "").trim(), prop);
            processedParts.add(part.contains("not") ? "¬" + prop : prop);
        }

        return String.join(" ∨ ", processedParts);
    }

    private static String handleNotStatement(String input) {
        String cleanInput = input.replace("not", "").trim();
        String prop = nextProposition();
        propositionMap.put(cleanInput, prop);
        return "¬" + prop;
    }

    private static String nextProposition() {
        char proposition = (char) ('p' + Counter);
        Counter++;
        return String.valueOf(proposition);
    }

    public static void printPropositionMappings() {
        System.out.println("\nProposition Mappings:");
        for (Map.Entry<String, String> entry : propositionMap.entrySet()) {
            if (!entry.getKey().isEmpty()) {
                System.out.println(entry.getValue() + ": " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        // Test with various types of statements
        String[] testCases = {
                "If the user enters their full name and their ID, but does not enter their year group, then do not allow access to the system",
                "If the student enters their ID or their year, or their gpa is less than required and they do not have a required grade for the prerequisite, then disapprove their enrollment"
        };

        for (String test : testCases) {
            System.out.println("\nOriginal Statement: " + test);
            String translatedLogic = translateToLogic(test);
            System.out.println("Translated Logic: " + translatedLogic);
            printPropositionMappings();
        }
    }
}