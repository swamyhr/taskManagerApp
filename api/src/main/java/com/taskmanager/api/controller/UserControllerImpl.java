package com.taskmanager.api.controller;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserControllerImpl implements UserController {
    @Override
    public ResponseEntity<UserDTO> createUser(User user) {
        return null;
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
}
