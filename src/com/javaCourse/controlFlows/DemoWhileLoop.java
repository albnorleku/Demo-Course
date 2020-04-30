package com.javaCourse.controlFlows;

public class DemoWhileLoop {
    /*
        3 Loops
        While () {}
        do { } while();
        for();
     */

    public static void main(String [] arg) {
        int number = 1;
        while (number <= 10) {
            if(number % 2 > 0) {
                number++;
                continue; //skips this iteration of loop;
                //break; //breaks the loop
            }
            System.out.println("Number is : " + number);
            number++;
        }
        System.out.println("Outside of While loop!");
    }
}
