package com.javaCourse.inheritance.example2;

public interface Vozitet {
    int numriIShpejtesive();

    default boolean kaTempomat(){
        return true;
    }
}
