package com.ngocvm.example.all.generics.unboundedwildcards;

import java.util.List;

public class LowerBoundedWildcards {

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {

    }
}
