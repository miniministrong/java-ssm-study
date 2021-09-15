package study.ssm.springaop.proxy;

import study.ssm.springaop.proxy.handler.MyInvocationHandler;
import study.ssm.springaop.proxy.service.SomeService;
import study.ssm.springaop.proxy.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dhl
 * @datetime 2021/7/20  13:29
 */
public class MyApp {
    public static void main(String[] args) throws Throwable {
        SomeService someService = new SomeServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(someService);
        SomeService service = (SomeService) Proxy.newProxyInstance(someService.getClass().getClassLoader(), someService.getClass().getInterfaces(), handler);
        service.doSome();
        System.out.println("===========================");
        service.doOther();
    }
}