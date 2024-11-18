package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class NextPage implements ActionListener {
    private final GUI newFrame;
    private final JPanel newPanel;
    private final JButton backButton;
    private final JButton doneButton;
    private final JTextField yearInput;
    private final JTextField iDInput;
    private final JTextField gpaInput;
    private final JTextField majorInput;
    private final JTextField gradeInput;

    public NextPage() {
        // Setting up the frame
        newFrame = new GUI();

        // Panel setup
        newPanel = new JPanel();
        newPanel.setBackground(Color.white);
        newPanel.setBounds(175, 130, 450, 510);
        newPanel.setLayout(null);

        // Input fields setup
        yearInput = createInputField("Year (1/2/3/4):", 10);
        iDInput = createInputField("Student ID:", 80);
        gpaInput = createInputField("CGPA:", 150);
        majorInput = createInputField("Major:", 220);
        gradeInput = createInputField("Grade Obtained in Prerequisite Course (A/B/C/D/E):", 290);

        // Buttons
        doneButton = new JButton("Done");
        doneButton.setBounds(345, 360, 100, 50);
        doneButton.addActionListener(this);
        newPanel.add(doneButton);

        backButton = new JButton("Back");
        backButton.setBounds(0, 650, 100, 50);
        backButton.addActionListener(this);

        // Add panel and buttons to the frame
        newFrame.setLayout(null);
        newFrame.add(newPanel);
        newFrame.add(backButton);
        newFrame.setSize(800, 750);
    }

    // Helper method to create input fields with labels
    private JTextField createInputField(String labelText, int yOffset) {
        JLabel label = new JLabel(labelText);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Georgia bold", Font.PLAIN, 12));
        label.setBounds(15, yOffset, 300, 35);
        newPanel.add(label);

        JTextField inputField = new JTextField();
        inputField.setBounds(5, yOffset + 20, 400, 50);
        inputField.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(inputField);

        return inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            newFrame.dispose();
            new LoginPanel();
        } else if (e.getSource() == doneButton) {
            handleDoneButton();
        }
    }

    // Method to handle "Done" button click
    private void handleDoneButton() {
        try {
            int year = Integer.parseInt(yearInput.getText());
            int id = Integer.parseInt(iDInput.getText());
            double cgpa = Double.parseDouble(gpaInput.getText());
            String major = majorInput.getText();
            String grade = gradeInput.getText();

            if (!isValidInput(id, cgpa, grade)) {
                showErrorPanel("* Ensure all fields are written correctly");
                return;
            }

            displayCoursesBasedOnYear(year);

        } catch (NumberFormatException ex) {
            showErrorPanel("* Please enter valid numeric values for year, ID, and CGPA");
        }
    }

    // Validates input fields
    private boolean isValidInput(int id, double cgpa, String grade) {
        return String.valueOf(id).length() >= 8 && grade.length() == 1 && cgpa <= 4.0;
    }

    // Displays courses based on the year entered
    private void displayCoursesBasedOnYear(int year) {
        List<String> courses;
        switch (year) {
            case 1 -> courses = new CourseSelectionPanel().getYear1Courses();
            case 2 -> courses = new CourseSelectionPanel().getYear2Courses();
            case 3 -> courses = new CourseSelectionPanel().getYear3Courses();
            case 4 -> courses = new CourseSelectionPanel().getYear4Courses();
            case 5 -> courses = new CourseSelectionPanel().getAdditionalCourses();
            default -> {
                showErrorPanel("* Invalid year entered. Please select a valid year (1-5).");
                return;
            }
        }

        addCoursesToPanel(courses);
    }

    // Adds a JComboBox with courses to the panel
    private void addCoursesToPanel(List<String> courses) {
        JComboBox<String> coursesMenu = new JComboBox<>(courses.toArray(new String[0]));
        coursesMenu.setBounds(5, 430, 400, 30);
        newPanel.add(coursesMenu);

        coursesMenu.addActionListener(course -> {
            String selectedItem = (String) coursesMenu.getSelectedItem();
            System.out.println("You selected: " + selectedItem);
        });

        newPanel.revalidate();
        newPanel.repaint();
    }

    // Displays an error message panel
    private void showErrorPanel(String errorMessage) {
        JLabel caution = new JLabel(errorMessage);
        caution.setFont(new Font("Georgia bold", Font.BOLD, 12));
        caution.setBounds(15, 360, 300, 35);
        newPanel.add(caution);

        newPanel.revalidate();
        newPanel.repaint();
    }
}
