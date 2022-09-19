package Jlabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        JLabel label = new JLabel("B20DCPT173"); // create a label
        label.setText("Hello Bro"); // set text of label

        ImageIcon image = new ImageIcon("src\\Jlabel\\logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,5);

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top , center, bottom of imageicon
        label.setForeground(new Color(0x00FF00)); // set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,30)); // set font of text
        label.setIconTextGap(0); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        // label.setBounds(0,0,300,300); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(600,600);
        frame.setIconImage(image.getImage());
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
