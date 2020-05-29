package com.ngocvm.example.Day113;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.next();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("What is the value of PI?");
        float PI = scanner.nextFloat();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your PI is " + PI);
        scanner.close();

        scanner = new Scanner(new File("numbers.txt"));
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        scanner.close();
        System.out.println("Sum= " + sum);

        scanner = new Scanner(new File("tasks.txt"));
        List<String> listLines = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            listLines.add(line);
        }
        System.out.println(listLines);
        scanner.close();

        scanner = new Scanner(new File("books.csv"));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            String title = scanner.next();
            title = title.trim();
            String author = scanner.next();
            float price = scanner.nextFloat();
            System.out.format("Title: %s, Author: %s, Price: %.2f\n", title, author, price);
        }
        scanner.close();

        scanner = new Scanner(new File("books.txt"));
        scanner.useDelimiter("[\r\n]");
        String pattern = ".*Java.*";
        while (scanner.hasNext()) {
            if (scanner.hasNext(pattern)) {
                String javaBook = scanner.next(pattern);
                System.out.println(javaBook);
            } else {
                scanner.next();
            }
        }
        scanner.close();

        scanner = new Scanner("Java is Write Once Run Any Where");
        scanner.skip("\\w+");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();


        scanner = new Scanner(new File("FrenchNumbers.txt"));
        scanner.useLocale(Locale.FRENCH);
        while (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            System.out.println(number);
        }
        scanner.close();

    }
}
