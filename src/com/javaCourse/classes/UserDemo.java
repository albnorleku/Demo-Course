package com.javaCourse.classes;

public class UserDemo {
    public static void main(String [] args) {
        User user = new User("Albnor", 25, "albnorleku@email.com");
        User user1 = new User("Filan", 60, "filan@email.com");
        User user2 = new User("Filan", 21, "filan@email.com");

        System.out.println(user.getName());
        System.out.println(user1.getName());

        System.out.println(User.getNrOfUsers());

        if (user.equals(user1)) {
            System.out.println("Users are equal");
        }

        if (user1.equals(user2)) {
            System.out.println("User1 and User2 are equal");
        }

        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());

    }
}
