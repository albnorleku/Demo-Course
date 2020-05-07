package com.javaCourse.classes.examples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gjatesiaEV = 0;
        do {
            System.out.println("Shtyp gjatesin e vargut");
            gjatesiaEV = scanner.nextInt();
        } while (gjatesiaEV < 5);
        String [] vargu = new String[gjatesiaEV];

        for (int i = 0; i < vargu.length;) {
            System.out.println("Shkruaj nje fjali me numer cift te shkronjave: ");
            String fjalia = scanner.nextLine();
            if (fjalia.length() % 2 == 0) {
                vargu[i] = fjalia;
                i++;
            } else {
                System.out.println("Gabim Fjali, shtyp prap: ");
            }
        }

        String [] rezultati = testoFajlite(vargu);

        System.out.println("Fjalite qe e plotesojn kushtin jane: ");
        for (String fjali : rezultati) {
            if (fjali != null) {
                System.out.println(fjali);
            }
        }
    }

    public static String [] testoFajlite(String [] vargu) {
        String [] tempArray = new String[vargu.length];
        int index = 0;
        for (String fjalia : vargu) {
            String [] fjaletNeFjali = fjalia.split(" ");
            if (fjaletNeFjali.length >= 4) {
                int count = 0;
                for (String fjala: fjaletNeFjali) {
                    String gjysmaEPareEFjales = fjala.substring(0, (fjala.length() / 2)); //gjysma e pare e fjales
                    if (gjysmaEPareEFjales.contains("shk") || gjysmaEPareEFjales.contains("SHK")) {
                        count++;
                        if (count > 1) {
                            tempArray[index++] = fjalia;
                            break;
                        }
                    }
                }
            }
        }
        return tempArray;
    }
}
