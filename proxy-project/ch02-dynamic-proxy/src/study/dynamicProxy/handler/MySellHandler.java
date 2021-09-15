package study.dynamicProxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
// 必须实现InvocationHandler接口，来完成代理类中要完成的功能
public class MySellHandler implements InvocationHandler {
    private Object target;

    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(target, args);
        if (res != null) {
            Float price = (Float)res;
            price += 25;
            res = price;
        }
        return res;
    }
}