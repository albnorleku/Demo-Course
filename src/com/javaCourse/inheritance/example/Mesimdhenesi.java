package com.javaCourse.inheritance.example;

public abstract class Mesimdhenesi implements Angazhohet {
    private String emri;
    private int vitiILindjes;
    private String fushaEStudimit;

    public Mesimdhenesi(String emri, int vitiILindjes, String fushaEStudimit) throws MesimdhenesiException {
        if (emri == null || emri.isEmpty()) {
            throw new MesimdhenesiException("Emri nuk mund te jete i zbrazet!");
        }
        if(vitiILindjes < 0) {
            throw new MesimdhenesiException("Viti i lindjes nuk mund te jete Negativ");
        }
        if (fushaEStudimit == null || fushaEStudimit.isEmpty()) {
            throw new MesimdhenesiException("Fusha e Studimit nuk mund te jete i zbrazet!");
        }
        this.emri = emri;
        this.vitiILindjes = vitiILindjes;
        this.fushaEStudimit = fushaEStudimit;
    }

    public String getEmri() {
        return emri;
    }

    public void setVitiILindjes(int vitiILindjes) {
        this.vitiILindjes = vitiILindjes;
    }

    public int getVitiILindjes() {
        return vitiILindjes;
    }

    public String getFushaEStudimit() {
        return fushaEStudimit;
    }

    public void setFushaEStudimit(String fushaEStudimit) {
        this.fushaEStudimit = fushaEStudimit;
    }

    public String toString() {
        return emri + " : " + vitiILindjes + " me fushe studimit " + fushaEStudimit;
    }

    public boolean equals(Object object) {
        if (object instanceof Mesimdhenesi) {
            Mesimdhenesi tempMesimdhensi = (Mesimdhenesi) object;
            return this.emri.equals(tempMesimdhensi.getEmri()) &&
                    this.vitiILindjes == tempMesimdhensi.getVitiILindjes();
        } else {
            return false;
        }
    }
}
