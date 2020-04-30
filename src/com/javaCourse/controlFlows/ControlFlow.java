package com.javaCourse.controlFlows;

public class ControlFlow {
    public static void main(String [] args) {
        //if statement
        int nr = 3;
        int nr2 = 5;
        int c;
        if (nr + nr2 > 7) { //if statement
            System.out.println("Sum is bigger then 7");
            int b = 3;
            c = 4;
        } else if (nr + nr2 > 10) {
            System.out.println("Sum is bigger then 10");
        } else if (nr > 3) {
            // do something
        } else {
            System.out.println("Sum is not bigger then 7 or 10");
        }
    }
}
