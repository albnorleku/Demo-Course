package com.javaCourse.controlFlows;

public class DemoDoWhileLoop {
    public static void main(String[] args) {
        int number = 1;

        do {
            System.out.println("Number is :" + number);
            number ++;
        } while(number < 10);
        System.out.println("Outside of do while loop!");
    }
}
