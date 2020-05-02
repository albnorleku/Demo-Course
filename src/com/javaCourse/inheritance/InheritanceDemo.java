package com.javaCourse.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal animal = new Animal(2, 2);

        Cat cat = new Cat(3, "Cat Name", "Mac e thjesht");

        System.out.println(cat.getNrOfFeet());
        animal.makesSound();
        cat.makesSound();
        /*cat.setName("Cat 2");

        Animal catAnimal = new Cat(2, "Cat cat", "Mac e malit."); //Implicit casting (polymorphism in java)
        catAnimal.makesSound();
        Cat catFromAnimal = (Cat) catAnimal; //Explicit casting
        Animal horse = new Horse(2, 4); //Polymorphism

        System.out.println(animal instanceof Cat);
        System.out.println(cat instanceof Animal);
        System.out.println(catAnimal instanceof Cat);

        Animal.testStatic();
        Cat.testStatic();*/
    }
}
