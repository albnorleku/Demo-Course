package com.javaCourse.inheritance.example2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AutoSalloni {
    private String emri;
    private Set<Automjeti> automjetet;

    public AutoSalloni(String emri) {
        this.emri = emri;
        this.automjetet = new HashSet<>();
    }

    public void shtoAutomjetin(Automjeti automjet) {
        /*if (automjetet.length == index) {
            System.out.println("Nuk ka vend ne Varg!");
            return;
        }*/
        for(Automjeti aut : automjetet) {
            if (aut.equals(automjet)) {
                System.out.println("Automjeti ekziston!");
                return;
            }
        }
        automjetet.add(automjet);
    }

    public void shtypNumriIShpejtsive(int nrIShpejtesis) {
        automjetet.forEach(automjeti -> {
            if (automjeti.numriIShpejtesive() == nrIShpejtesis) {
                System.out.println(automjeti.toString());
            }
        });
        /*for (int i = 0; i < index; i++) {
            if (automjetet[i].numriIShpejtesive()==nrIShpejtesis) {
                System.out.println(automjetet[i].toString());
            }
        }*/
    }

    public Set<Automjeti> ktheMeTempomat(boolean kaTempomat) {
        Set<Automjeti> tempAuto = new HashSet<>();
        for (Automjeti automjeti : automjetet) {
            if (automjeti.kaTempomat()) {
                tempAuto.add(automjeti);
            }
        }
        return tempAuto;
    }

    public Set<Automjeti> ktheMeTempomatMeStreams(boolean kaTempomat) {
        return automjetet.stream()
                .filter(automjeti -> automjeti.kaTempomat() == kaTempomat)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        AutoSalloni autoSalloni = new AutoSalloni("Te JAVA");

        Automjeti automjeti1 = new SUV(213423, "JEEP", 2005, true);
        Automjeti automjeti2 = new Limuzina(23151, "Mercedes", 2015, "E zeze");
        Automjeti automjeti3 = new SUV(41231, "Range Rover", 2017, false);
        Automjeti automjeti4 = new Limuzina(213131, "BMW", 2020, "E kuqe");

        autoSalloni.shtoAutomjetin(automjeti1);
        autoSalloni.shtoAutomjetin(automjeti2);
        autoSalloni.shtoAutomjetin(automjeti3);
        autoSalloni.shtoAutomjetin(automjeti4);

        Automjeti anonymousAutomjet = new Automjeti(3341, "Golf", 2017) {
            private boolean gomeRezerv;

            @Override
            public int numriIShpejtesive() {
                return 6;
            }

            @Override
            public boolean kaTempomat() {
                return true;
            }

            @Override
            public boolean eshteAutomatik() {
                return true;
            }

            public boolean getGomeRezerve() {
                return gomeRezerv;
            }

            public void setGomeRezerv() {
                this.gomeRezerv = gomeRezerv;
            }

            public String toString() {
                return super.toString() + (gomeRezerv ? " ka " : " nuk ka ") + " gome rezerve";
            }
        };

        autoSalloni.shtoAutomjetin(anonymousAutomjet);

        System.out.println("Veturat me 6 shpejtesi: ");
        autoSalloni.shtypNumriIShpejtsive(6);
        System.out.println("Veturat me 5 shpejtesi: ");
        autoSalloni.shtypNumriIShpejtsive(5);

        System.out.println("Vetura me tempomat: ");
        Set<Automjeti> automjetetMeTempomat = autoSalloni.ktheMeTempomat(true);
        for (Automjeti automjeti : automjetetMeTempomat) {
            if (automjeti != null) {
                System.out.println(automjeti.toString());
            }
        }

        Vozitet bike = new Vozitet() {
            @Override
            public int numriIShpejtesive() {
                return 21;
            }

            @Override
            public boolean kaTempomat() {
                return true;
            }
        };

        Vozitet [] gjeratQeVoziten = new Vozitet[5];
        gjeratQeVoziten[0] = anonymousAutomjet;
        gjeratQeVoziten[1] = bike;
        gjeratQeVoziten[2] = automjeti1;
        gjeratQeVoziten[3] = automjeti2;
        gjeratQeVoziten[3] = automjeti4;

        //autoSalloni.shtoAutomjetin(bike); // can not add on array...
    }
}
