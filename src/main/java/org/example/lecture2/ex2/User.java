package org.example.lecture2.ex2;

public class User {
    // STATE (field)
    private final int id;
    private final String firstName;
    private final String lastName;
    private int age;

    // CONSTRUCTOR(S)
    public User(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    // BEHAVIOR (methods)

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
