package org.example.lecture22.domain;

public class User {
    public static final UserStatus DEFAULT_STATUS = UserStatus.ACTIVE;
    private String id;
    private final String userName;
    private String firstName;
    private String lastName;
    private Age age;
    private UserStatus status;

    //constructors
    public User(String username) {
        this.userName = username;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Age getAge() {
        return age;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }
}
