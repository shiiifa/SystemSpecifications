package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageDialogBox implements ActionListener {
    //This class will contain code that displays a dialog box
    // with a message on whether the student's course
    // selection should be approved by the manufacturer or not.
    // The logic statement generated should show the manufacturer whether to click "approve" or "disapprove"
    private final StudentCredentials credentials;
    private final JButton approveButton;
    private final JButton disapproveButton;


    public MessageDialogBox(StudentCredentials s){
        this.credentials = s;
        GUI messageFrame = new GUI();

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(Color.white);
        messagePanel.setBounds(25, 100,750,600);
        messagePanel.setLayout(null);

        JLabel studentInfo = new JLabel();
        studentInfo.setText(s.getMajor());
        studentInfo.setBounds(30,10,200,35);
        messagePanel.add(studentInfo);



        approveButton = new JButton("APPROVE");
        approveButton.setForeground(Color.white);
        approveButton.setBackground(new Color(80,200,120)); //emerald green
        approveButton.setOpaque(true);
        approveButton.setBorderPainted(false);
        approveButton.addActionListener(this);
        approveButton.setBounds(15,450,200,100);
        messagePanel.add(approveButton);

        disapproveButton = new JButton("DISAPPROVE");
        disapproveButton.setForeground(Color.white);
        disapproveButton.setBackground(new Color(210,4,45)); //cherry
        disapproveButton.setOpaque(true);
        disapproveButton.setBorderPainted(false);
        disapproveButton.addActionListener(this);
        disapproveButton.setBounds(535,450,200,100);
        messagePanel.add(disapproveButton);

        messageFrame.setLayout(null);
        messageFrame.add(messagePanel);
        messageFrame.setSize(800,750);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==approveButton){
            new enrolmentStatus("Enrolment Successfully Approved");

        }

        else if(e.getSource()==disapproveButton){
            new enrolmentStatus("Failed to enrol in this course");
        }
    }
}
