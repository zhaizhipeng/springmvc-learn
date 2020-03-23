package com.ysdrzp.exception;

import java.beans.ExceptionListener;

/**
 * 自定义异常
 */
public class CustomException extends Exception {

    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
