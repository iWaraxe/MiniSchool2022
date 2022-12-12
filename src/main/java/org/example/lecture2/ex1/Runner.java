package org.example.lecture2.ex1;

import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Faker
        Faker faker = new Faker();
        // primitive
        int i = 1;
        System.out.println(i);

        // reference type
        Item item1 = new Item();
        System.out.println(item1);
        // setters
        // field values
        item1.setId(faker.number().digits(8));

        item1.setName("First Item");
        System.out.println(item1);

        Item item2 = new Item(faker.number().digits(8),"Second Item");

        Item item3 = new Item("Third Item");

        Shop shop = new Shop("Amazon", List.of(item1,item2));


    }
}
