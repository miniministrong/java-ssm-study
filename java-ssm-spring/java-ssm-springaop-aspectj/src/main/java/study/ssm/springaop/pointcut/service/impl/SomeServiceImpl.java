package study.ssm.springaop.pointcut.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.pointcut.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  11:37
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("=====SomeServiceImpl中的doSome方法执行了=====");
    }
}