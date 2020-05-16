package com.javaCourse.singleton;

public class SingletonClass {
    private static SingletonClass instance;
    private String name;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
