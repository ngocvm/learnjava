package com.ngocvm.example.Day113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardOutputExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = reader.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Enter your city: ");
        String city = reader.readLine();
        System.out.printf("%s is a %d years old man living in %s", name, age, city);
    }
}
