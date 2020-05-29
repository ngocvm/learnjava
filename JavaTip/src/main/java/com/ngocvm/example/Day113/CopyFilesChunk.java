package com.ngocvm.example.Day113;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFilesChunk {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test1.txt";
        String outputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Test2.txt";

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            byte[] byteBuffer = new byte[BUFFER_SIZE];
            while ((inputStream.read(byteBuffer)) != -1) {
                outputStream.write(byteBuffer);
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
