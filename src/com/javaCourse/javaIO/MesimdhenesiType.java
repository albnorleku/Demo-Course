package com.javaCourse.javaIO;

public enum  MesimdhenesiType {
    PROFESOR("Thirrje Akademike"),
    ASISTENT("Lloji i Ushtrimeve");

    private final String type;

    MesimdhenesiType(String s) {
        this.type = s;
    }

    public String getType() {
        return type;
    }
}
