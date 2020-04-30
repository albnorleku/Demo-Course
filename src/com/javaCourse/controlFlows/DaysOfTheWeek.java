package com.javaCourse.controlFlows;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a nr between 1 to 7 :");
        int nr = scanner.nextInt();
        printDay(nr);
        /*DaysOfTheWeek diteteEJaves = new DaysOfTheWeek();
        diteteEJaves.printDay(3);*/
    }

    private static void printDay(int nr) {
        switch (nr) { //switch block
            case 1:
                System.out.println("e hene");
                break;
            case 2:
                System.out.println("e marte");
                break;
            case 3:
                System.out.println("e merkure");
                break;
            case 4:
                System.out.println("e enjte");
                break;
            case 5:
                System.out.println("e premte");
                break;
            case 6:
            case 7:
                System.out.println("eshte vikend!");
                break;
            default:
                System.out.println("Nuk eshte gjet asnje dite");
        }
        System.out.println("Day of the week printed");

        /*String test = "hello";
        switch (test) {
            case "test": //do something
                break;
        }*/
    }
}
