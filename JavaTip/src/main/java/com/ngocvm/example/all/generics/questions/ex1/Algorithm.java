package com.ngocvm.example.all.generics.questions.ex1;

import java.util.Collection;
import java.util.List;

public class Algorithm {

    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c) {
            if (p.test(elem))
                ++count;
        }
        return count;
    }

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
        T maxElem = list.get(begin);
        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0) {
                maxElem = list.get(begin);
            }
        }
        return maxElem;
    }

}
