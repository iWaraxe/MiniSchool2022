package org.example.lecture3;

public class User {
    // state (fields)
    private final String id;
    private final String firstName;
    private final String lastName;
    private Age age;

    // constructor(s)

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // behavior (methods)

    public String getId() {
        return id;
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

    public void setAge(Age age) {
        this.age = age;
    }

    public void m1(int i, String s) {
        String firstName1 = getFirstName();
        //
    }

    public static void m2(int i, String s) {
        //
    }


}
