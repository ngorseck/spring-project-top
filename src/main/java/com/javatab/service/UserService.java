package com.javatab.service;

import com.javatab.domain.entity.User;
import com.javatab.dto.request.UpdateUserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    User updateUser(UpdateUserRequest updateUserRequest);

    Optional<User> getUserByUsername(String username);

    Optional<User> getUserById(Long id);

}
