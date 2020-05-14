package com.javaCourse.javaIO.controller;

import com.javaCourse.inheritance.example.*;
import com.javaCourse.javaIO.BufferedStreamsDemo;
import com.javaCourse.javaIO.service.FakultetiService;

import java.io.IOException;

public class FakultetiController {

    public static void main(String[] args) {
        try {
            Fakulteti fakulteti = new Fakulteti("Shkenca Kompjuterike", 15);

            Mesimdhenesi mesimdhenesi1 = new Profesori("Filan", 1975, "Matematik", "Prof. Dr.");
            Mesimdhenesi mesimdhenesi2 = new Profesori("Fisteki", 1968, "Histori", "Master");
            Mesimdhenesi mesimdhenesi3 = new Asistenti("Ali", 1985, "Java", "Java For Beginners");
            Mesimdhenesi mesimdhenesi4 = new Asistenti("Blerta", 1989, "Matematik", "Algjeber");

            fakulteti.shtoMesimdhenesin(mesimdhenesi1);
            fakulteti.shtoMesimdhenesin(mesimdhenesi2);
            fakulteti.shtoMesimdhenesin(mesimdhenesi3);
            fakulteti.shtoMesimdhenesin(mesimdhenesi4);

            FakultetiService fakultetiService = new FakultetiService(BufferedStreamsDemo.PATH);
            fakultetiService.saveMesimdhenesitPrejFakulteti(fakulteti);
        } catch (MesimdhenesiException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
