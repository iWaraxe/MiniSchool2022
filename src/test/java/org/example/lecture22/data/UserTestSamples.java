package org.example.lecture22.data;

import org.example.lecture22.domain.Age;
import org.example.lecture22.domain.User;

public class UserTestSamples {

    public static User anyValidUser() {
        return validUser("jlannister");
    }

    public static User validUser(String userName) {
        User user = new User(userName);
        user.setAge(Age.of(30));
        user.setFirstName("Jaime");
        user.setLastName("Lannister");

        return user;
    }

    public static User anyUser() {
        return anyValidUser();
    }

}
