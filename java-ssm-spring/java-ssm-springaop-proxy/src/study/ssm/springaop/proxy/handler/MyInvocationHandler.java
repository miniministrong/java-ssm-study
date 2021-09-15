package study.ssm.springaop.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/20  13:35
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object o;

    public MyInvocationHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        String methodName = method.getName();
        if ("doSome".equals(methodName)) {
            System.out.println("方法执行时间：" + new Date());
            obj = method.invoke(o, args);
            System.out.println("方法结束，提交事务");
        } else {
            obj = method.invoke(o, args);
        }
        return obj;
    }
}