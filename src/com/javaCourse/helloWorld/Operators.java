package com.javaCourse.helloWorld;

public class Operators {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double nrA = 3.0;
        double f = nrA / b;
        System.out.println(++a);
        System.out.println(a);
        b--;
        //System.out.println(a);
        //System.out.println(c);
        relOperators();

        //ternary operator
        //a == 2 ? b : c;
        int nr = 4;
        String value = nr % 2 == 0 ? "Qift": "Tek";
        System.out.println(value);

        //instanceof operator
        Dog dog = new Dog(2, "name");
        boolean isDog = dog instanceof Object;
        System.out.println(isDog);
        example();
    }

    public static void relOperators() {
        int a = 3;
        int b = 4;
        b -= 3; // b = b - 3;

        System.out.println(!(a == b));
    }

    public static void example() {
        int i = 10;
        int n = i++%5;//what is n?
        System.out.println("Result is : " + n);
        System.out.println("Result of i: " + i);
    }
}
