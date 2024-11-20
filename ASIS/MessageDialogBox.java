package ASIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageDialogBox implements ActionListener {
    private final StudentCredentials credentials;
    private final JButton approveButton;
    private final JButton disapproveButton;

    public MessageDialogBox(StudentCredentials s) {
        this.credentials = s;
        GUI messageFrame = new GUI();

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(Color.white);
        messagePanel.setBounds(25, 100, 750, 600);
        messagePanel.setLayout(null);

        JLabel studentInfo = new JLabel();
        studentInfo.setText("Student ID: " + s.getStudentID() + ", Major: " + s.getMajor());
        studentInfo.setBounds(30, 10, 400, 35);
        studentInfo.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        messagePanel.add(studentInfo);

//        String genSentence = SystemSpecifications.generateEnglishSentence(
//                s.getStdIDString(), s.getYearString(), s.getMajor(), s.getGradeForPrerequisite()
//        );
        String APropositions = SystemSpecifications.parseEnglishToLogic(
                "...", "Active", s.getStdIDString(), s.getYearString(), s.getMajor(), s.getGradeForPrerequisite()
        );
        String genSentence = SystemSpecifications.getFullSentence();
        String Logical = SystemSpecifications.getLogicalExpression();

        JTextArea sentenceGenerated = new JTextArea("Generated Sentence: " + genSentence);
        sentenceGenerated.setBounds(50, 50, 600, 60);
        sentenceGenerated.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        sentenceGenerated.setWrapStyleWord(true);
        sentenceGenerated.setLineWrap(true);
        sentenceGenerated.setEditable(false);
        sentenceGenerated.setOpaque(false);
        messagePanel.add(sentenceGenerated);

        JTextArea proStat = new JTextArea("Propositional statements: " + APropositions);
        proStat.setBounds(50, 120, 600, 60);
        proStat.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        proStat.setWrapStyleWord(true);
        proStat.setLineWrap(true);
        proStat.setEditable(false);
        proStat.setOpaque(false);
        messagePanel.add(proStat);

        JLabel logicExp = new JLabel();
        logicExp.setText("Logical Expression: ");
        logicExp.setBounds(450, 200, 400, 50);
        logicExp.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        messagePanel.add(logicExp);

        JPanel logicBox = new JPanel();
        logicBox.setBackground(new Color(152, 95, 111));
        logicBox.setBounds(450, 250, 250, 50);
        messagePanel.add(logicBox);

        JLabel logicForm = new JLabel();
        logicForm.setText(Logical);
        logicForm.setBounds(15, 10, 200, 35);
        logicForm.setFont(new Font("Times new Roman", Font.PLAIN, 20));
        logicBox.add(logicForm);

        approveButton = new JButton("APPROVE");
        approveButton.setForeground(Color.white);
        approveButton.setBackground(new Color(80, 200, 120)); // emerald green
        approveButton.setOpaque(true);
        approveButton.setBorderPainted(false);
        approveButton.addActionListener(this);
        approveButton.setBounds(15, 450, 200, 100);
        messagePanel.add(approveButton);

        disapproveButton = new JButton("DISAPPROVE");
        disapproveButton.setForeground(Color.white);
        disapproveButton.setBackground(new Color(210, 4, 45)); // cherry
        disapproveButton.setOpaque(true);
        disapproveButton.setBorderPainted(false);
        disapproveButton.addActionListener(this);
        disapproveButton.setBounds(535, 450, 200, 100);
        messagePanel.add(disapproveButton);

        messageFrame.setLayout(null);
        messageFrame.add(messagePanel);
        messageFrame.setSize(800, 750);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == approveButton) {
            new enrolmentStatus("Enrolment Successfully Approved");
        } else if (e.getSource() == disapproveButton) {
            new enrolmentStatus("Failed to enrol in this course");
        }
    }
}
