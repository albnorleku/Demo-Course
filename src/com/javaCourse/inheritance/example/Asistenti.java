package com.javaCourse.inheritance.example;

public class Asistenti extends Mesimdhenesi {
    private String llojiIUshtrimeve;

    public Asistenti(String emri, int vitiILindjes, String fushaEStudimit, String llojiIUshtrimeve)
            throws MesimdhenesiException  {
        super(emri, vitiILindjes, fushaEStudimit);
        if (llojiIUshtrimeve == null || llojiIUshtrimeve.isEmpty()) {
            throw new MesimdhenesiException("Lloji i ushtrimeve nuk mund te jete i zbrazet");
        }
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    public void setLlojiIUshtrimeve(String llojiIUshtrimeve) throws MesimdhenesiException{
        if (llojiIUshtrimeve != null || llojiIUshtrimeve.isEmpty()) {
            throw new MesimdhenesiException("Lloji i ushtrimeve nuk mund te jete i zbrazet");
        }
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
