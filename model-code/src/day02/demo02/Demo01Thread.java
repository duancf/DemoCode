package day02.demo02;


/*

    并发：交替执行
    并行：同时执行

    进程：指一个内存中运行的应用程序，每个进程都有独立的内存空间，一个应用程序可以同时运行多个进程。系统运行程序的基本单位。
    线程：是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个进程。
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        p1.run();

        Person p2 = new Person("李四");
        p2.run();
    }
}
