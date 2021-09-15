package study.ssm.springaop.after.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.after.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  11:21
 */
@Service("someServiceImpl")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("---SomeServiceImpl中的doSome方法执行---");
    }
}