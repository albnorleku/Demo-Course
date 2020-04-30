package com.javaCourse.controlFlows.examples;
/*
Shkruani nje program qe pranon fjal string dhe i tregon userit se a eshte fjala palindrome ose jo.
 */

import java.util.Scanner;

public class PalindromeExample {
    //ANNA = ['A', 'N', 'N', 'A']
    //RAMUSH AGA SHUMAR
    //HELLO
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtyp nje fjal: ");
        String fjalia = scan.nextLine();
        String fjaliaReverse = reverseString(fjalia);

        /*if(fjalia.equalsIgnoreCase(fjaliaReverse)) {
            System.out.println("Fjala eshte palindrome");
        } else {
            System.out.println("Fjala nuk eshte palindrome");
        }*/
        String mesazhi = fjalia.equalsIgnoreCase(fjaliaReverse) ? "Fjala eshte palindrome" : "Fjala nuk eshte palindrome";
        System.out.println(mesazhi);
    }

    private static String reverseString(String fjali) {
        char [] karakteret = fjali.toCharArray();
        //fjali.split("") returns an array of Strings
        String reverseString = "";
        for(int i = karakteret.length-1; i >= 0; i--) {
            reverseString += karakteret[i];
        }
        return reverseString;
    }
}
