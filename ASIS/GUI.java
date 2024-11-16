package ASIS;
import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {

    public GUI(){

        this.setTitle("Name of our software");// sets the title of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This sets the exit on the this to quit the application.
        this.setSize(750, 750);// sets x and y dimensions
        this.setResizable(false);
        this.setVisible(true); //This makes the frame visible ;)

        this.getContentPane().setBackground(Color.pink); //Changed background color to pink

        ImageIcon logo = new ImageIcon("logic.jpeg"); // creates an image icon
        if (logo.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.out.println("Image could not be loaded.");
        }
        //resizing the image
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(100,50, Image.SCALE_SMOOTH);
        ImageIcon currentLogo = new ImageIcon(scaledImage);


        //New label
        JLabel label = new JLabel();
        label.setText("NAME OF OUR SOFTWARE"); //edit this
        label.setIcon(currentLogo);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.white); // font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 18));// font size


        this.add(label);
        this.setLayout(new FlowLayout());
        this.revalidate();
        this.repaint();

    }


}
