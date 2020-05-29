package com.ngocvm.example.Day113;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test1.txt";
        String outputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test3.txt";

        try (
                FileReader reader = new FileReader(inputFile);
                FileWriter writer = new FileWriter(outputFile)
            ) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
