package study.ssm.springaop.proxy.service.impl;

import study.ssm.springaop.proxy.service.SomeService;
import study.ssm.springaop.proxy.util.ServiceTools;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/20  13:28
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}