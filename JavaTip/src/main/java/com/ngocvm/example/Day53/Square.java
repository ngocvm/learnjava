package com.ngocvm.example.Day53;

public class Square extends Rectangle {
    @Override
    public void paint(int x, int y) {
        System.out.println("Draw a square at (" + x + "," + y + ")");
    }

    @Override
    public void paint(float x, float y) {
        System.out.println("Draw a square at (" + x + "," + y + ")");
    }
}
