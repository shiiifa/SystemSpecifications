package ASIS;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    public GUI(){


        this.setTitle("System Specifications To Logic Translator");// sets the title of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This sets the exit on the this to quit the application.
        this.setSize(750, 750);// sets x and y dimensions

        this.setVisible(true); //This makes the frame visible ;)

        this.getContentPane().setBackground(Color.pink); //Changed background color to pink

        ImageIcon logo = new ImageIcon("/Users/hediafrimpong/Downloads/logic.jpeg"); // creates an image icon
        if (logo.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.out.println("Image could not be loaded.");
        }
        //resizing the image
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(150,100, Image.SCALE_SMOOTH);
        ImageIcon currentLogo = new ImageIcon(scaledImage);

        //New label
        JLabel label = new JLabel();
        label.setText("STARTER UP");
        label.setIcon(currentLogo);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN, 18));

        this.add(label);
        this.setLayout(new FlowLayout());
        this.revalidate();
        this.repaint();

    }

}
