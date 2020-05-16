package com.javaCourse.singleton;

import com.javaCourse.helloWorld.Dog;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        singletonClass.setName("Filani");

        System.out.println(singletonClass.getName());
        System.out.println(singletonClass2.getName());

        Dog dog1 = new Dog(2, "test");
        Dog dog2 = new Dog(2, "test");

        System.out.println("Are identical -> " + singletonClass.equals(singletonClass2));
        System.out.println("Are identical -> " + dog1.equals(dog2));
    }
}
