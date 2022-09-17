package JTextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        button = new JButton("submit email");
        button.setFocusable(false);
        button.addActionListener(this);

        this.setLayout(new FlowLayout());

        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,20));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.red);
        textField.setText("@gmail.com");


        this.add(button);
        this.add(textField);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            textField.setEnabled(false);
            button.setEnabled(false);
            System.out.println(textField.getText());
        }
    }
}
