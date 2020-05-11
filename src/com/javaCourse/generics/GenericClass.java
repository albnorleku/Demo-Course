package com.javaCourse.generics;

import com.javaCourse.inheritance.example.Mesimdhenesi;
import com.javaCourse.inheritance.example.MesimdhenesiException;
import com.javaCourse.inheritance.example.Profesori;

public class GenericClass<E> { //Generic Class
    private E value;

    public GenericClass(E value) {
        this.value = value;
    }

    public GenericClass() {
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public static void main(String[] args) throws MesimdhenesiException {
        GenericClass<String> genericClassOfString = new GenericClass<>();
        genericClassOfString.setValue("Hello World");

        GenericClass<Integer> genericClassOfInt = new GenericClass<>();
        genericClassOfInt.setValue(23131);


        Mesimdhenesi mesimdhenesi = new Profesori("filan", 1993, "Math", "Prof");
        GenericClass<Mesimdhenesi> genericClass = new GenericClass<>();
        genericClass.setValue(mesimdhenesi);

        System.out.println(genericClass.getValue().toString());
        System.out.println(genericClassOfString.getValue());
        System.out.println(genericClassOfInt.getValue());
    }
}
