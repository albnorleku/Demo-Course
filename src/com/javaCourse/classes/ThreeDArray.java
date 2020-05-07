package com.javaCourse.classes;

public class ThreeDArray {
    public static void main(String[] args) {
        String [][][] threeDArray = new String[2][2][2];
        threeDArray[0][0][0] = "a";
        threeDArray[0][0][1] = "b";
        threeDArray[0][1][0] = "c";

        for (int i = 0; i < threeDArray.length; i++) { //O(n^3)
            for (int c = 0; c < threeDArray[i].length; c++) {
                for (int a = 0; a < threeDArray[c].length; a++) {
                    System.out.println(threeDArray[i][c][a]);
                }
            }
        }
    }
}
