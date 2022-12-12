package org.example.lecture10.quantumeffects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        populateList(list);
        final Integer integer = list.get(3);
        System.out.println(integer);
    }

    public static void populateList(List rawlist) {
        rawlist.add(3);
        rawlist.add("a");
    }
}
