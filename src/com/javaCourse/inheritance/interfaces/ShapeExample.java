package com.javaCourse.inheritance.interfaces;

public class ShapeExample {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Rectangle rectangle = new Rectangle(5, 10, point);

        System.out.println("Perimetri: " +rectangle.calcPerimetri());
        System.out.println("Siperfaqja: " +rectangle.calcSiperfaqja());

        rectangle.move(5, 8);
        rectangle.info();
    }
}
