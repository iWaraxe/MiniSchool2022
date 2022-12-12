package org.example.lecture6.domain;

public class User {

    String firstName;

    private void someMethod(String arg) {
        System.out.println("Hello from Private " + arg);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

