package com.heima.demo1exception;

/**
 * ClassName: ItAgellegaException
 * Package: com.heima.demo1exception
 */
public class ItAgellegaException extends Exception {
    public ItAgellegaException() {

    }

    public ItAgellegaException(String message) {
        super(message);// 调用父类的带参构造
    }
}
