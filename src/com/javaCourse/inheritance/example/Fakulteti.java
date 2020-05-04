package com.javaCourse.inheritance.example;

public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi [] mesimdhenesit;
    private int index = 0;

    public Fakulteti(String drejtimi, int nrMesimdhenesve) {
        this.drejtimi = drejtimi;
        mesimdhenesit = new Mesimdhenesi[nrMesimdhenesve];
    }

    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi) {
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].equals(mesimdhenesi)) {
                System.out.println("Mesimdhenesi ekziston!");
                return;
            }
        }
        mesimdhenesit[index++] = mesimdhenesi;
    }

    public void shtypFushaStudimit(String fushaEStudimit) {
        for (int c = 0; c < index; c++) { //10 her
            Mesimdhenesi mesimdhenesi = mesimdhenesit[c];
            if (mesimdhenesi.getFushaEStudimit().equals(fushaEStudimit)) { // 5
                System.out.println(mesimdhenesi.toString());
            }
        }
    }

    public Mesimdhenesi [] ktheAngazhimin(String angazhimi) {
        Mesimdhenesi [] mesimdhenesitEAngazhimit = new Mesimdhenesi[index];
        int indx = 0;
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].getAngazhimi().equals(angazhimi)) {
                mesimdhenesitEAngazhimit[indx++] = mesimdhenesit[i];
            }
        }
        return mesimdhenesitEAngazhimit;
    }

    public static void main(String [] arg) {
        Fakulteti fakulteti = new Fakulteti("Shkenca Kompjuterike", 15);

        Mesimdhenesi mesimdhenesi1 = new Profesori("Filan", 1975, "Matematik", "Prof. Dr.");
        Mesimdhenesi mesimdhenesi2 = new Profesori("Fisteki", 1970, "Histori", "Master");
        Mesimdhenesi mesimdhenesi3 = new Asistenti("Ali", 1985, "Java", "Java For Beginners");
        Mesimdhenesi mesimdhenesi4 = new Asistenti("Blerta", 1989, "Matematik", "Algjeber");

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
    }
}
