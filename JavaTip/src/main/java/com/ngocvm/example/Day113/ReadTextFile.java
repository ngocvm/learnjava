package com.ngocvm.example.Day113;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test1.txt";

        try (
                FileReader reader = new FileReader(inputFile);
            ) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.println((char) charRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
