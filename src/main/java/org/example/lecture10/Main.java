package org.example.lecture10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Homework Ch: 8
        List integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        //integerList.add("str");
        Integer integer = (Integer) integerList.get(1);
    }
}

class Node<E> {
    E value;
    Node<E> next;

    public Node(E value) {
        value.getClass();
        this.value = value;
    }
}