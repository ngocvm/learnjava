package com.ngocvm.example.Day113;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String outputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test2.txt";

        try (
                FileWriter writer = new FileWriter(outputFile)
            ) {
            writer.write('H');      // write a single character
            writer.write(101);      // 101 is the ASCII code of 'e' character
            String s = "llo World";
            writer.write(s, 0, s.length()); // write a string
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
