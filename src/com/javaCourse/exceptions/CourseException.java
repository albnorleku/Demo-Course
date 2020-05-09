package com.javaCourse.exceptions;

public class CourseException extends Exception { //Create a custom exception with CourseException
    private String message;

    public CourseException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
