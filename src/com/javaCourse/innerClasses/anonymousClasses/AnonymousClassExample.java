package com.javaCourse.innerClasses.anonymousClasses;

import com.javaCourse.helloWorld.Dog;

public class AnonymousClassExample {
    public static final String staticFinalTest = "TEST - 1";
    //public static String staticNonFinalTest = "TEST - 1";

    public static void main(String [] args) {
        String testVar = "test - 1";
        final String finalTestVar = "TEST - 1";

        HelloWorld sayHiInEnglish = new HelloWorld() {
            public void sayHi() {
                System.out.println("Hello" + staticFinalTest);
            }

            public String getFirstWord() {
                return "Hi there.";
            }

            //public static void getTesT(){} //cannot have static context inside anonymous classes
        };

        HelloWorld sayHiInAlbanian = new HelloWorld() {
            public void sayHi() {
                System.out.println("Pershendetje");
            }

            public String getFirstWord() {
                return "Tung tung";
            }
        };

        sayHiInEnglish.sayHi();
        System.out.println(sayHiInEnglish.getFirstWord());
        sayHiInAlbanian.sayHi();
        System.out.println(sayHiInAlbanian.getFirstWord());

        Dog dog = new Dog(2, "Filan") {
            public void walk() {
                System.out.println(getName() + " is running");
            }
        };
        dog.walk();
    }
}
