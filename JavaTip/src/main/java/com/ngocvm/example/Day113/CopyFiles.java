package com.ngocvm.example.Day113;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Please provide input and output files");
//            System.exit(0);
//        }

        String inputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test1.txt";
        String outputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test2.txt";

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
