package org.example.lecture22;

import org.example.lecture22.persistence.UserStorage;
import org.example.lecture22.service.UserService;
import org.example.lecture22.service.UserValidator;

public class Runner {
    public static void main(String[] args) {

        UserService userService = new UserService(
                new UserStorage(),
                new UserValidator());
    }
}
