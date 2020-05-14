package com.javaCourse.inheritance.example;

public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi [] mesimdhenesit;
    private int index = 0;

    public Fakulteti(String drejtimi, int nrMesimdhenesve) throws MesimdhenesiException {
        if (drejtimi == null || drejtimi.isEmpty()) {
            throw new MesimdhenesiException("Drejtimi nuk mund te jete i zbrazet!");
        }
        if (nrMesimdhenesve < 0) {
            throw new MesimdhenesiException("Nuk mund te jete vler negative!");
        }
        this.drejtimi = drejtimi;
        mesimdhenesit = new Mesimdhenesi[nrMesimdhenesve];
    }

    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi) throws MesimdhenesiException {
        if (mesimdhenesi == null) {
            throw new MesimdhenesiException("Mesimdhenesi nuk mund te jete null");
        }
        if (index == mesimdhenesit.length) {
            throw new MesimdhenesiException("Nuk ka vend ne array!");
        }
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].equals(mesimdhenesi)) {
                throw new MesimdhenesiException("Mesimdhenesi ekziston!");
            }
        }
        mesimdhenesit[index++] = mesimdhenesi;
    }

    public void shtypFushaStudimit(String fushaEStudimit) throws MesimdhenesiException {
        if (fushaEStudimit == null || fushaEStudimit.isEmpty()) {
            throw new MesimdhenesiException("Fusha e studimit nuk mund te jete e zbrazet");
        }
        for (int c = 0; c < index; c++) { //10 her
            Mesimdhenesi mesimdhenesi = mesimdhenesit[c];
            if (mesimdhenesi.getFushaEStudimit().equals(fushaEStudimit)) { // 5
                System.out.println(mesimdhenesi.toString());
            }
        }
    }

    public Mesimdhenesi [] ktheAngazhimin(String angazhimi) throws MesimdhenesiException {
        if (angazhimi == null || angazhimi.isEmpty()) {
            throw new MesimdhenesiException("Angazhimi nuk mund te jete e zbrazet");
        }
        Mesimdhenesi [] mesimdhenesitEAngazhimit = new Mesimdhenesi[index];
        int indx = 0;
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].getAngazhimi().equals(angazhimi)) {
                mesimdhenesitEAngazhimit[indx++] = mesimdhenesit[i];
            }
        }
        return mesimdhenesitEAngazhimit;
    }

    public Mesimdhenesi [] getMesimdhenesit() {
        return mesimdhenesit;
    }

    public static void main(String [] arg) {
        try {
            Fakulteti fakulteti = new Fakulteti("Shkenca Kompjuterike", 15);

            Mesimdhenesi mesimdhenesi1 = new Profesori("Filan", 1975, "Matematik", "Prof. Dr.");
            Mesimdhenesi mesimdhenesi2 = new Profesori("Fisteki", 1968, "Histori", "Master");
            Mesimdhenesi mesimdhenesi3 = new Asistenti("Ali", 1985, "Java", "Java For Beginners");
            Mesimdhenesi mesimdhenesi4 = new Asistenti("Blerta", 1989, "Matematik", "Algjeber");
            /*Mesimdhenesi mesimdhenesi5 = null;
            mesimdhenesi5.getAngazhimi();*/ //throws nullPointerException

            fakulteti.shtoMesimdhenesin(mesimdhenesi1);
            fakulteti.shtoMesimdhenesin(mesimdhenesi2);
            fakulteti.shtoMesimdhenesin(mesimdhenesi3);
            fakulteti.shtoMesimdhenesin(mesimdhenesi4);
            fakulteti.shtoMesimdhenesin(mesimdhenesi2);

            for(int i = 0; i < fakulteti.index; i++) {
                System.out.println(fakulteti.mesimdhenesit[i]);
            }

            System.out.println(" ============================ ");

            fakulteti.shtypFushaStudimit("Matematik");

            System.out.println("Mesimdhenesit e Historis: ");
            fakulteti.shtypFushaStudimit("Histori");

            Mesimdhenesi [] profesorat = fakulteti.ktheAngazhimin("Ushtrime");
            // [0, 1, 2, 3]
            System.out.println("Mesimdhenesit me angazhim ushtrime jane: ");
            for (Mesimdhenesi mesimdhenesi : profesorat) {
                if (mesimdhenesi != null) {
                    System.out.println(mesimdhenesi.toString());
                }
            }
        } catch (MesimdhenesiException mesimdhenesiException) {
            mesimdhenesiException.printStackTrace();
        } finally {
            System.out.println("Programi u perfundu!");
        }
        // logic ....
    }
}
