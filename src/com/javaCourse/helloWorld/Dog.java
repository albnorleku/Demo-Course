package com.javaCourse.helloWorld;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void walk() {
        System.out.println( name + " is walking");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog goodBoy = new Dog(3, "dogo");
        goodBoy.walk();
    }
}
