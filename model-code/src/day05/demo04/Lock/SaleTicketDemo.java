package day05.demo04.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo implements Runnable {
    private int Ticket = 100;
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while(true)
        {
            l.lock();
            if(Ticket > 0)
            {
                try
                {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "==>" + Ticket);
                    Ticket--;
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    l.unlock();
                }

            }

        }
    }
}
