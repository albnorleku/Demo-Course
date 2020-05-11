package com.javaCourse.generics;

import com.javaCourse.inheritance.example2.Automjeti;
import com.javaCourse.inheritance.example2.SUV;

public class GenericDemo {
    public static void main(String[] args) {
        Integer [] integers = {1, 2, 3, 23123, -31};
        Double [] doubles = {3.14, 231.3111, -31.3};
        String [] strings = {"hello", "hi", "this is a string"};
        Automjeti [] automjetet = {};

        printArrays(integers);

        printArrays(doubles);

        printArrays(strings);

        printArrays(automjetet);
    }

    public static <T> void printArrays(T [] arrays) {
        for(T value : arrays) {
            System.out.println(value);
        }
    }
}
