package org.example.lecture5.user;

import java.util.UUID;

public class User {
    // state (fields)
    private UUID id;
    private String firstName;
    private String lastName;
    private Age age;

    private UserStatus status;

    // constructor(s)
    public User() {
    }

    public User(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // behavior (methods)
    public Age getAge() {
        return age;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    private static void someMethod(String arg, String arg2) {
        System.out.println("Hello from Private " + arg + arg2);
    }
}