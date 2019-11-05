package com.ngocvm.example.Day53;

import java.awt.*;

public class Graphics2D extends Graphics {
    protected float x;
    protected float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Graphics2D(float scale) {
        super(scale);
    }

    public Graphics2D(Color paintColor, float scale) {
        super(paintColor, scale);
    }

    public Graphics2D(float strokeThickness, Color paintColor, Font font) {
        super(strokeThickness, paintColor, font);
    }

    public void draw(float x, float y, Shape shape) {
        shape.paint(x, y);
        count++;
    }

    public static void main(String[] args) {
        Graphics2D graphics2D = new Graphics2D(3.5f);
        graphics2D.draw(34.54f, 35.45f, new Circle());
    }
}
