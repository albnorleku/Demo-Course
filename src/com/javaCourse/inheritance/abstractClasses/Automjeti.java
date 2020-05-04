package com.javaCourse.inheritance.abstractClasses;

import com.javaCourse.inheritance.interfaces.Shape;

public abstract class Automjeti implements Shape {
    private int nrTiers;
    private int gear;
    private String manufacturer;

    public Automjeti(int nrTiers, String manufacturer) {
        this.nrTiers = nrTiers;
        this.gear = gear;
        this.manufacturer = manufacturer;
    }

    public void setNrTiers(int nrTiers) {
        this.nrTiers = nrTiers;
    }

    public int getNrTiers() {
        return nrTiers;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    protected abstract void changeGear(int gearNr);
}
