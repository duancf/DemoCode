package day05.demo01;

public class SaleTicketDemo implements Runnable {
    private int Ticket = 100;
    @Override
    public void run() {
        while(true)
        {

            if(Ticket > 0)
            {
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "==>" + Ticket);
                Ticket--;
            }

        }
    }
}
