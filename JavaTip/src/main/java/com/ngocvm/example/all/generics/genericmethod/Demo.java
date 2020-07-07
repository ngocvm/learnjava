package com.ngocvm.example.all.generics.genericmethod;

public class Demo {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println("result " + same);
    }
}
