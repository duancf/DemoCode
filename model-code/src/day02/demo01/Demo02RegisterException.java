package day02.demo01;

import java.util.Scanner;

public class Demo02RegisterException {
    static  String[] usernames = {"张三", "李四"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        checkUserName(username);
    }

    public static void checkUserName(String username) {
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