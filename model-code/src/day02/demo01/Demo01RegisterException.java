package day02.demo01;

import java.util.Scanner;

/*
自定义异常类联系
    模拟注册操作；

 */
public class Demo01RegisterException {
    static  String[] usernames = {"张三", "李四"};
    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        checkUserName(username);
    }

    public static void checkUserName(String username) throws RegisterException {
        for(String user : usernames)
        {
            if(user.equals(username))
            {
                throw new RegisterException("该用户已被注册！");
            }
        }
        System.out.println("注册成功");
    }
}
