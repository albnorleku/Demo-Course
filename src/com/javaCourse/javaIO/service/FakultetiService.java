package com.javaCourse.javaIO.service;

import com.javaCourse.inheritance.example.Fakulteti;
import com.javaCourse.inheritance.example.Mesimdhenesi;
import com.javaCourse.inheritance.example.MesimdhenesiException;
import com.javaCourse.inheritance.example.Profesori;
import com.javaCourse.javaIO.MesimdhenesiType;
import com.javaCourse.javaIO.repository.FakultetiRepository;

import java.io.IOException;

public class FakultetiService {
    private FakultetiRepository fakultetiRepository;

    public FakultetiService(String path) throws IOException {
        fakultetiRepository = new FakultetiRepository(path);
    }

    public void saveMesimdhenesitPrejFakulteti(Fakulteti fakulteti) throws MesimdhenesiException, IOException {
        Mesimdhenesi [] mesimdhenesit = fakulteti.getMesimdhenesit();

        if (mesimdhenesit.length == 0) {
            throw new MesimdhenesiException("Nuk ka mesimdhenes");
        }

        for (Mesimdhenesi mesimdhenesi : mesimdhenesit) {
            if (mesimdhenesi != null) {
                String mesimdhenesiTransformed = transformMesimdhenesi(mesimdhenesi);
                fakultetiRepository.saveMesimdhenesit(mesimdhenesiTransformed);
            }
        }

        fakultetiRepository.closeBuffer();
    }

    private String transformMesimdhenesi(Mesimdhenesi mesimdhenesi) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mesimdhenesi.getEmri()).append(";");
        stringBuilder.append(mesimdhenesi.getVitiILindjes()).append(";");
        stringBuilder.append(mesimdhenesi.getFushaEStudimit()).append(";");
        stringBuilder.append(mesimdhenesi.getAngazhimi()).append(";");
        if (mesimdhenesi instanceof Profesori) {
            stringBuilder.append(MesimdhenesiType.PROFESOR);
        } else {
            stringBuilder.append(MesimdhenesiType.ASISTENT);
        }
        return stringBuilder.toString();
    }
}
