package com.ngocvm.example.Day74.NavigableSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Integer> setNumbers1 = new TreeSet<>();
        setNumbers1.addAll(Arrays.asList(4, 8, 3, 9, 1, 6, 4, 5, 3, 2, 7, 8, 0));

        NavigableSet<Integer> setNumbers2 = setNumbers1.descendingSet();
        System.out.println("Set numbers 1: " + setNumbers1);
        System.out.println("Set numbers 2: " + setNumbers2);

        NavigableSet<String> setFruits = new TreeSet<>();
        setFruits.add("Banana");
        setFruits.add("Apple");
        setFruits.add("Orange");
        setFruits.add("Grape");
        setFruits.add("Mango");

        System.out.println("Set Fruits: " + setFruits);
        Iterator<String> descIterator = setFruits.descendingIterator();
        System.out.println("Fruits by descending order: " );
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next() + ", ");
        }
    }
}
