package be.intecbrussel.apps;

public class App {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(3);
        Ticket ticket2 = new Ticket(5);
        Ticket ticket3 = new Ticket(10);

        Register register = new Register();

        register.addTicket(ticket1);
        register.addTicket(ticket2);
        register.addTicket(ticket3);

        System.out.println(register.getProfit());

    }
}
