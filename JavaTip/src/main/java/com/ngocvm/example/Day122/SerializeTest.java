package com.ngocvm.example.Day122;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        String filePath = "data.ser";
        String message = "Java Serialization is cool";

        try(FileOutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(message);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
