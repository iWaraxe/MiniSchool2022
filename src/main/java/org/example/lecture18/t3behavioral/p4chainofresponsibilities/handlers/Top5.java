package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public class Top5 extends BaseHandler {

    @Override
    public void handleRequest(String input) {
        if (input.equals("top5")) {
            //Store.getInstance().getTop5();
            System.out.println("'top5' command was chosen");
        }
        else if (getNext() != null) {
            getNext().handleRequest(input);
        }

    }
}
