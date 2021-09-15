package study.ssm.springaop.afterreturning.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.afterreturning.model.User;
import study.ssm.springaop.afterreturning.service.SomeService;

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

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("=====SomeServiceImpl中的doOther方法执行了=====");
        return "end";
    }

    @Override
    public User doUser(String name, Integer age) {
        User user = new User(name, age);
        System.out.println("=====SomeServiceImpl中的doUser方法执行了=====");
        return user;
    }
}