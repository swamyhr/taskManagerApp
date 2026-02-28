package com.taskmanager.api.controller;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserController {

     ResponseEntity<UserDTO> createUser(User user);

     ResponseEntity<List<UserDTO>> getUsers();

     ResponseEntity<String> updateUser(User user);

     ResponseEntity<String> deleteUser(Integer userId);
}
