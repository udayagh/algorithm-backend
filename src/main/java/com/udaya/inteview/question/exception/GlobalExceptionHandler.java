package com.udaya.inteview.question.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.security.InvalidParameterException;


@ControllerAdvice
public class GlobalExceptionHandler {
    private static final String FAILURE_MESSSAGE = "An error has been occurred while processing the request: ";
    private static final String NO_RECORDS_FOUND_MESSSAGE = "No records found for the specified criteria";
    private static final String NULL_POINTER_MESSAGE = "Some mandatory fields are missing ";
    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = NoRecordsFoundException.class)
    public ResponseEntity handle(NoRecordsFoundException exception) {
        logError(exception);
        return new ResponseEntity<>(NO_RECORDS_FOUND_MESSSAGE, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    public ResponseEntity handle(HttpMediaTypeNotSupportedException exception) {
        logError(exception);
        return new ResponseEntity<>(FAILURE_MESSSAGE, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity handle(Exception exception) {
        logError(exception);
        return new ResponseEntity<>(exception.getCause().getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity handle(NullPointerException exception) {
        logError(exception);
        return new ResponseEntity<>(NULL_POINTER_MESSAGE, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = InvalidParameterException.class)
    public ResponseEntity handle(InvalidParameterException exception) {
        logError(exception);
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    private void logError(Exception exception) {
        log.error("GlobalExceptionHandler.handle(" + exception.getClass().getName() + "):" + exception.getMessage());
        exception.printStackTrace();
    }

}
