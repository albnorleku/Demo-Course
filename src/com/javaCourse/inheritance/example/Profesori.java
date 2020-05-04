package com.javaCourse.inheritance.example;

public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiILindjes, String fushaEStudimit, String thirrjaAkademike) {
        super(emri, vitiILindjes, fushaEStudimit);
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return  thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike) {
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getAngazhimi() {
        return "Ligjerata";
    }

    public String toString() {
        return super.toString() + ", ka thirrje " + thirrjaAkademike;
    }
}
