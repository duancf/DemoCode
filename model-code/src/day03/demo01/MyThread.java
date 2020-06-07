package day03.demo01;

public class MyThread  {
    public static void main(String[] args) {
        GetThreadName getThreadName = new GetThreadName();
        getThreadName.start();  //Thread-0
        //主线程不能直接使用getName()方法，其没有继承Thread;
        System.out.println(Thread.currentThread().getName());   //main
    }
}
