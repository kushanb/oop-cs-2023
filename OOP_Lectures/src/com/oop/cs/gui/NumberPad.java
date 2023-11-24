package com.oop.cs.gui;

import javax.swing.*;
import java.awt.*;

public class NumberPad extends JFrame {
    JPanel panel;
    public NumberPad() throws HeadlessException {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,4,4));

        for(int i = 9; i >= 1; i--) {
            JButton button = new JButton(String.valueOf(i));
            panel.add(button);
        }
    }

    public JPanel getPanel() {
        return panel;
    }
}
