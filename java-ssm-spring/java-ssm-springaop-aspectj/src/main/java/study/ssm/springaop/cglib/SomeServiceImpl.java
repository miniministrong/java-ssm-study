package study.ssm.springaop.cglib;

import org.springframework.stereotype.Service;

/**
 * @author dhl
 * @datetime 2021/7/21  11:49
 */
@Service
public class SomeServiceImpl {
    public void doSome(){
        System.out.println("SomeServiceImpl中的doSome方法执行");
    }
}