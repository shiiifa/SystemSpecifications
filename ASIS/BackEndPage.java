package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackEndPage implements ActionListener {
    GUI backFrame;
    JPanel backPanel;
    List<StudentCredentials> dropdownList;
    Map<String, StudentCredentials> map;

    public BackEndPage(){
        backFrame = new GUI();

        backPanel = new JPanel();
        backPanel.setBackground(Color.white);
        backPanel.setBounds(25, 100,750,600);
        backPanel.setLayout(null);

        JLabel course = new JLabel();
        course.setText("Years: ");
        course.setFont(new Font("MV Boli", Font.PLAIN, 14));
        course.setBounds(15, 10, 200, 35);
        backPanel.add(course);

        java.util.List<String> coursesBasedOnYear = List.of("Year 1", "Year 2", "Year 3", "Year 4", "Additional courses");

        JComboBox<String> yearMenu = new JComboBox<>(coursesBasedOnYear.toArray(new String[0]));
        yearMenu.setBounds(100,10,400,35);
        backPanel.add(yearMenu);

        yearMenu.addActionListener(c-> {
            String selectedItem = (String) yearMenu.getSelectedItem();

            if(selectedItem.equals("Year 1")){
                courseYear1(selectedItem);
            }

            else if(selectedItem.equals("Year 2")){
                courseYear2(selectedItem);
                System.out.println("You selected: " + selectedItem);
            }

            else if(selectedItem.equals("Year 3")){
                courseYear3(selectedItem);
                System.out.println("You selected: " + selectedItem);
            }

            else if(selectedItem.equals("Year 4")){
                courseYear4(selectedItem);
                System.out.println("You selected: " + selectedItem);
            }

            else if(selectedItem.equals("Additional courses")){
                courseAdditional(selectedItem);
                System.out.println("You selected: " + selectedItem);
            }



            //System.out.println("You selected: " + selectedItem);
        });//Displays a list of courses for that year.


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

    //if Year one is picked, it displays the list of students who are applying for courses in year 1
    public void courseYear1(String selectedItem){
        courseBasedSelection(1);
        List<String> year1Std = new ArrayList<>();
        Map<String, StudentCredentials> year1Selections = getMap();
        List<StudentCredentials> studentCredentialsList = getDropdownList();

        if(year1Selections!=null){
            backFrame.dispose();
            BackEndPage listStudents = new BackEndPage();

            JPanel newPanel =listStudents.getPanel();

            for(Map.Entry<String, StudentCredentials> e: map.entrySet()){
                year1Std.add("Student " + e.getKey());
            }

            java.util.List<String> year1Courses = year1Std;
            JComboBox<String> coursesMenu = new JComboBox<>(year1Courses.toArray(new String[0]));
            coursesMenu.setBounds(100,80,400,35);
            newPanel.add(coursesMenu);

            coursesMenu.addActionListener(c-> {
                String selectedCourse = (String) coursesMenu.getSelectedItem();
                for(StudentCredentials student: studentCredentialsList){
                    new MessageDialogBox(student);
                }

                System.out.println("You selected: " + selectedItem);
            });

            JLabel courseSelected = new JLabel();
            courseSelected.setText("Selected: "+selectedItem);
            courseSelected.setBounds(80,50,200, 35);
            courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

            newPanel.add(courseSelected);
        }


    }

    //If year 2 is picked
    public void courseYear2(String selectedItem){
        courseBasedSelection(2);
        List<String> year2Std = new ArrayList<>();
        Map<String, StudentCredentials> year2Selections = getMap();
        List<StudentCredentials> studentCredentialsList = getDropdownList();

        if(year2Selections!=null){
            backFrame.dispose();
            BackEndPage listStudents = new BackEndPage();

            JPanel newPanel =listStudents.getPanel();

            for(Map.Entry<String, StudentCredentials> e: map.entrySet()){
                year2Std.add("Student " + e.getKey());
            }

            java.util.List<String> year2Courses = year2Std;
            JComboBox<String> coursesMenu = new JComboBox<>(year2Courses.toArray(new String[0]));
            coursesMenu.setBounds(100,80,400,35);
            newPanel.add(coursesMenu);

            coursesMenu.addActionListener(c-> {
                String selectedCourse = (String) coursesMenu.getSelectedItem();
                for(StudentCredentials student: studentCredentialsList){
                    new MessageDialogBox(student);
                }

                System.out.println("You selected: " + selectedItem);
            });

            JLabel courseSelected = new JLabel();
            courseSelected.setText("Selected: "+selectedItem);
            courseSelected.setBounds(80,50,200, 35);
            courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

            newPanel.add(courseSelected);
        }
    }

    //If year 3 is picked:
    public void courseYear3(String selectedItem){
        courseBasedSelection(3);
        List<String> year3Std = new ArrayList<>();
        Map<String, StudentCredentials> year3Selections = getMap();
        List<StudentCredentials> studentCredentialsList = getDropdownList();

        if(year3Selections!=null){
            backFrame.dispose();
            BackEndPage listStudents = new BackEndPage();

            JPanel newPanel =listStudents.getPanel();

            for(Map.Entry<String, StudentCredentials> e: map.entrySet()){
                year3Std.add("Student " + e.getKey());
            }

            java.util.List<String> year3Courses = year3Std;
            JComboBox<String> coursesMenu = new JComboBox<>(year3Courses.toArray(new String[0]));
            coursesMenu.setBounds(100,80,400,35);
            newPanel.add(coursesMenu);

            coursesMenu.addActionListener(c-> {
                String selectedCourse = (String) coursesMenu.getSelectedItem();
                for(StudentCredentials student: studentCredentialsList){
                    new MessageDialogBox(student);
                }

                System.out.println("You selected: " + selectedItem);
            });

            JLabel courseSelected = new JLabel();
            courseSelected.setText("Selected: "+selectedItem);
            courseSelected.setBounds(80,50,200, 35);
            courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

            newPanel.add(courseSelected);
        }
    }

    //If year 4 is picked:
    public void courseYear4(String selectedItem){
        courseBasedSelection(4);
        List<String> year4Std = new ArrayList<>();
        Map<String, StudentCredentials> year4Selections = getMap();
        List<StudentCredentials> studentCredentialsList = getDropdownList();

        if(year4Selections!=null){
            backFrame.dispose();
            BackEndPage listStudents = new BackEndPage();

            JPanel newPanel =listStudents.getPanel();

            for(Map.Entry<String, StudentCredentials> e: map.entrySet()){
                year4Std.add("Student " + e.getKey());
            }

            java.util.List<String> year4Courses = year4Std;
            JComboBox<String> coursesMenu = new JComboBox<>(year4Courses.toArray(new String[0]));
            coursesMenu.setBounds(100,80,400,35);
            newPanel.add(coursesMenu);

            coursesMenu.addActionListener(c-> {
                String selectedCourse = (String) coursesMenu.getSelectedItem();
                for(StudentCredentials student: studentCredentialsList){
                    new MessageDialogBox(student);
                }

                System.out.println("You selected: " + selectedItem);
            });

            JLabel courseSelected = new JLabel();
            courseSelected.setText("Selected: "+selectedItem);
            courseSelected.setBounds(80,50,200, 35);
            courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

            newPanel.add(courseSelected);
        }
    }

    //If additional courses is picked:
    public void courseAdditional(String selectedItem){
        backFrame.dispose();
        BackEndPage listStudents = new BackEndPage();

        JPanel newPanel =listStudents.getPanel();

        java.util.List<String> additional = new CourseSelectionPanel().getAdditionalCourses();
        JComboBox<String> coursesMenu = new JComboBox<>(additional.toArray(new String[0]));
        coursesMenu.setBounds(100,80,400,35);
        newPanel.add(coursesMenu);

        coursesMenu.addActionListener(c-> {
            String selectedCourse = (String) coursesMenu.getSelectedItem();
            //studentBasedCourse(selectedItem);
            //new MessageDialogBox();
            //System.out.println("You selected: " + selectedItem);
        });

        JLabel courseSelected = new JLabel();
        courseSelected.setText("Selected: "+selectedItem);
        courseSelected.setBounds(80,50,400, 35);
        courseSelected.setFont(new Font("MV Boli", Font.ITALIC, 18));

        newPanel.add(courseSelected);
    }


    public void courseBasedSelection(int year){
        ReadingCourseSelection yearSelections = new ReadingCourseSelection();
        ReadingFromStudentFile yearStd = new ReadingFromStudentFile();

        List<StudentCredentials> s = yearStd.getListOfStudents();
        List<CourseSelectionSystem> c = yearSelections.getListOfSelectedCourses();

        dropdownList = new ArrayList<>();
        map = new HashMap<>();


        if(s!=null && c != null){
            for(StudentCredentials std: s){
                for(CourseSelectionSystem course: c){
                    if(std.getYear()== year){
                        dropdownList.add(std);
                        if(std.getStudentID()==course.getiD()){
                            map.put(course.getCourse(),std);
                        }
                    }
                }
            }
        }
    }

    public List<StudentCredentials> getDropdownList(){
        return dropdownList;
    }

    public Map<String, StudentCredentials> getMap() {
        return map;
    }

}
