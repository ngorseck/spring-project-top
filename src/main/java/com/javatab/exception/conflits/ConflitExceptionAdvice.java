package com.javatab.exception.conflits;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ConflitExceptionAdvice {
    @ExceptionHandler(value = {ConflitException.class})
    public ResponseEntity<APIException> handleRequestException(ConflitException e) {
        APIException exception = APIException.builder()
                .message(e.getMessage())
                .status(HttpStatus.CONFLICT)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(exception, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = {ConflitExceptions.class})
    public ResponseEntity<APIException> handleRequestException(ConflitExceptions e) {
        APIException exception = new APIException(e.getMessage(), e.getStatus(), LocalDateTime.now());
        return new ResponseEntity<>(exception, e.getStatus());
    }
}
