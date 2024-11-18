package ASIS;
import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {

    public GUI(){

        this.setTitle("Ashesi Student Information System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750); // sets x and y dimensions
        this.setResizable(false);
        this.setVisible(true); //This makes the frame visible ;)

        this.getContentPane().setBackground(Color.pink); //Changed background color to pink

        ImageIcon logo = new ImageIcon("logic.jpg"); // creates an image icon
        if (logo.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.out.println("Image could not be loaded");
        }

        // resizing the image
        Image image = logo.getImage();
        Image scaledImage = image.getScaledInstance(100,50, Image.SCALE_SMOOTH);
        ImageIcon currentLogo = new ImageIcon(scaledImage);

        //New label
        JLabel label = new JLabel();
        label.setText("Ashesi Student Information System"); //edit this
        label.setIcon(currentLogo);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.white); // font color
        label.setFont(new Font("Georgia bold", Font.PLAIN, 18));// font size


        this.add(label);
        this.setLayout(new FlowLayout());
        this.revalidate();
        this.repaint();

    }


}
