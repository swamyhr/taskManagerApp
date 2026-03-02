package com.taskmanager.api.controller;

import com.taskmanager.api.dto.LoginUserDTO;
import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.model.User;
import com.taskmanager.api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @Override
    public ResponseEntity<List<UserDTO>> getUsers() {
        return null;
    }

    @Override
    public ResponseEntity<String> updateUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteUser(Integer userId) {
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginUserDTO userDetails) {

        boolean isAuthenticated = userService.verifyCredentials(userDetails.getEmail(), userDetails.getPassword());

        if(isAuthenticated) {
            System.out.println("Login success");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email or Password is Incorrect");
        }
    }
}
