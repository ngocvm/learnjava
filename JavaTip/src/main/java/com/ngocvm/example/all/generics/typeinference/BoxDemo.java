package com.ngocvm.example.all.generics.typeinference;

import com.ngocvm.example.all.generics.boundedtype.Box;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {

    public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box: boxes) {
            U boxContents = box.get();
            System.out.println("Box #:"  + counter + " contains [" + boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        List<Box<Integer>> listOfIntegerBox = new ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBox);
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBox);
        BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBox);
        BoxDemo.outputBoxes(listOfIntegerBox);
    }

}
