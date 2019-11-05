package com.ngocvm.example.Day53;

import java.awt.*;

public class Graphics {
    protected Color paintColor;
    protected float scale;
    protected float strokeThickness;
    protected Font font;

    protected int x;
    protected int y;
    protected int count;

    public Graphics(float scale) {
        this.scale = scale;
        this.x = 100;
        this.y = 100;
    }

    public Graphics(Color paintColor, float scale) {
        this.paintColor = paintColor;
        this.scale = scale;
        this.x = 100;
        this.y = 100;
    }

    public Graphics(float strokeThickness, Color paintColor, Font font) {
        this.strokeThickness = strokeThickness;
        this.paintColor = paintColor;
        this.font = font;
        this.x = 100;
        this.y = 100;
    }

    public Color getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(Color paintColor) {
        this.paintColor = paintColor;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getStrokeThickness() {
        return strokeThickness;
    }

    public void setStrokeThickness(float strokeThickness) {
        this.strokeThickness = strokeThickness;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(int x, int y, Rectangle rect) {
        rect.paint(x, y);
        count++;
    }

    public void draw(int x, int y, Shape shape) {
        shape.paint(x, y);
        count++;
    }

    public int countShapes() {
        return count;
    }

    public static void main(String[] args) {
        Graphics graphics = new Graphics(Color.BLUE, 1);
        graphics.draw(20, 30, new Circle());
        graphics.draw(15, 90, new Ellipse());
        graphics.draw(150, 920, new Square());
        System.out.println("Count shape: " + graphics.countShapes());
    }
}
