package com.ngocvm.example.Day113;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class StudentRecordReader {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Student.db";

        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        try (
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(inputFile))
            ) {
            while (true) {
                Student student = (Student) objectInputStream.readObject();
                System.out.print(student.getName() + "\t");
                System.out.print(dateFormat.format(student.getBirthDay()) + "\t");
                System.out.print(student.getGender() + "\t");
                System.out.print(student.getAge() + "\t");
                System.out.println(student.getGrade());
            }
        } catch (EOFException eof) {
            System.out.println("Reach end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
