package be.intecbrussel.apps;

public class Ticket {
    //private String id;
    //private static int ticketNo;
    private final double price;


    public Ticket(double price) {

        this.price = price;
    }

    //public String getId() {
        //return id;
    //}

    //public void setId(String id) {
        //this.id = id;
    //}

    //public static int getTicketNo() {
        //return ticketNo;
    //}

    //public static void setTicketNo(int ticketNo) {
        //Ticket.ticketNo = ticketNo;
    //}

    public double getPrice() {
        return price;
    }

    //public void setPrice(double price) {
        //this.price = price;
    //}
}
