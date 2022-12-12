package org.example.lecture4;

import java.util.List;
import java.util.UUID;

public class User {
    public static final int STATUS_INITIAL = 1;
    public static final int STATUS_ACTIVE = 2;
    public static final int STATUS_DELETED = 3;
    public static final List<Integer> STATUS_VALUES = List.of(STATUS_INITIAL, STATUS_ACTIVE, STATUS_DELETED);

    // state (fields)
    public static int COUNTER = 0;
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private Age age;
    private UserStatusLegacy status;

    // constructor(s)

    public User(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        COUNTER++;
    }


    // behavior (methods)
    public UserStatusLegacy getStatus() {
        return status;
    }

    public void setStatus(UserStatusLegacy status) {
        this.status = status;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void m1(int i, User user) {
        i++;
        System.out.println("Parameter from m1(): " + i);
        user.setAge(Age.of(10));
        //
    }
}
