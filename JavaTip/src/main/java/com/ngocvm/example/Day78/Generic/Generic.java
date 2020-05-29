package com.ngocvm.example.Day78.Generic;

import java.math.BigDecimal;
import java.util.*;

public class Generic {
    public static void main(String[] args) {
        List<String> listFruits = Arrays.asList("Orange", "Apple", "Banana", "Lemon", "Grape", "Cherry", "Coconut");
        System.out.println("Before reverse: \n" + listFruits);
        Collections.reverse(listFruits);
        System.out.println("After reverse: \n" + listFruits);

        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Before rotate:\n" + listNumbers);
        Collections.rotate(listNumbers, 3);
        System.out.println("After rotate:\n" + listNumbers);

        System.out.println("Before shuffle:\n" + listNumbers);
        Collections.shuffle(listNumbers);
        System.out.println("After shuffle:\n" + listNumbers);

        List<String> listNames = Arrays.asList("Tim", "Anne", "Dave", "Jean", "John", "Peter", "Carol");
        System.out.println("Before sort: \n" + listNames);
        Collections.sort(listNames);
        System.out.println("After sort: \n" + listNames);

        List<String> listCountries = Arrays.asList("USA", "Japan", "UK", "France", "Canada", "Singapore");
        System.out.println("Before swap: \n" + listCountries);
        Collections.swap(listCountries, 1, 4);
        System.out.println("After swap: \n" + listCountries);

        List<Integer> source = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> dest = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
        System.out.println("Dest before copy:\n" + dest);
        Collections.copy(dest, source);
        System.out.println("Dest after copy:\n" + dest);

        List<Integer> listNums = Arrays.asList(1, 2, 3, 4, 5,6, 7, 8, 9);
        System.out.println("Before fill:\n" + listNums);
        Collections.fill(listNums, 0);
        System.out.println("After fill:\n" + listNums);

        List<String> listLetters
                = Arrays.asList("h", "e", "l", "l", "o", "w", "o", "r", "l", "d");
        System.out.println("Before replace:\n " + listLetters);
        Collections.replaceAll(listLetters, "l", "L");
        System.out.println("After replace:\n " + listLetters);

        List<Integer> listNumbers1 = Arrays.asList(31, 87, 22, 45, 12, 98, 3, 6, 7);
        Integer max = Collections.max(listNumbers1);
        System.out.println("Maximum number: " + max);

        List<BigDecimal> listBigDecimal = Arrays.asList(new BigDecimal(15), new BigDecimal(17), new BigDecimal(17.5), new BigDecimal(17.52));
        Optional<BigDecimal> maxBigDecimal = listBigDecimal.stream().max(Comparator.naturalOrder());
        System.out.println("Maximum bigdecimal number: " + maxBigDecimal.get());

        List<String> listCities = Arrays.asList("London", "Paris", "New York",
                "Washington", "Tokyo", "Rio De Janero", "Bangalore");

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        String max1 = Collections.max(listCities, comparator);
        System.out.println("Most-letter city name: " + max1);

        Integer min = Collections.min(listNumbers1);
        System.out.println("Minimum number: " + min);

        List<Employee> listEmployees = new ArrayList<>();

        listEmployees.add(new Employee("Tom", 40000));
        listEmployees.add(new Employee("Adam", 60000));
        listEmployees.add(new Employee("Jim", 70000));
        listEmployees.add(new Employee("Dane", 35000));
        listEmployees.add(new Employee("Jack", 56000));
        listEmployees.add(new Employee("Carol", 67000));

        Comparator<Employee> comparator1 = new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return emp1.salary - emp2.salary;
            }
        };

        Employee minEmployee = Collections.min(listEmployees, comparator1);

        System.out.println("Least paid employee: " + minEmployee);
    }
}
