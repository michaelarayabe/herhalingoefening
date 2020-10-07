package be.intecbrussel.apps;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private double profit = 0;
    private final List<Ticket> tickets = new ArrayList<>();


    public Register(){

    }



    public void addTicket(Ticket ticketIn){
        tickets.add(ticketIn);
    }



    public double getProfit() {
        for(Ticket t : tickets){
            profit += t.getPrice();
        }
        return profit;
    }
}
