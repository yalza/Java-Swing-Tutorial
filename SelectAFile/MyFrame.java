package SelectAFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("choose file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            // fileChooser.showOpenDialog(null); // select file to open

            // int reponse = fileChooser.showOpenDialog(null);
            int reponse = fileChooser.showSaveDialog(null);

            if(reponse == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
