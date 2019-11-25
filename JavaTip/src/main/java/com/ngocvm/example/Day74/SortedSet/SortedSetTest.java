package com.ngocvm.example.Day74.SortedSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet setNumbers = new TreeSet<>();
        setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9));
        System.out.println("Origin Sorted set: " + setNumbers);
        Integer first = (Integer) setNumbers.first();
        System.out.println("First element: " + first);

        Integer last = (Integer) setNumbers.last();
        System.out.println("Last element: " +  last);

        SortedSet subSet = setNumbers.subSet(3, 7);
        System.out.println("Sub set: " + subSet);

        SortedSet headSet = setNumbers.headSet(5);
        System.out.println("Head set:" + headSet);

        SortedSet tailSet = setNumbers.tailSet(6);
        System.out.println("Tail set:" + tailSet);

        Comparator comparator = setNumbers.comparator();
        System.out.println("Sorted by natural ordering? " + (comparator == null));

//        SortedSet<String> setStrings = new TreeSet<>(new ZtoAComparator());
        SortedSet<String> setStrings = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
        setStrings.add("Banana");
        setStrings.add("Apple");
        setStrings.add("Grape");
        setStrings.add("Lemon");
        setStrings.add("Watermelon");
        System.out.println(setStrings);
    }
}
