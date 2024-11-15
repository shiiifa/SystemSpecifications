import ASIS.Retake;

import static ASIS.SystemSpecifications.*;

/**
 * Example usage of the SystemSpecifications class.
 */
public static void main(String[] args) {
    // Example student info
    String studentID = "49142027";
    String yearGroup = "2027";

    //THIS CODE IS INCOMPLETE

    // Generate an English sentence based on student information
    String englishSentence = generateEnglishSentence(studentID, yearGroup);
    System.out.println("Generated Sentence: " + englishSentence);

    // Convert the sentence to a logical expression
    String logic = parseEnglishToLogic(englishSentence);
    System.out.println("Logical Expression: " + logic);

    // Validate the generated logical expression
    System.out.println("Is the parsed logic expression valid? " + isValidLogicExpression(logic));

    // Example of a student who does not meet prerequisites
    Retake student1 = new Retake("49142027", "Electromagnetism", false);
    System.out.println(student1.checkRetakeEligibility());

    // Example of a student who meets prerequisites
    Retake student2 = new Retake("49142028", "Electromagnetism", true);
    System.out.println(student2.checkRetakeEligibility());
}