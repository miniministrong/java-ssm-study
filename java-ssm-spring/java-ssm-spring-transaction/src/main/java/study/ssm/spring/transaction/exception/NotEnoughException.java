package study.ssm.spring.transaction.exception;

/**
 * 自定义的运行时异常
 *
 * @author 汶泽
 * @date 2021/7/25-13:59
 */
public class NotEnoughException extends RuntimeException{
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
