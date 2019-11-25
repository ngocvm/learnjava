package com.ngocvm.example.Day74.SortedSet;

import java.util.Comparator;

public class ZtoAComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
