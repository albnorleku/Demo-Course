package com.javaCourse.h2Database.model;

public class BaseModel {
    private Integer id;

    public BaseModel(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
