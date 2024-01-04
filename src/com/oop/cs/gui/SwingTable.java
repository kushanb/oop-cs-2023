package com.oop.cs.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class SwingTable {

    public static void main(String[] args) {
//        String[] columnNames = {"City", "Country", "Population"};
//
//        Object[][] data = {
//                {"London", "UK", 300000},
//                {"Colombo", "Sri Lanka", 20000},
//                {"Rome", "Italy", 2000000}
//        };

        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("Harry Potter", "J K Rowling", 3500.0));
        bookList.add(new Book("Harry Potter 2", "J K Rowling", 4500.0));
        bookList.add(new Book("Harry Potter 3", "J K Rowling", 5000.0));
        bookList.add(new Book("Harry Potter 4", "J K Rowling", 6500.0));

        JTable table = new JTable();

//        TableModel model = new DefaultTableModel(data, columnNames);
        TableModel model = new BookTableModel(bookList);

        table.setModel(model);

        JScrollPane scrollPane = new JScrollPane(table);

        table.setGridColor(Color.BLACK);

        JFrame frame  = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane);

        frame.setSize(600, 400);

        frame.setVisible(true);
    }
}
