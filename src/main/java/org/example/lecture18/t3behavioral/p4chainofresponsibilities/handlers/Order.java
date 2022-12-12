package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public class Order extends  BaseHandler {

    @Override
    public void handleRequest(String input) {
        if (input.equals("order")){
            System.out.println("'order' command was chosen");
        }
        else if(getNext() == null){
            System.out.println("Wrong command");
        }
    }
}
