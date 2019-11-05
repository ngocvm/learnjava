package com.ngocvm.example.Day53;

public class Circle extends Ellipse {
    @Override
    public void paint(int x, int y) {
        System.out.println("Draw a circle at (" + x + "," + y + ")");
    }

    @Override
    public void paint(float x, float y) {
        System.out.println("Draw a circle at (" + x + "," + y + ")");
    }
}
