package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public class ListOfProducts extends BaseHandler {

    @Override
    public void handleRequest(String input) {
        if (input.equals("print")){
            System.out.println("'print' command was chosen");
        }
        else if(getNext() != null){
            getNext().handleRequest(input);
        }
    }
}
