package ASIS;

public class ErrorHandling {

    // Method to check if the student ID is valid
    public static boolean isValidStudentID(String studentID) {
        if (studentID.length() != 8 || !studentID.matches("[0-9]+")) {
            System.out.println("Invalid Student ID. It must be 8 digits long and contain only numbers.");
            return false;
        }
        return true;
    }

    // Method to check if the GPA is valid (between 0 and 4.0)
    public static boolean isValidGPA(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA. It must be between 0.0 and 4.0.");
            return false;
        }
        return true;
    }

    // Method to check if the grade is valid (e.g., "A", "B", etc.)
    public static boolean isValidGrade(String grade) {
        if (!grade.matches("[A-F]")) {
            System.out.println("Invalid grade. It must be between A and F.");
            return false;
        }
        return true;
    }

    // Method to check if the year input is valid (1-5)
    public static boolean isValidYear(int year) {
        if (year < 1 || year > 5) {
            System.out.println("Invalid year. It must be between 1 and 5.");
            return false;
        }
        return true;
    }

    // General method for form validation
    public static boolean isValidForm(String studentID, double gpa, String grade, int year) {
        return isValidStudentID(studentID) && isValidGPA(gpa) && isValidGrade(grade) && isValidYear(year);
    }
}
