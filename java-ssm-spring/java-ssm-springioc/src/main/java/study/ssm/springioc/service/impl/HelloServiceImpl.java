package study.ssm.springioc.service.impl;

import study.ssm.springioc.service.HelloService;

/**
 * @author dhl
 * @datetime 2021/7/19  13:55
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void hello() {
        System.out.println("Hello World!");
    }
}