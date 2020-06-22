package day05.demo03.Synchronized.Method;
/*
    demo01出现线程同步问题，
    2、使用synchronized同步方法；

    注意：同步方法也是把代码锁住，其锁对象也就是是实现方法new SaleTicketDemo()
 */
public class SaleTicketDemo implements Runnable {
    private static int Ticket = 100;

    //声明一个锁对象,三个线程共用一个锁；
    Object obj = new Object();
    @Override
    public void run() {
        while(true)
        {
            SynMethod();
        }
    }
    public synchronized void SynMethod()
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
    /*
    静态同步方法也可实现线程安全；
    但是：其锁对象不是实现类，静态方法存在于类对象创建前；
    静态方法锁对象：本类的class属性-->class文件对象(反射)
     */
    public static synchronized void SynMethodStatic()
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
