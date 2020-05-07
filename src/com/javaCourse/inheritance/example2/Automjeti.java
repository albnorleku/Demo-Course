package com.javaCourse.inheritance.example2;

public abstract class Automjeti implements Vozitet {
    private int nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;

    public Automjeti(int nrShasise, String prodhuesi, int vitiProdhimit) {
        this.nrShasise = nrShasise;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = vitiProdhimit;
    }

    public int getNrShasise() {
        return nrShasise;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public abstract boolean eshteAutomatik();

    public String toString() {
        return nrShasise + " : " + prodhuesi + "-" + vitiProdhimit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Automjeti) {
            Automjeti automjeti = (Automjeti) obj;
            return automjeti.getNrShasise() == nrShasise;
        }
        return false;
    }
}
