package com.ngocvm.example.Day75.ExtendWildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExtendWildcard {
    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>();
        for (Integer item : arrays) {
            System.out.println("item: " + item);
        }

        List<Integer> integers = Arrays.asList(2, 4, 5);
        double sum = sum(integers);
        System.out.println("Sum of integers = " + sum);

        List doubles = Arrays.asList(3.14, 1.68, 2.94);
        sum = sum(doubles);
        System.out.println("Sum of doubles = " + sum);

        List<Number> numbers = Arrays.<Number>asList(2, 4, 6, 3.14, 1.68, 2.94);
        sum = sum(numbers);
        System.out.println("Sum of numbers = " + sum);

        List< Number > number1 = new ArrayList< Number >();
        append(number1, 5);
        number1.add(6.789);
        System.out.println(number1);

        List<Object> objects = new ArrayList<>();
        append(objects, 4);
        objects.add("Five");
        System.out.println(objects);

        Collection<Number> numbers1 = new ArrayList<>();
        double sumOfTens = sumNumbers(numbers1, 10);
        System.out.println("Sum= " + sumOfTens);
    }

    public static double sum(Collection<? extends Number> numbers) {
        double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public static void append(Collection< ? super Integer>integers, int n) {
        for (int i = 1; i <= n; ++i) {
            integers.add(i);
        }
    }

    public static double sumNumbers(Collection<Number> numbers, int n) {
        append(numbers, n);
        return sum(numbers);
    }
}
