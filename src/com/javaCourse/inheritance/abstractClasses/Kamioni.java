package com.javaCourse.inheritance.abstractClasses;

public class Kamioni extends Automjeti {
    private boolean rimorkio;

    public Kamioni(int nrTiers, String manufacturer, boolean rimorkio) {
        super(nrTiers, manufacturer);
        super.setGear(0);
        this.rimorkio = rimorkio;
    }

    public boolean getRimorkio() {
        return rimorkio;
    }

    public void  setRimorkio() {
        this.rimorkio = rimorkio;
    }

    public void plusGear() {
        this.changeGear(super.getGear() + 1);
    }

    public void minusGear() {
        this.changeGear(super.getGear() - 1);
    }

    public void changeGear(int gearNr) {
        super.setGear(gearNr);
    }

    @Override
    public double calcSiperfaqja() {
        return 12313;
    }

    @Override
    public double calcPerimetri() {
        return 1241;
    }
}
