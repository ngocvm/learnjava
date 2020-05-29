package com.ngocvm.example.Day122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {
    public static void main(String[] args) {
        String filePath = "data.ser";
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            String message = (String) objectInputStream.readObject();
            System.out.println("Message: " + message);
        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found: " + ex);
        } catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
    }
}
