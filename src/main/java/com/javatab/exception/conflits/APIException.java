package com.javatab.exception.conflits;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class APIException {
    String message;
    HttpStatus status;
    LocalDateTime timestamp;
}
