package com.javaCourse.controlFlows.examples;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int [] number = new int[5]; // [0, 0, 0, 0, 0] gjatesia = 5, pozitata jane = 0, 1, 2, 3, 4
        for (int i = 0; i < number.length; i++) {
            System.out.println("Shtyp nje numerin " + (i+1));
            number[i] = scan.nextInt();
        }
        int sum = 0;
        for (int nr : number) {
            if (nr % 2 > 0) {
                sum += nr;
            }
        }
        System.out.println("Shuma e numrave tek eshte : " + sum);

        /*int nr1, nr2, nr3, nr4, nr5;
        System.out.println("Shtyp nje numrin  nje: ");
        nr1 = scan.nextInt();
        System.out.println("Shtyp nje numrin  dy: ");
        nr2 = scan.nextInt();
        System.out.println("Shtyp nje numrin  tre: ");
        nr3 = scan.nextInt();
        System.out.println("Shtyp nje numrin  kater: ");
        nr4 = scan.nextInt();
        System.out.println("Shtyp nje numrin  pese: ");
        nr5 = scan.nextInt();
        int sum = 0;
        if (nr1 % 2 > 0) {
            sum += nr1;
        }
        if (nr2 % 2 > 0) {
            sum += nr2;
        }
        if (nr3 % 2 > 0) {
            sum += nr3;
        }
        if (nr4 % 2 > 0) {
            sum += nr4;
        }
        if (nr5 % 2 > 0) {
            sum += nr5;
        }*/

    }
}
