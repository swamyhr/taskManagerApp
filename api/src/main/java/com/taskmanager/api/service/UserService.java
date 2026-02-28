package com.taskmanager.api.service;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.entity.UserEntity;

public interface UserService {

    UserDTO createUser(UserEntity user);
}
