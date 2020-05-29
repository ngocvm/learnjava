package com.ngocvm.example.Day122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializeTest {
    public static void main(String[] args) {
        String filePath = "student.ser";
        try (
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream inputStream = new ObjectInputStream(fis);
            ) {
            Student student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found: " + ex);
        } catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
    }
}
