package TwoDAnimations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image rocket;
    Image universe;

    Timer timer;

    int xVelocity = 3;
    int yVelocity = 1;

    int x = 0;
    int y = 0;


    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));


        this.setBackground(Color.BLACK);

        rocket = (new ImageIcon("src\\TwoDAnimations\\rocket2.png")).getImage();
        universe = new ImageIcon("src\\TwoDAnimations\\universe.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(universe,0,0,null);
        g2D.drawImage(rocket, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - rocket.getWidth(null) || x < 0) xVelocity *= -1;
        if (y >= PANEL_HEIGHT - rocket.getHeight(null) || y < 0) yVelocity *= -1;
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}
