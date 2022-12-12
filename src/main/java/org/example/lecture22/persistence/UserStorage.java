package org.example.lecture22.persistence;

import org.example.lecture22.domain.User;

import java.util.Optional;

public class UserStorage {

    public Optional<User> findByUsername(String userName) {
        return Optional.empty();
    }

    public String persist(User user) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public User load(String id) {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
