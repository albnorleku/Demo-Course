package com.javaCourse.inheritance.example;

public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiILindjes, String fushaEStudimit, String thirrjaAkademike) throws MesimdhenesiException{
        super(emri, vitiILindjes, fushaEStudimit);
        if ( thirrjaAkademike == null || thirrjaAkademike.isEmpty()) {
            throw new MesimdhenesiException("Thirrja Akademike nuk mund te jete e zbrazet!");
        }
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return  thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike)  throws MesimdhenesiException{
        if (thirrjaAkademike == null || thirrjaAkademike.isEmpty()) {
            throw new MesimdhenesiException("Thirrja Akademike nuk mund te jete e zbrazet!");
        }
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getAngazhimi() {
        return "Ligjerata";
    }

    public String toString() {
        return super.toString() + ", ka thirrje " + thirrjaAkademike;
    }
}
