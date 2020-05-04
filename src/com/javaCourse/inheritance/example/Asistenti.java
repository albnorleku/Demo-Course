package com.javaCourse.inheritance.example;

public class Asistenti extends Mesimdhenesi {
    private String llojiIUshtrimeve;

    public Asistenti(String emri, int vitiILindjes, String fushaEStudimit, String llojiIUshtrimeve) {
        super(emri, vitiILindjes, fushaEStudimit);
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    public void setLlojiIUshtrimeve(String llojiIUshtrimeve) {
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    public String getLlojiIUshtrimeve() {
        return llojiIUshtrimeve;
    }

    public String getAngazhimi() {
        return "Ushtrime";
    }

    public boolean mentoron() {
        return false;
    }

    public String toString() {
        return super.toString() + " " + llojiIUshtrimeve;
    }
}
