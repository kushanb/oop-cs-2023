package com.oop.cs.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public TextFieldFrame() {
        super("Password Test");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        textField3.setEditable(false);

        passwordField = new JPasswordField("Hidden Text");

        add(textField1);
        add(textField2);
        add(textField3);
        add(passwordField);

        TextFieldFrameHandler handler = new TextFieldFrameHandler();

        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }


    private class TextFieldFrameHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            String displayString = "";

            if(event.getSource() == textField1) {
                displayString = String.format("TextField1: %s", event.getActionCommand());
            }

            if(event.getSource() == textField2) {
                displayString = String.format("TextField2: %s", event.getActionCommand());
            }

            if(event.getSource() == textField3) {
                displayString = String.format("TextField3: %s", event.getActionCommand());
            }

            if(event.getSource() == passwordField) {
                displayString = String.format("PasswordField: %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, displayString);
        }
    }
}
