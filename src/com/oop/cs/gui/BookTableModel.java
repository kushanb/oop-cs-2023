package com.oop.cs.gui;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class BookTableModel extends AbstractTableModel {

    private String[] columnNames = {"Title","Author","Price"};
    private ArrayList<Book> myList;

    public BookTableModel(ArrayList<Book> myList) {
        this.myList = myList;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp;

        switch(columnIndex) {
            case 0:
                temp = myList.get(rowIndex).getAuthor();
                break;
            case 1:
                temp = myList.get(rowIndex).getTitle();
                break;
            case 2:
                temp = myList.get(rowIndex).getPrice();
                break;
            default:
                System.out.println("Columns out of index");
                temp = null;
        }

        return temp;
    }

    /**
     * Get the column name to be used in the table
     *
     * @param col  the column being queried
     * @return the name of the column
     */
    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Class getColumnClass(int col) {
        if(col == 2) {
            return Double.class;
        } else {
            return String.class;
        }
    }
}
