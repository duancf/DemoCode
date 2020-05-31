package day01.demo01;

public class Exceptin {
    public static void main(String[] args) {
        method(null     );
    }
    public static void method(Object obj)
    {
        if(obj == null)
        {
            throw new NullPointerException("对象为空");
        }
    }
}
