package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public class SortedListOfProducts extends BaseHandler {

    @Override
    public void handleRequest(String input) {
        if (input.equals("sort")) {
            System.out.println("'sort' command was chosen");
        }
        else if (getNext() != null) {
            getNext().handleRequest(input);
        }
    }
}
