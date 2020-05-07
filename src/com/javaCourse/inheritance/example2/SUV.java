package com.javaCourse.inheritance.example2;

public class SUV extends Automjeti {
    private boolean eshte4x4;

    public SUV (int nrShasise,String prodhuesi,int vitiProdhimit,boolean eshte4x4){
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.eshte4x4=eshte4x4;
    }

    public boolean getEshte4x4(){
        return eshte4x4;
    }

    public void setEshte4x4(boolean eshte4x4) {
        this.eshte4x4 = eshte4x4;
    }

    @Override
    public boolean eshteAutomatik() {
        return false;
    }

    @Override
    public boolean kaTempomat() {
        return true;
    }

    @Override
    public int numriIShpejtesive() {
        return 5;
    }

    @Override
    public String toString() {
        return "SUV " + super.toString() + (eshte4x4 ? "" : " nuk") + " eshte 4x4.";
    }
}
