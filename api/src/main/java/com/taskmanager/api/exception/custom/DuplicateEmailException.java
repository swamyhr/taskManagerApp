package com.taskmanager.api.exception.custom;

import lombok.*;

@Getter
@Setter
@Builder
public class DuplicateEmailException extends RuntimeException {
    private final String message;

    public DuplicateEmailException(String message) {
       super(message);
       this.message = message;
    }
}

