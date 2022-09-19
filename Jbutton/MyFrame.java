package Jbutton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        label = new JLabel();
        label.setText("Hello Bro");
        label.setVisible(false);
        label.setBounds(220,200,100,100);

        button = new JButton();
        button.setBounds(200,200,100,30);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("Poor"));
        button.setText("Click me");
        button.setFocusable(false);
        button.setEnabled(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
