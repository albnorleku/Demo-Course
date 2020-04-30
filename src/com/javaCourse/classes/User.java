package com.javaCourse.classes;

public class User {
    private String name;
    private int age;
    private String email;
    private String [] nickNames;

    private static int nrOfUsers;
    private static final String type = "Human";

    /**
     * Static Block
     */
    static {
       nrOfUsers = 0;
    }

    /**
     * Initialization Block
     */
    {
        age = 10;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        nrOfUsers += 1;
    }

    public User() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || name.isEmpty()) {
            System.out.println("Emri nuk mund te jete i zbrazet");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public void setNickNames(String [] nickNames, int size) {
        this.nickNames = nickNames;
    }

    public void setNickNames(String... nickNames) {

    }

    public static int getNrOfUsers() {
        return nrOfUsers;
    }

    public String toString() {
        return name + " - " + age +" with email: " + email;
    }

    public boolean equals(Object object) {
        if (object instanceof User) {
            User user = (User) object;
            return user.name.equals(this.name) && user.email.equals(this.email);
        }
        return false;
    }

    public int hashCode() {
        return 237131283;
    }
}
