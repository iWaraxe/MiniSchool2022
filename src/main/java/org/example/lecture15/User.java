package org.example.lecture15;

public class User {
    final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User:" + getUsername();
    }
}
