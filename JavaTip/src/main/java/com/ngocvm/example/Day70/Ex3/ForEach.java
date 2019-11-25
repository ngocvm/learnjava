package com.ngocvm.example.Day70.Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        List<String> arguments = Arrays.asList(args);

        arguments.forEach(arg -> listNumbers.add(Integer.parseInt(arg)));
        listNumbers.forEach(number -> {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        });
    }
}
