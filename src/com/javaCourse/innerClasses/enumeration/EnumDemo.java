package com.javaCourse.innerClasses.enumeration;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.MONDAY.getDayInAlbanian());

        printWithEnums(Days.SATURDAY);
    }

    public static void printWithEnums(Days day) {
        switch (day) {
            case MONDAY: {
                System.out.println("Today is Monday!");
            }
            case FRIDAY: {
                System.out.println("Friday is the last day");
            }
            case SATURDAY:
            case SUNDAY: {
                System.out.println("Week end days!");
            }
        }
    }
}
