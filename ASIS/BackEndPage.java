package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BackEndPage implements ActionListener {
    GUI backFrame;
    JPanel backPanel;

    public BackEndPage(){
        backFrame = new GUI();

        backPanel = new JPanel();
        backPanel.setBackground(Color.white);
        backPanel.setBounds(25, 100,750,600);
        backPanel.setLayout(null);

        JLabel course = new JLabel();
        course.setText("Courses: ");
        course.setFont(new Font("MV Boli", Font.PLAIN, 14));
        course.setBounds(15, 10, 200, 35);
        backPanel.add(course);

        java.util.List<String> dummyCourses = List.of("OOP", "Discrete", "Numbers");

        JComboBox<String> coursesMenu = new JComboBox<>(dummyCourses.toArray(new String[0]));
        coursesMenu.setBounds(100,10,400,35);
        backPanel.add(coursesMenu);

        coursesMenu.addActionListener(c-> {
            String selectedItem = (String) coursesMenu.getSelectedItem();
            studentBasedCourse(selectedItem);
            //System.out.println("You selected: " + selectedItem);
        });//edit this to display a list of students who selected that course.


        backFrame.setLayout(null);
        backFrame.add(backPanel);
        backFrame.setSize(800,750);

    }

    public JPanel getPanel(){
        return backPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void studentBasedCourse(String selectedItem){
        backFrame.dispose();
        BackEndPage listStudents = new BackEndPage();

        JPanel newPanel =listStudents.getPanel();
        JLabel courseSelected = new JLabel();
        courseSelected.setText("Selected: "+selectedItem);
        courseSelected.setBounds(80,50,200, 35);
        courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

        newPanel.add(courseSelected);


        //System.out.println("Works");


    }


}
