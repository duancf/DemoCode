package day01.demo01;

/*

    throws: 异常处理的第一种方式，交给别人处理。

    注意：
        1、throws 关键字必须卸载方法声明处
        2、后面声明的异常必须是Exception或是其子类。
        3、调用了一个声明抛出异常的方法，我们就必须处理声明的异常
            要么继续使用throws声明抛出，交给调用者处理，最终交给JVM
            要么try...catch自己处理异常。


    try...catch;异常处理的第二种方式，自己处理
    注意：
        1、可有多个catch处理多个异常
        2、如果try中产生了异常，会执行catch中异常处理逻辑，然后继续执行后续代码
           如果没产生异常，那么就不会执行catch中的逻辑，执行完try后继续执行后续代码。

 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01Throws {
    public static void main (String[] args) /*throws IOException*/ {
        //readFile("c:\\a.txt");
        try {
            readFile02("d:\\a.txt0");
        }catch (IOException e)
        {
            System.out.println("文件传递不是txt文件");
        }
        System.out.println("后续代码");
    }

    /*
    对传递的文件路径合法性判断   c:\a.txt
     */
    public static void readFile(String fileName) throws FileNotFoundException,IOException
    {
        if(fileName.equals("c:\\a.txt"))
        {
            throw new FileNotFoundException("路径不是：c:\\a.txt");
        }
        if(!fileName.endsWith(".txt"))
        {
            throw new IOException("文件传递不是txt文件");
        }
        System.out.println("路径正确！");
    }
    public static void readFile02(String fileName) throws IOException
    {
        if(!fileName.equals("c:\\a.txt"))
        {
            throw new FileNotFoundException("路径不是：c:\\a.txt");
        }
        System.out.println("路径正确！");
    }
}
