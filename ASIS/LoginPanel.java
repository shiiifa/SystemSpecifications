package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel implements ActionListener {
    private final JButton submit;
    private final JTextField usernameInput;
    GUI myFrame;

    public LoginPanel(){
        myFrame = new GUI();

        ImageIcon icon = new ImageIcon("Ashesi logo.png"); // creates an image icon

        JLabel mainText = new JLabel();
        mainText.setText("WELCOME!");
        mainText.setForeground(Color.black); // font color
        mainText.setFont(new Font("MV Boli", Font.BOLD, 16));
        mainText.setIcon(icon);
        mainText.setVerticalAlignment(JLabel.TOP);
        mainText.setHorizontalAlignment(JLabel.CENTER);
        mainText.setHorizontalTextPosition(JLabel.CENTER);
        mainText.setVerticalTextPosition(JLabel.BOTTOM);
        mainText.setIconTextGap(2);

        JLabel secondLabel = new JLabel();
        secondLabel.setText("STUDENT LOGIN"); //change name
        secondLabel.setForeground(Color.BLACK);
        secondLabel.setFont(new Font("MV Boli", Font.PLAIN,16));
        secondLabel.setHorizontalAlignment(JLabel.CENTER);
        secondLabel.setBounds(150, 150, 150, 50);

        JPanel logPanel = new JPanel();//Panel for student
        logPanel.setBackground(Color.white);
        logPanel.setBounds(150, 150, 450, 500);
        logPanel.setLayout(null);

        //Adding a text field for Username/ID
        JLabel userLabel = new JLabel();
        userLabel.setText("Username");
        userLabel.setForeground(Color.BLACK);
        userLabel.setFont(new Font("MV Boli", Font.PLAIN,11));
        userLabel.setBounds(75, 220, 150,50);

        usernameInput = new JTextField();
        usernameInput.setBounds(75, 250, 300, 50);
        usernameInput.setFont(new Font("MV Boli", Font.ITALIC, 12));

        //Button for submitting username/ID
        submit = new JButton("Login");
        submit.setBounds(75, 320, 250, 30);
        submit.addActionListener(this); //creating an action listener to do an action when this button is clicked

        int labelWidth = 150;  // Width of the label
        int labelHeight = 100; // Height of the label
        int panelWidth = logPanel.getWidth();  // Panel width
        int labelX = (panelWidth - labelWidth) / 2;  // Calculate X to center the label
        mainText.setBounds(labelX, 20, labelWidth, labelHeight);

        logPanel.add(mainText);
        logPanel.add(secondLabel);
        logPanel.add(userLabel);
        logPanel.add(usernameInput);
        logPanel.add(submit);

        myFrame.setLayout(null);
        myFrame.add(logPanel);
        myFrame.setSize(800,750);
        mainText.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String user = usernameInput.getText().trim();

            // Validation for full name
            if (!user.matches("[A-Za-z]+\\s+[A-Za-z]+")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid username. Please enter your full name",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE
                );
                return; // Stop further execution if the input is invalid
            }

            // If valid, proceed
            System.out.println("Username: " + user);
            myFrame.dispose();
            new NextPage();
        }
    }
}
