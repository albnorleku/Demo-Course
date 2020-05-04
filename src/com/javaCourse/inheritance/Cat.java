package com.javaCourse.inheritance;

import com.javaCourse.inheritance.interfaces.ThreeDShape;

public class Cat extends Animal implements ThreeDShape { //IS-A relationship
    private String name;
    private String breed;

    public Cat(int age, String name, String breed) {
        super(age, 4); //must be in first line
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makesSound() { //Method overriding
        super.makesSound(); //with super u access members of parent class.
        System.out.println("Meow meow");
    }

    public static void testStatic() {
        System.out.println("Static in cat.");
    }

    @Override
    public double calcVellimi() {
        return 0;
    }

    @Override
    public double calcSiperfaqja() {
        return 0;
    }

    @Override
    public double calcPerimetri() {
        return 0;
    }
}
