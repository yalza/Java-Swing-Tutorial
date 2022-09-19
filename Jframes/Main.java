package Jframes;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //        a GUI window to add components to
        JFrame jframe = new JFrame(); // Creates a frame
        jframe.setTitle("Nguyễn Ngọc Toàn"); // sets a title of frame
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        jframe.setResizable(true); // prevent frame  from being resised
        jframe.setSize(600,600); // sets the x-dimention , and y-dimention of frame
        jframe.setVisible(true); // make frame visible

        ImageIcon icon = new ImageIcon("src\\Jframes\\logo.png"); // create an ImageIcon
        jframe.setIconImage(icon.getImage()); // change icon of frame
        jframe.getContentPane().setBackground(Color.BLACK); // change color of background
    }
}
