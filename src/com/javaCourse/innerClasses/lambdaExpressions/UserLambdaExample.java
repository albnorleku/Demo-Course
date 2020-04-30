package com.javaCourse.innerClasses.lambdaExpressions;

import com.javaCourse.classes.User;

public class UserLambdaExample {
    public static void main(String [] args) {

        User user = new User("Filan", 30, "filan@gmail.com");

        GetNamePerson getNamePerson = new GetNamePerson() { //anonymous class
            @Override
            public String getName(User person) {
                return person.getName();
            }
        };
        System.out.println(getNamePerson.getName(user));

        GetNamePerson getNamePerson1 = (person) -> {
            return person.getName() + " !"; //lambda expression
        };

        System.out.println(getNamePerson1.getName(user));

        GetNamePerson getNamePerson2 = User::getName; //Method reference example

        System.out.println(getNamePerson2.getName(user));
    }
}
