package com.ngocvm.example.all.generics.unboundedwildcards;

import java.util.List;

public class WildcardErrorBad {

    void swapFirst(List<? extends  Number> list1, List<? extends Number> list2) {
//        Number temp = list1.get(0);
//        list1.set(0, list2.get(0));
//        list2.set(0, temp);
    }
}
