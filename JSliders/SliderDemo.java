package JSliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider();
        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV boli",Font.PLAIN,10));

        slider.setOrientation(SwingConstants.HORIZONTAL);

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Age = " + slider.getValue());
    }
}
