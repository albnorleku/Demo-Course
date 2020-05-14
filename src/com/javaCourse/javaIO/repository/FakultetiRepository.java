package com.javaCourse.javaIO.repository;

import com.javaCourse.inheritance.example.Mesimdhenesi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FakultetiRepository {

    private BufferedWriter bufferedWriter;

    public FakultetiRepository(String path) throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(path, true));
    }

    public void saveMesimdhenesit(String mesimdhensi) throws IOException {
        System.out.println(mesimdhensi);
        bufferedWriter.newLine();
        bufferedWriter.write(mesimdhensi);
        bufferedWriter.flush();
    }

    public void closeBuffer() throws IOException {
        this.bufferedWriter.close();
    }
}
