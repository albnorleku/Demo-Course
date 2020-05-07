package com.javaCourse.classes;

public class TwoDArray {
    public static void main(String[] args) {
        String [][] twoDArray = new String[2][3];
        twoDArray[0][0] = "abc";
        twoDArray[0][1] = "test";
        twoDArray[1][1] = "hi";
        twoDArray[0][2] = "hello";
        twoDArray[1][2] = "tung";
        twoDArray[1][0] = "prsh";

        for (int i = 0; i < twoDArray.length; i++) {
            for (int c = 0; c < twoDArray[i].length; c++) {
                System.out.println(i + " -> " + c + " = " + twoDArray[i][c]);
            }
        }

        char [][] char2D = {{'a', 'b', 'c'},
                            {'e', 'g', 'z'},
                            {'l', 'h', 's'}};

        for(char [] arr : char2D) {
            for (char c : arr) {
                System.out.println(c);
            }
        }
    }
    // [[null, null, null], [null,null,null]]
}
