package study.springmvc.exception;

/**
 * 当姓名有问题时，抛出的异常
 * @author dhl
 * @datetime 2021/7/27  17:52
 */
public class NameException extends MyUserException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}