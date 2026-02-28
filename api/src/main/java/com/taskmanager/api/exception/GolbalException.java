package com.taskmanager.api.exception;

import org.springframework.boot.web.error.Error;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbalException {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity handleDatabaseException(DataIntegrityViolationException exx) {

        ErrorDetail errorDetail = ErrorDetail.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message(exx.getMessage())
                .build();
        return new ResponseEntity(errorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
