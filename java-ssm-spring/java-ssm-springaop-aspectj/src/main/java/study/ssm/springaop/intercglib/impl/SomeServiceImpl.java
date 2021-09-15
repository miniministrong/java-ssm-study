package study.ssm.springaop.intercglib.impl;

import org.springframework.stereotype.Service;
import study.ssm.springaop.intercglib.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  11:53
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl 's doSome execute");
    }
}