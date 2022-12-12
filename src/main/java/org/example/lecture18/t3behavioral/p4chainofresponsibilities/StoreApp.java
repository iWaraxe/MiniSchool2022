package org.example.lecture18.t3behavioral.p4chainofresponsibilities;

import org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreApp {
    public static void main(String[] args) {

        Handler top5 = new Top5();
        Handler listOfProducts = new ListOfProducts();
        Handler sortedListOfProducts = new SortedListOfProducts();
        Handler order = new Order();
        Handler quit = new Quit();

        top5.setNext(listOfProducts);
        listOfProducts.setNext(sortedListOfProducts);
        sortedListOfProducts.setNext(quit);
        quit.setNext(order);

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter the command: top5/sort/print/quit/order");
                String input = bufferedReader.readLine();
                top5.handleRequest(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
