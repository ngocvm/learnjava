package com.ngocvm.example.Day113;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordWriter {
    public static void main(String[] args) {
        String outputFile = "C:\\Users\\PSPC141\\Desktop\\data\\Student.db";

        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outputFile))
            ) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Alice", dateFormat.parse("02-15-1993"), false, 23, 80.5f));
            students.add(new Student("Brian", dateFormat.parse("10-03-1994"), true, 22, 95.0f));
            students.add(new Student("Carol", dateFormat.parse("08-22-1995"), false, 21, 79.8f));

            for (Student student : students) {
                objectOutputStream.writeObject(student);
            }

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    }
}
