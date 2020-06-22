package day05.demo02;
/*
    demo01出现线程同步问题，
    1、使用synchronized同步代码块；

    注意：代码块中会一支重复判断锁、释放锁，效率降低，但线程安全。
 */
public class SaleTicketDemo implements Runnable {
    private int Ticket = 100;

    //声明一个锁对象,三个线程共用一个锁；
    Object obj = new Object();
    @Override
    public void run() {
        while(true)
        {

            synchronized(obj)
            {
                if(Ticket > 0)
                {
                    try
                    {
                        Thread.sleep(100);
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
}
