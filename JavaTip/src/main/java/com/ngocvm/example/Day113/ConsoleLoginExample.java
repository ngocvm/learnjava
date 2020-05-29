package com.ngocvm.example.Day113;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleLoginExample {
    public static void main(String[] args) throws IOException {
        String input = "Ngoc vang Minh is a Java expert";

        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        System.out.print("Enter a number: ");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();

        Scanner scanner3 = new Scanner(new File("numbers.txt"));
        scanner3.useDelimiter(",");
        List listNumbers = new ArrayList<>();
        while (scanner3.hasNextInt()) {
            int number3 = scanner3.nextInt();
            listNumbers.add(number3);
        }
        System.out.println(listNumbers);
        scanner.close();

        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }

        console.printf("Welcome to  Java Expert Program\n");
        String name= console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
        char[] correctPassword = {'n', 'i', 'm', 'd', 'a'};

        if (Arrays.equals(password, correctPassword)) {
            console.printf("Thanks %s, you are logged in.\n", name);
        } else {
            console.printf("Sorry, you are denied.\n");
        }

        Arrays.fill(password, ' ');
        Arrays.fill(correctPassword, ' ');
    }
}
