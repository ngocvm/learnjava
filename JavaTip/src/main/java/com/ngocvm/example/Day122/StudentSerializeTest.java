package com.ngocvm.example.Day122;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializeTest {
    public static void main(String[] args) {
        String filePath = "student.ser";
        Student student = new Student(123, "John", 34);

        try (
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            ) {
            outputStream.writeObject(student);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
