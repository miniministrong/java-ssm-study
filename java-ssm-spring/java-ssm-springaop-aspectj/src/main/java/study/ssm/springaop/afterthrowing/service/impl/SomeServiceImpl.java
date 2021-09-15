package study.ssm.springaop.afterthrowing.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.afterthrowing.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  11:07
 */
@Service("someServiceImpl")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl的doSome()方法执行了" + 10 / 0);
    }
}