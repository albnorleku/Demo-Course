package com.javaCourse.inheritance.example;

public class MesimdhenesiException extends Exception { //Checked Exception
    private String message;

    public MesimdhenesiException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * Method Override from class Throwable...
     *
     * @return
     */
    @Override
    public String getMessage() {
        return message;
    }
}
