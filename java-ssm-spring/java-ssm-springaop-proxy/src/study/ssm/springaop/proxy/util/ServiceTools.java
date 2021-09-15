package study.ssm.springaop.proxy.util;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/20  13:31
 */
public class ServiceTools {
    public static void doLog(){
        System.out.println("方法的执行时间：" + new Date());
    }

    public static void doTrans(){
        System.out.println("方法结束，提交事务");
    }
}