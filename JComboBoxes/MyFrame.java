package JComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        // comboBox.setEditable(true);

        comboBox.addItem("mouse");
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(4);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        // comboBox.removeAllItems();

        this.add(comboBox);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
