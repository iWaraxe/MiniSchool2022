package org.example.lecture9;

import java.util.List;

public class User implements Comparable<User> {
    private Integer id;

    private Age age;
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void populate(List<Integer> list) {
        list.add(2);
    }

    @Override
    public int compareTo(User o) {
        return this.getUserName().compareTo(o.getUserName());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
