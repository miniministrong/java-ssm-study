package study.ssm.springaop.around.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.afterreturning.model.User;
import study.ssm.springaop.around.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/20  16:14
 */
@Service("someServiceImpl")
public class SomeServiceImpl implements SomeService {

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("=====SomeServiceImpl中的doFirst()执行=====");
        return "doFirst";
    }
}