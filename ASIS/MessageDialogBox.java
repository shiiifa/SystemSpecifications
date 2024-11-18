package ASIS;

import javax.swing.*;
import java.awt.*;

public class MessageDialogBox {
    //This class will contain code that displays a dialog box
    // with a message on whether the student's course
    // selection should be approved by the manufacturer or not.
    // The logic statement generated should show the manufacturer whether to click "approve" or "disapprove"

    public MessageDialogBox(){
        GUI messageFrame = new GUI();

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(Color.white);
        messagePanel.setBounds(25, 100,750,600);
        messagePanel.setLayout(null);

        JButton approveButton = new JButton("APPROVE");
        approveButton.setForeground(Color.white);
        approveButton.setBackground(new Color(80,200,120)); //emerald green
        approveButton.setOpaque(true);
        approveButton.setBorderPainted(false);
        //doneButton.addActionListener(this);
        approveButton.setBounds(15,450,200,100);
        messagePanel.add(approveButton);

        JButton disapproveButton = new JButton("DISAPPROVE");
        disapproveButton.setForeground(Color.white);
        disapproveButton.setBackground(new Color(210,4,45)); //cherry
        disapproveButton.setOpaque(true);
        disapproveButton.setBorderPainted(false);
        //doneButton.addActionListener(this);
        disapproveButton.setBounds(535,450,200,100);
        messagePanel.add(disapproveButton);

        messageFrame.setLayout(null);
        messageFrame.add(messagePanel);
        messageFrame.setSize(800,750);
    }
}
