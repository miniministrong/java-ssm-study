package study.springmvc.exception;

/**
 * @author dhl
 * @datetime 2021/7/27  17:51
 */
public class MyUserException extends Exception{
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}