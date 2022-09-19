package JRadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hot dog");
        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotDogButton.setFocusable(false);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("you ordered pizza");
        }
        else if(e.getSource()==hamburgerButton){
            System.out.println("you ordered hamburger");
        }
        else{
            System.out.println("you ordered hot dog");
        }
    }
}
