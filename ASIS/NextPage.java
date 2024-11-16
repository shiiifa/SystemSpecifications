package ASIS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextPage implements ActionListener {
    JButton backButton;
    GUI newFrame;
    public NextPage(){
        newFrame = new GUI();

        backButton = new JButton("Back");
        backButton.addActionListener(this);

        newFrame.add(backButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            newFrame.dispose();
            new LoginPanel();
        }
    }

}
