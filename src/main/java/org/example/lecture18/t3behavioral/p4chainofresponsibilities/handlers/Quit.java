package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public class Quit extends BaseHandler {

    @Override
    public void handleRequest(String input) {
        if (input.equals("quit")){
            System.out.println("'quit' command was chosen");
            System.exit(0);
        }
        else if(getNext() != null){
            getNext().handleRequest(input);
        }
    }
}
