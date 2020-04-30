package com.javaCourse.classes;

public class PassByValue {
    public static void main(String[] args) {
        int x = 10;

        parameter(x);

        System.out.println(x);

        String name = new String("Alex");

        parameter(name);

        System.out.println(name);

        User user = new User("Alex", 23, "hello@email.com");
        user.setName("John2");

        parameter(user);

        System.out.println(user.getName());

        User userIRi = getUser();
    }

    private static void parameter(int x) {
        x = 120;
    }

    private static void parameter(String y) {
        y = "John";
    }

    private static void parameter(User x) {
        x.setName("John");
    }

    private static User getUser() {
        return new User("asdasbnd", 231, "emai...");
    }
}
