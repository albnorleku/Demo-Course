package com.javaCourse.inheritance.interfaces;

public class Rectangle implements Shape { //IS-A relationship
    private int width;
    private int height;
    private Point originPoints; //HAS-A relationship

    public Rectangle(int width, int height, Point origin) {
        this.width = width;
        this.height = height;
        this.originPoints = origin;
    }

    public double calcSiperfaqja() {
        return ((double) width * height);
    }

    public void move(int x, int y) {
        this.originPoints.setX(x);
        this.originPoints.setY(y);
    }

    public double calcPerimetri() {
        return 2 * (width + height);
    }
}
