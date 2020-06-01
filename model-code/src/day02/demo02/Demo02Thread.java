package day02.demo02;

/*
     创建多线程第一种方法：创建Thread类的子类

     start()
          使该线程开始执行；Java 虚拟机调用该线程的 run 方法。

     java程序属于抢占式调度，哪个线程优先级高，那个先执行。同一优先级，随即执行一个。
 */
public class Demo02Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
