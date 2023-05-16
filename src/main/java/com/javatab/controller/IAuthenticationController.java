package com.javatab.controller;

import com.javatab.dto.request.AuthenticationRequest;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javatab.dto.request.RegistrationRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RequestMapping("/auth")
public interface IAuthenticationController {

    @SecurityRequirements
    @PostMapping()
    ResponseEntity<?> login(@RequestBody @Valid AuthenticationRequest authenticationRequest);
    @GetMapping("/refresh")
    ResponseEntity<?> refreshToken(HttpServletRequest request);
    @SecurityRequirements
    @PostMapping("/register")
    ResponseEntity<?> registerUser(@RequestBody @Valid RegistrationRequest registrationRequest);
}
