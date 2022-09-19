package ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBaeDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBaeDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV boli",Font.PLAIN,20));
        bar.setForeground(Color.red);
        bar.setBackground(Color.green);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }
    public void fill(){
        int count = 100;
        while(count>=0){
            bar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count -= 1;
        }
        bar.setString("Done!");
    }
}
