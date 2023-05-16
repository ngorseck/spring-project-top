package com.javatab.service.impl;

import com.javatab.domain.entity.User;
import com.javatab.dto.request.UpdateUserRequest;
import com.javatab.exception.notfound.NoUserFoundException;
import com.javatab.repository.UserRepository;
import com.javatab.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(UpdateUserRequest updateUserRequest) {
        User aUser = userRepository.findById(updateUserRequest.getId())
                .orElseThrow(() -> new NoUserFoundException(updateUserRequest.getId().toString()));
        User updatedUser = User.builder()
                .email(aUser.getEmail())
                .username(aUser.getUsername())
                .password(aUser.getPassword())
                .firstName(aUser.getFirstName())
                .lastName(aUser.getLastName())
                .authorities(aUser.getAuthorities())
                .lastPasswordReset(aUser.getLastPasswordReset())
                .levelStudy(updateUserRequest.getLevelStudy())
                .age(updateUserRequest.getAge())
                .address(updateUserRequest.getAddress())
                .speciality(updateUserRequest.getSpeciality())
                .tel(updateUserRequest.getTel())
                .professionalExperience(updateUserRequest.getProfessionalExperience())
                .build();

        return userRepository.save(updatedUser);
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
