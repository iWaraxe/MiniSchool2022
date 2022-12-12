package org.example.lecture22.service;

import org.example.lecture22.domain.User;
import org.example.lecture22.domain.UserStatus;
import org.example.lecture22.persistence.UserStorage;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkState;

public class UserService {
    // UserBaseInfoStorage
    // UserDetailsStorage
    private final UserStorage userStorage;
    private final UserValidator userValidator;

    public UserService(UserStorage userStorage, UserValidator userValidator) {
        this.userStorage = userStorage;
        this.userValidator = userValidator;
    }

    public String createUser(User user) {
        //String id = userStorage.persist(user);

        boolean valid = userValidator.validateForCreation(user);
        if (!valid) {
            throw new IllegalArgumentException("user is not valid " + user);
        }
        // TODO(iwaraxe): go to storage and find users by name
        Optional<User> byUsername = userStorage.findByUsername(user.getUserName());
        checkState(byUsername.isEmpty(), "username is busy");

        user.setStatus(UserStatus.INITIAL);
        //presist user
        String id = userStorage.persist(user);
        user.setId(id);

        return id;
    }
}
