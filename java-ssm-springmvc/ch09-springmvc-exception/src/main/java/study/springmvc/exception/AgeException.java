package study.springmvc.exception;

/**
 * 当年龄有问题时，抛出的异常
 * @author dhl
 * @datetime 2021/7/27  17:52
 */
public class AgeException extends MyUserException{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}