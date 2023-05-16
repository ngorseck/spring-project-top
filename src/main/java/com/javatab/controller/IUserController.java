package com.javatab.controller;

import com.javatab.domain.entity.User;
import com.javatab.dto.request.UpdateUserRequest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RequestMapping("/users")
public interface IUserController {

    @GetMapping()
    ResponseEntity<List<User>> getAllUsers();

//    @GetMapping("/{username}")
//    ResponseEntity<User> getUserByName(@PathVariable("username") String username);

    @GetMapping("/{id}")
    ResponseEntity<User> getUserById(@PathVariable("id") Long username);

    @PutMapping("/{id}")
    ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody @Valid UpdateUserRequest updateUserRequest);
}
