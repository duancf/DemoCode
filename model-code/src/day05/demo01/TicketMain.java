package day05.demo01;

public class TicketMain {
    public static void main(String[] args) {
        SaleTicketDemo ticket = new SaleTicketDemo();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.start();
        t2.start();
        t3.start();
    }
}
