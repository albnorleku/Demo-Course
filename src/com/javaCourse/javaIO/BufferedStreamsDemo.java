package com.javaCourse.javaIO;

import com.javaCourse.inheritance.example.*;

import java.io.*;
import java.nio.file.Files;

public class BufferedStreamsDemo {
    private static final String path = "C:\\Users\\albno\\Desktop\\Course\\TestProjects\\Mesimdhenesit.txt";

    public static void main(String[] args) {
        try {
            Fakulteti fakulteti = new Fakulteti("Test", 10);

            Mesimdhenesi [] mesimdhenesit = getMesimdhenesit(path);

            for (Mesimdhenesi mesimdhenesi : mesimdhenesit ) {
                if ( mesimdhenesi != null) {
                    System.out.println(mesimdhenesi);
                    fakulteti.shtoMesimdhenesin(mesimdhenesi);
                }
            }

            //Files.delete(path);

            System.out.println("Prof me fushe studimi: ");
            fakulteti.shtypFushaStudimit("Histori");
        } catch (MesimdhenesiException mesimdhenesiException) {
            mesimdhenesiException.printStackTrace();
        }
    }

    public static Mesimdhenesi [] getMesimdhenesit(String path) {
        //BufferedWriter
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Mesimdhenesi [] mesimdhenesit = new Mesimdhenesi[10];
            int mesimdhenesiCount = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String [] rreshti = line.split(";");
                Mesimdhenesi mesimdhenesi;
                String emri = rreshti[Mesimdhenesit.NAME.ordinal()];
                int vitiILindje = Integer.parseInt(rreshti[Mesimdhenesit.VITI_I_LINDJES.ordinal()]);
                String fushaES = rreshti[Mesimdhenesit.FUSHA_E_STUDIMIT.ordinal()];

                if (rreshti[4].equals(MesimdhenesiType.PROFESOR.name())) {
                    String thirrjaAkademike = rreshti[Mesimdhenesit.THIRRJA_OSE_LLOJI_I_USHTRIMEVE.ordinal()];
                    mesimdhenesi = new Profesori(emri, vitiILindje, fushaES, thirrjaAkademike);
                } else {
                    String llojiIUshtrimeve = rreshti[Mesimdhenesit.THIRRJA_OSE_LLOJI_I_USHTRIMEVE.ordinal()];
                    mesimdhenesi = new Asistenti(emri, vitiILindje, fushaES, llojiIUshtrimeve);
                }
                mesimdhenesit[mesimdhenesiCount++] = mesimdhenesi;
            }
            return mesimdhenesit;
        } catch (IOException | MesimdhenesiException e) {
            e.printStackTrace();
        }
        return null;
    }
}
