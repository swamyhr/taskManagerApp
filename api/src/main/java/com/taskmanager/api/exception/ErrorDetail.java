package com.taskmanager.api.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetail {

    private String status;
    private String message;
}
