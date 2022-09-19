package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton button;
    ImageIcon Xicon,Yicon;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        Xicon = new ImageIcon("src\\JCheckBox\\xicon.png");
        Yicon = new ImageIcon("src\\JCheckBox\\yicon.png");

        button = new JButton("submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setIcon(Xicon);
        checkBox.setSelectedIcon(Yicon);

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
