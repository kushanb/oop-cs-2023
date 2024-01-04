package com.oop.cs.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {

    private static String displayText;

    private static JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Demo App");
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        frame.setLayout(new GridLayout(2,1, 50, 30));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,1));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,3,4,4));

//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");
//        JButton button5 = new JButton("5");
//        JButton button6 = new JButton("6");
//        JButton button7 = new JButton("7");
//        JButton button8 = new JButton("8");
//        JButton button9 = new JButton("9");



        Color colour = new Color(0, 160, 160);
        Color fontColor = new Color(255, 255, 255);

        Font font =  new Font("Roboto", Font.BOLD, 48);


        textField1 = new JTextField(10);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(fontColor);
        textField1.setFont(font);
//        JTextField textField2 = new JTextField(10);
//
//        JButton button = new JButton("OK");
//        JButton button2 = new JButton("OK2");

        panel1.add(textField1);

//        panel2.add(button1);
//        panel2.add(button2);
//        panel2.add(button3);
//        panel2.add(button4);
//        panel2.add(button5);
//        panel2.add(button6);
//        panel2.add(button7);
//        panel2.add(button8);
//        panel2.add(button9);

//        for(int i = 9; i >= 1; i--) {
//            JButton button = new JButton(String.valueOf(i));
//            panel2.add(button);
//        }

        JButton newButton = new JButton("Display Text");

        DemoHandler handler = new DemoHandler();

        newButton.addActionListener(handler);

        panel1.add(newButton);

        frame.add(panel1);
        frame.add(new NumberPad().getPanel());


        frame.setSize(400, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class DemoHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText("The button was pressed!!!");
        }
    }
}
