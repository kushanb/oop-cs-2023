package com.oop.cs.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseTrackerFrame extends JFrame {

    private JPanel mousePanel;
    private JLabel statusBar;

    public MouseTrackerFrame() {
        super("Mouse Tracker Window");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside the JPanel");
        add(statusBar, BorderLayout.SOUTH);


        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }


    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Entered at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText(String.format("Exited at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Mouse dragged at [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Mouse is at [%d, %d]",
                    e.getX(), e.getY()));
        }
    }
}
