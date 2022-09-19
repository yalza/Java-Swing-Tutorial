package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed.Uses KeyChar, char output

        switch (e.getKeyChar()) {
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
            default -> {
            }
        }


    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down.Uses KeyCode,int output
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is released
        System.out.println(e.getKeyChar());
        // System.out.println(e.getKeyCode());
        // System.out.println(e.getKeyLocation());

    }
}
