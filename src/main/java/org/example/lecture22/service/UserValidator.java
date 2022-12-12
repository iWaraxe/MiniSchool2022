package org.example.lecture22.service;

import org.example.lecture22.domain.User;

public class UserValidator {

    public boolean validateForCreation(User user) {

        if (user.getUserName() == null) {
            return false;
        }

        if (user.getFirstName() == null) {
            return false;
        }

        if (user.getLastName() == null) {
            return false;
        }

        return true;
    }
}
