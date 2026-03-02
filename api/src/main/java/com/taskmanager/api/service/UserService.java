package com.taskmanager.api.service;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.model.User;

public interface UserService {

    UserDTO createUser(User user);

    boolean verifyCredentials(String email, String password);
}
