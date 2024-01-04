package com.oop.cs.gui;

import java.io.*;
import java.util.*;

public class ListFile {
    public static void main(String[] args) throws IOException {
        File currentDirectory = new File("./src/com/oop/cs/gui/");
        String[] contents = currentDirectory.list();
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }


//        FileReader reader = new FileReader("hello.txt");

        File inputFile = new File("hello.txt");
        File outputFile = new File("text_copy.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1){
            System.out.println(c);
            out.write(c);
        }
        in.close();
        out.close();

    }
}