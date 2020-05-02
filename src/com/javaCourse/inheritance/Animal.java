package com.javaCourse.inheritance;

public class Animal {
    private int age;
    private int nrOfFeet;

    public Animal(int age, int nrOfFeet) {
        this.age = age;
        this.nrOfFeet = nrOfFeet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNrOfFeet(int nrOfFeet) {
        this.nrOfFeet = nrOfFeet;
    }

    public int getNrOfFeet() {
        return nrOfFeet;
    }

    public void makesSound() {
        System.out.println("Animals make sound!");
    }

    private void doSomethingPrivate() {
        System.out.println("Private method!");
    }

    public static void testStatic() {
        System.out.println("Static in animal.");
    }
}
