package study.ssm.springaop.before.service.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import study.ssm.springaop.before.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/20  16:14
 */
@Service("someServiceImpl")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // 需求，我们要在当前方法运行之前增加时间的输出
        System.out.println("======SomeServiceImpl中的doSome方法执行了======");
    }
}