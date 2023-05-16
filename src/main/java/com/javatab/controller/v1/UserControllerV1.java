package com.javatab.controller.v1;

import com.javatab.controller.BaseController;
import com.javatab.controller.IUserController;
import com.javatab.domain.entity.User;
import com.javatab.dto.request.UpdateUserRequest;
import com.javatab.exception.notfound.NoUserFoundException;
import com.javatab.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerV1 extends BaseController implements IUserController {

    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @RequestMapping(value = "/get_user_by_username/{username}",name = "get_user_by_username", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByName(@PathVariable("username") String username) {
        User aUser = userService.getUserByUsername(username).orElseThrow(() -> new NoUserFoundException(username));
        return ResponseEntity.ok(aUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id, UpdateUserRequest updateUserRequest ) {
        User aUser = userService.updateUser(updateUserRequest);
        return ResponseEntity.ok(aUser);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, name = "get_by_user_id")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User aUser = userService.getUserById(id).orElseThrow(() -> new NoUserFoundException(id.toString()));
        return ResponseEntity.ok(aUser);
    }


}
