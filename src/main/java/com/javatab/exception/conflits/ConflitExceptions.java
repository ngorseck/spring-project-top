package com.javatab.exception.conflits;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConflitExceptions extends RuntimeException {
    String message;
    HttpStatus status;
}
