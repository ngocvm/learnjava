package com.ngocvm.example.all.generics.genericmethod;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
        int count = 0;
        for (T e : array) {
            if (e.compareTo(element) > 0)
                ++count;
        }
        return count;
    }

}
