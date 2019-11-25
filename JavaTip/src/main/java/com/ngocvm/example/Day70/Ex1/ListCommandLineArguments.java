package com.ngocvm.example.Day70.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCommandLineArguments {
    public static void main(String[] args) {
        List<String> argument = new ArrayList<String>();
        for(String s: args) {
            argument.add(s);
        }
        Collections.sort(argument);
        System.out.println(argument);
    }
}
