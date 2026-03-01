package com.taskmanager.api.exception;

import com.taskmanager.api.exception.custom.DuplicateEmailException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(DuplicateEmailException.class)
    public ResponseEntity<ErrorDetail> handleDatabaseException(DuplicateEmailException ex) {

        ErrorDetail errorDetail = ErrorDetail.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorDetail);
    }

}
