package com.javaCourse.controlFlows.examples;

/*
Shkruani kodin e programit Numrat i cili mundëson llogaritjen e mesatares së numrave të shtypur, përqindjen e numrave pozitiv si dhe sa nga numrat e shtypur ishin numra negativ.
 - Udhëzoni shfrytëzuesin të shtyp madhësinë e vargut, përderisa inputi nuk është së paku 10. (Nuk pranohet përdorimi i komandës break për terminim të unazës)
 - Të kërkohet nga shfrytëzuesi t’i plotësoj vlerat e vargut me numra të plotë 32 bit. Të merren parasysh vetëm ata numra që janë në rangun -250 ... 250.
 - Të shfaqet mesatarja e numrave të shtypur (p.sh 32.8), përqindja e numrave pozitiv (p.sh. 70.0%) dhe sa nga numrat e shtypur ishin numra negativ (p.sh. 3), vlera që vijnë si rezultat nga metoda kalkuloVlerat  e cila e pranon vargun e numrave. Output-i duhet të jetë i lexueshëm për shfrytëzuesin.
 - Rezultati i plotë duhet të kalkulohet dhe kthehet me vetëm një thirrje të metodës kalkuloVlerat dhe nuk pranohet rezultati i tipit String, StringBuilder, StringBuffer apo çfarëdo forme të Stringut. Nuk pranohet as kalkulimi përmes variablave të instancës apo atyre të klasës.
 */

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int madhesiaEVargut = 0;

        do {
            System.out.println("Shtyp gjetesin e vargut:");
            madhesiaEVargut = scanner.nextInt();
        } while(madhesiaEVargut < 10);

        int [] vargu = new int[madhesiaEVargut];
        for(int i = 0; i < madhesiaEVargut;) {
            System.out.println("Shtyp vleren per poziten " + i);
            int vlera = scanner.nextInt();
            if (vlera >= -250 && vlera <= 250) {
                vargu[i++] = vlera;
            } else {
                System.out.println("Vlera e shtypur gabim, shtyp pra!");
            }
        }

        double [] rezultati = kalkuloVlerat(vargu);

        System.out.println("Mesatarja e numrave te shtypur: " + rezultati[0]);
        System.out.println("Perqindja e numrave pozitiv: " + rezultati[1] + "%");
        System.out.println("Totali i numrave negativ: " + ((int)rezultati[2]));
    }

    private static double[] kalkuloVlerat(int [] vargu) {
        int shuma = 0;
        int counterPositive = 0;
        int counterNegative = 0;
        for (int nr : vargu) {
            shuma += nr;
            if (nr >= 0) {
                counterPositive++;
            }
            if (nr < 0) {
                counterNegative++;
            }
        }
        double mesatarjeENr = ((double)shuma) / vargu.length; // primitive casting procesi i konvertimit te nje variable primitive nga nje tip ne tipin tjeter psh. int ne double   (int)10.32 = 10
        double perqindjaENrPozitiv = (((double) counterPositive) / vargu.length) * 100;
        double [] rezultati = {mesatarjeENr, perqindjaENrPozitiv, counterNegative};
        return rezultati;
    }
}
