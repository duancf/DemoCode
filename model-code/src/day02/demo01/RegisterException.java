package day02.demo01;


/*
    自定义异常类：
        Exception: 编译期异常, 若方法内部抛出了编译期异常，就必须处理，要么try...catch, 要么throws

        RuntimeException:运行期异常，无需处理，交给虚拟机处理（中断处理）
 */
public class RegisterException extends RuntimeException/*Exception*/ {

    public RegisterException()
    {
        super();
    }

    public RegisterException(String username)
    {
        super(username);
    }
}
