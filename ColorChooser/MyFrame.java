package ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("choose color");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel("Hello Bro, You are so handsome");

        label.setBackground(Color.white);
        label.setFont(new Font("MV boli",Font.PLAIN,50));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"pick a color, please",Color.black);
            label.setForeground(color);
        }
    }
}
