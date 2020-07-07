package com.ngocvm.example.all.generics.unboundedwildcards;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void printList(List<Object> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    public static void printList1(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        List<Object> lo = Arrays.asList("one", "two", "three");
        printList1(li);
        printList1(ls);
        printList1(lo);
    }
}
