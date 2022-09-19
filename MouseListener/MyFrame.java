package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        // label.setBackground(Color.YELLOW);

    }
// <--------------focus---------------->
    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when the mouse button has been clicked pressed on a component
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when the mouse button has been clicked pressed on a component
        label.setBackground(Color.red);
    }
// <------------------------------------->
// <--------------hover---------------->
    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters component
        // label.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits component
        // label.setBackground(Color.red);
    }
// <------------------------------------->
}
