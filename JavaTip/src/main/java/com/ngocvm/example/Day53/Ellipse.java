package com.ngocvm.example.Day53;

public class Ellipse extends Shape {
    public void paint(float x, float y) {
        System.out.println("Draw an ellipse at (" + x + "," + y + ")");
    }

    public void paint(int x, int y) {
        System.out.println("Draw an ellipse at (" + x + "," + y + ")");
    }
}
