package com.udaya.inteview.question.exception;

public class NoRecordsFoundException extends RuntimeException{
    public NoRecordsFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public NoRecordsFoundException(String msg) {
        super(msg);
    }
}
