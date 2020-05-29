package com.ngocvm.example.Day113;

import java.io.IOException;
import java.io.PrintStream;

public class ReassignStandardOutputExample {
    public static void main(String[] args) throws IOException {
        // Re-assign the standard output stream to a file:
        PrintStream stream = new PrintStream("output.txt");
        System.setOut(stream);
        System.out.println("Hello World!");
        System.out.println("Ngoc vang Minh is a Java Expert.");
        System.err.println("This is an error message.");
    }
}
