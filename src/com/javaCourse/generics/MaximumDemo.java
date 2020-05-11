package com.javaCourse.generics;

public class MaximumDemo {
    public static void main(String[] args) {
        Integer maximum = findMaximum(2, 31, -31, 9, 0);
        System.out.println("Maximum of 2, 31, -31, 9, 0 is -> " + maximum);

        Double maximumDoubles = findMaximum(3.14, 23.3, 23131.33, -31.33);
        System.out.println("Maximum of 3.14, 23.3, 23131.33, -31.33 is -> " + maximumDoubles);

        String maxString = findMaximum("abc", "cba", "bce");
        System.out.println("Maximum of \"abc\", \"cba\", \"bce\" is -> " + maxString);
    }

    private static <T extends Comparable<T>> T findMaximum(T ... values) {
        T maxValue = null; //2

        for (T value : values) {
            if (maxValue == null || maxValue.compareTo(value) < 0) { //compareTo returns 0, 1, -1
                maxValue = value;
            }
        }
        return maxValue;
    }
}
