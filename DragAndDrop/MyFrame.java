package DragAndDrop;

import javax.swing.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    MyFrame(){

        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Drop and Drag demo");
        this.setSize(500,500);
        this.setVisible(true);
    }
}
