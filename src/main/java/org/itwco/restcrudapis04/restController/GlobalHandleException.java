package org.itwco.restcrudapis04.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(NotFoundException e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse>handleException(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }
}

