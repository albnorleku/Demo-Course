package com.javaCourse.inheritance.interfaces;

/**
 * Interface
 */
public interface Shape {
    double calcSiperfaqja();

    double calcPerimetri();

    static void doTest() { //Static method

    }

    default void info() { //Default method
        System.out.println("Shape Calc");
    }
}
