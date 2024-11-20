package ASIS;

import javax.swing.*;
import java.awt.*;

public class enrolmentStatus extends JFrame{
    public enrolmentStatus(String status){

        this.setTitle("Enrolment Status");// sets the title of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This sets the exit to quit the application.
        this.setLayout(null);
        this.setSize(400, 250);// sets x and y dimensions
        this.setResizable(false);
        this.setVisible(true);

        JLabel enrolmentStatus = new JLabel();
        enrolmentStatus.setText(status);
        enrolmentStatus.setFont(new Font("Georgia bold", Font.BOLD,14));
        enrolmentStatus.setBounds(80,75,300,40);
        this.add(enrolmentStatus);

        if(status.equals("Enrolment Successfully Approved")){
            ImageIcon check = new ImageIcon("check.jpg");

            Image image = check.getImage();
            Image scaledImage = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
            ImageIcon currentIcon = new ImageIcon(scaledImage);
            enrolmentStatus.setIcon(currentIcon);

        }

        else if(status.equals("Failed to enrol in this course")){
            ImageIcon check = new ImageIcon("x.jpg");

            Image image = check.getImage();
            Image scaledImage = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
            ImageIcon currentIcon = new ImageIcon(scaledImage);
            enrolmentStatus.setIcon(currentIcon);
        }

    }
}
