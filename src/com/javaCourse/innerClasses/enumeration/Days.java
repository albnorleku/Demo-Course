package com.javaCourse.innerClasses.enumeration;

public enum Days {
    MONDAY("E hene"),
    TUESDAY("E marte"),
    WEDNESDAY("E merkure"),
    THURSDAY("E enjte"),
    FRIDAY("E premte"),
    SATURDAY("E shtune"),
    SUNDAY("E diele");

    private final String daysInAlbanian;

    Days(String daysInAlbanian) {
        this.daysInAlbanian = daysInAlbanian;
    }

    public String getDayInAlbanian() {
        return daysInAlbanian;
    }
}
