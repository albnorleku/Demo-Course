package com.javaCourse.inheritance.example2;

public class Limuzina extends Automjeti {
    private String ngjyra;

    public Limuzina(int nrShasise,String prodhuesi,int vitiProdhimit,String ngjyra){
        super(nrShasise,prodhuesi, vitiProdhimit);
        this.ngjyra = ngjyra;
    }

    @Override
    public boolean eshteAutomatik() {
        return true;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String getNgjyra(){
        return ngjyra;
    }

    @Override
    public boolean kaTempomat(){
        return false;
    }

    @Override
    public int numriIShpejtesive() {
        return 6;
    }

    public String toString(){
        return super.toString() + ngjyra;
    }
}
