package com.sastra.authentication.exceptions;

import com.sastra.authentication.model.FailedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.AuthenticationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public FailedResponse authenticationException(AuthenticationException ex) {
        FailedResponse resMsg = new FailedResponse();
        resMsg.setReason(ex.getMessage());
        return resMsg;
    }
}
