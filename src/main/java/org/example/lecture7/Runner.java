package org.example.lecture7;

public class Runner {
    public static void main(String[] args) {
        int i = A.I;
        System.out.println(i);

    }
}

interface A {
    int I = 0;

    int m1();
}