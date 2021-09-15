package study.dynamicProxy;

import study.dynamicProxy.factory.UsbKingFactory;
import study.dynamicProxy.handler.MySellHandler;
import study.dynamicProxy.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        // 创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);
        // 创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        // 通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法：" + price);
    }
}