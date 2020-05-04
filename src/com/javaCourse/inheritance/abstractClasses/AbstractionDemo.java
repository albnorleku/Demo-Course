package com.javaCourse.inheritance.abstractClasses;

import java.util.HashMap;

public class AbstractionDemo {
    public static void main(String[] args) {
        Kamioni kamioni = new Kamioni(6, "MAN", true);
        //kamioni.changeGear(2);
        kamioni.plusGear();
        System.out.println(kamioni.getGear());
        kamioni.plusGear();
        System.out.println(kamioni.getGear());
    }
}
