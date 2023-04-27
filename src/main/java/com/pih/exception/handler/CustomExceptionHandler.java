package com.pih.exception.handler;

import com.pih.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomExceptionHandler {


    @ExceptionHandler
    public ResponseEntity handleException(MethodArgumentNotValidException ex){
    String message = ex.getMessage();
    String cause = ex.getLocalizedMessage();
    String status= ex.getStatusCode().toString();
        List list = ex.getBindingResult().getAllErrors().stream()
                .map(fieldError -> fieldError.getDefaultMessage())
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(Error.builder().message(message)
                .cause(cause).status(status).errorList(list).build());

    }
}
