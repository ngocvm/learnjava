package com.ngocvm.example.Day79;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Alice", 82));
        listStudents.add(new Student("Bob", 90));
        listStudents.add(new Student("Carol", 67));
        listStudents.add(new Student("David", 80));
        listStudents.add(new Student("Eric", 55));
        listStudents.add(new Student("Frank", 49));
        listStudents.add(new Student("Gary", 88));
        listStudents.add(new Student("Henry", 98));
        listStudents.add(new Student("Ivan", 66));
        listStudents.add(new Student("John", 52));

        // find students whose score >= 70
        List<Student> listBadStudents =  new ArrayList<>();
        for(Student student : listStudents)
        {
            if (student.getScore() >= 70) {
                listBadStudents.add(student);
            }
        }
        for(Student student : listBadStudents) {
            //System.out.println(student);
        }

        //--- use Stream API
        List<Student> listGoodStudents = listStudents.stream()
                                         .filter(s -> s.getScore() >= 70)
                                         .collect(Collectors.toList());
        listGoodStudents.stream().forEach(System.out::println);

        // calculate average score of all students
        double sum = 0.0;
        for (Student student : listStudents) {
            sum += student.getScore();
        }
        double average = sum/listStudents.size();
        System.out.println("Average score: " + average);

        //--- use Stream API
        double avg = listStudents.stream()
                                .mapToInt(s -> s.getScore())
                                .average().getAsDouble();
        System.out.println("Average score: " + avg);

        List< Student > top3Students = listStudents.stream()
                .filter(s -> s.getScore() >= 70)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Students by Score:");
        top3Students.forEach(s -> System.out.println(s));

        System.out.println((Long.MAX_VALUE - 0.0D) == (Long.MAX_VALUE - 0.1));
    }
}
