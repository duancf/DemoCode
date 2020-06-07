package day03.demo01;
/*
获取线程名称的方法：
        1、直接使用Thread类中的string getName()方法；
        2、使用static Thread currentThread()返回当前正在执行线程的引用，然后使用方法1.
 */
public class GetThreadName extends Thread {
    @Override
    public void run() {
        //1、直接使用Thread类中的string getName()方法；
        //System.out.println(getName());
        //2、使用static Thread currentThread()返回当前正在执行线程的引用，然后使用方法1.
        System.out.println(currentThread().getName());
    }
}
