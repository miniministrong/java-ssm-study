package study.ssm.springaop.afterreturning.service;

import study.ssm.springaop.afterreturning.model.User;

/**
 * @author dhl
 * @datetime 2021/7/20  16:14
 */
public interface SomeService {
    void doSome(String name, Integer age);

    String doOther(String name, Integer age);

    User doUser(String name, Integer age);
}
