package com.oop.cs.gui.old;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {

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




        JTextField textField1 = new JTextField(10);
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


        frame.add(panel1);
        frame.add(new NumberPad().getPanel());

        frame.setSize(400, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
