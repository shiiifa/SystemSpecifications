package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NextPage implements ActionListener {
    JButton backButton;
    GUI newFrame;
    JButton doneButton;
    JTextField yearInput;
    JTextField iDInput;
    JTextField gpaInput;
    JTextField majorInput;
    JTextField gradeInput;
    private final JPanel newPanel;
    private final List<CourseSelectionSystem> saveCourse;


    public NextPage(){
        newFrame = new GUI();
        saveCourse = new ArrayList<>();

        newPanel = new JPanel();
        newPanel.setBackground(Color.white);
        newPanel.setBounds(175, 130,450,510);
        newPanel.setLayout(null);

        //Student's name
        JLabel year = new JLabel();
        year.setText("Year (1/2/3/4): ");
        year.setForeground(Color.BLACK);
        year.setFont(new Font("Georgia bold", Font.PLAIN,12));
        year.setBounds(15,10,300,35);
        newPanel.add(year);

        yearInput = new JTextField();
        yearInput.setBounds(5,30,400,50);
        yearInput.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(yearInput);

        //Student's ID
        JLabel iD = new JLabel();
        iD.setText("Student ID: ");
        iD.setForeground(Color.BLACK);
        iD.setFont(new Font("Georgia bold", Font.PLAIN,12));
        iD.setBounds(15,80,150,35);
        newPanel.add(iD);

        iDInput = new JTextField();
        iDInput.setBounds(5,100,400,50);
        iDInput.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(iDInput);

        //Student's GPA
        JLabel gpa = new JLabel();
        gpa.setText("CGPA: ");
        gpa.setForeground(Color.BLACK);
        gpa.setFont(new Font("MV Boli", Font.PLAIN,12));
        gpa.setBounds(15,150,150,35);
        newPanel.add(gpa);

        gpaInput = new JTextField();
        gpaInput.setBounds(5,170,400,50);
        gpaInput.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(gpaInput);

        //Student's major
        JLabel major = new JLabel();
        major.setText("Major: ");
        major.setForeground(Color.BLACK);
        major.setFont(new Font("Georgia bold", Font.PLAIN,12));
        major.setBounds(15,220,150,35);
        newPanel.add(major);

        majorInput = new JTextField();
        majorInput.setBounds(5,240,400,50);
        majorInput.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(majorInput);

        //Student's grade
        JLabel grade = new JLabel();
        grade.setText("Grade Obtained in Prerequisite Course (A/B/C/D/E): ");
        grade.setForeground(Color.BLACK);
        grade.setFont(new Font("Georgia bold", Font.PLAIN,12));
        grade.setBounds(15,290,400,35);
        newPanel.add(grade);

        gradeInput = new JTextField();
        gradeInput.setBounds(5,310,400,50);
        gradeInput.setFont(new Font("Georgia bold", Font.ITALIC, 14));
        newPanel.add(gradeInput);

        doneButton = new JButton("Done");
        doneButton.addActionListener(this);
        doneButton.setBounds(345,360,100,50);
        newPanel.add(doneButton);

        JLabel courses = new JLabel();
        courses.setText("Select Course from List: ");
        courses.setForeground(Color.BLACK);
        courses.setFont(new Font("Georgia bold", Font.PLAIN,12));
        courses.setBounds(15,410,150,35);
        newPanel.add(courses);


        backButton = new JButton("Back");
        backButton.setBounds(0,650,100,50);
        backButton.addActionListener(this);

        newFrame.setLayout(null);
        newFrame.add(newPanel);
        newFrame.add(backButton);
        newFrame.setSize(800,750);
    }

    public JPanel getNewPanel(){
        return newPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            newFrame.dispose();
            new LoginPanel();
        }
        else if(e.getSource()==doneButton){
            int year = Integer.parseInt(yearInput.getText());
            int id = Integer.parseInt(iDInput.getText());
            double cgpa = Double.parseDouble(gpaInput.getText());
            String major = majorInput.getText();
            String grade = gradeInput.getText();

            if(iDInput.getText().length()<8 || grade.length()>1 || cgpa>4.0 || year>4 || major.length()<2){
                newFrame.dispose();
                NextPage errorPage = new NextPage();

                JPanel editedPanel = errorPage.getNewPanel();
                JLabel caution = new JLabel();
                caution.setText("* Ensure all fields are written correctly");
                caution.setFont(new Font("Georgia bold", Font.BOLD,12));
                caution.setBounds(15,360,300,35);

                editedPanel.add(caution);
            }

            if(year == 1){
                List<String> year1 = new CourseSelectionPanel().getYear1Courses();

                JComboBox<String> coursesMenu = new JComboBox<>(year1.toArray(new String[0]));
                coursesMenu.setBounds(5,430,400,30);
                newPanel.add(coursesMenu);

                coursesMenu.addActionListener(course-> {
                    String selectedItem = (String) coursesMenu.getSelectedItem();
                    System.out.println("You selected: " + selectedItem);

                    new WritingCourseSelection(iDInput.getText(),selectedItem);

                    new BackEndPage();
                    newFrame.dispose();
                });

                newPanel.revalidate();
                newPanel.repaint();
            }

            else if(year == 2){
                List<String> year2 = new CourseSelectionPanel().getYear2Courses();

                JComboBox<String> coursesMenu = new JComboBox<>(year2.toArray(new String[0]));
                coursesMenu.setBounds(5,430,400,30);
                newPanel.add(coursesMenu);

                coursesMenu.addActionListener(course-> {
                    String selectedItem = (String) coursesMenu.getSelectedItem();
                    System.out.println("You selected: " + selectedItem);

                    new WritingCourseSelection(iDInput.getText(),selectedItem);

                    new BackEndPage();
                    newFrame.dispose();
                });

                newPanel.revalidate();
                newPanel.repaint();
            }

            else if(year == 3){
                List<String> year3 = new CourseSelectionPanel().getYear3Courses();

                JComboBox<String> coursesMenu = new JComboBox<>(year3.toArray(new String[0]));
                coursesMenu.setBounds(5,430,400,30);
                newPanel.add(coursesMenu);

                coursesMenu.addActionListener(course-> {
                    String selectedItem = (String) coursesMenu.getSelectedItem();
                    System.out.println("You selected: " + selectedItem);

                    new WritingCourseSelection(iDInput.getText(),selectedItem);

                    new BackEndPage();
                    newFrame.dispose();
                });

                newPanel.revalidate();
                newPanel.repaint();
            }

            else if(year == 4){
                List<String> year4 = new CourseSelectionPanel().getYear4Courses();

                JComboBox<String> coursesMenu = new JComboBox<>(year4.toArray(new String[0]));
                coursesMenu.setBounds(5,430,400,30);
                newPanel.add(coursesMenu);

                coursesMenu.addActionListener(course-> {
                    String selectedItem = (String) coursesMenu.getSelectedItem();
                    System.out.println("You selected: " + selectedItem);

                    new WritingCourseSelection(iDInput.getText(),selectedItem);

                    new BackEndPage();
                    newFrame.dispose();
                });

                newPanel.revalidate();
                newPanel.repaint();
            }

//            else if(year == 5){
//                List<String> additionalCourses = new CourseSelectionPanel().getAdditionalCourses();
//
//                JComboBox<String> coursesMenu = new JComboBox<>(additionalCourses.toArray(new String[0]));
//                coursesMenu.setBounds(5,430,400,30);
//                newPanel.add(coursesMenu);
//
//                coursesMenu.addActionListener(course-> {
//                    String selectedItem = (String) coursesMenu.getSelectedItem();
//                    System.out.println("You selected: " + selectedItem);
//
//                    new WritingCourseSelection(iDInput.getText(),selectedItem);
//
//                    new BackEndPage();
//                    newFrame.dispose();
//                });
//
//                newPanel.revalidate();
//                newPanel.repaint();
//            }

            new WritingToStudentFile(yearInput.getText(),iDInput.getText(),gpaInput.getText(),majorInput.getText(),gradeInput.getText());



        }
    }
}
