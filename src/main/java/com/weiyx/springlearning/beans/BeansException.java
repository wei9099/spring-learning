package com.weiyx.springlearning.beans;

public class BeansException extends RuntimeException{

    public BeansException(String message, Exception e) {
        super(message,e);
    }

    public BeansException(String message) {
        super(message);
    }
}
