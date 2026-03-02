package com.taskmanager.api.service;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.entity.UserEntity;
import com.taskmanager.api.exception.custom.DuplicateEmailException;
import com.taskmanager.api.mapper.UserMapper;
import com.taskmanager.api.model.User;
import com.taskmanager.api.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository,
                           UserMapper userMapper,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;

    }

    @Override
    public UserDTO createUser(User user) {
        String email = user.getEmail();
        if(email != null && userRepository.existsByEmail(email)) {
            throw new DuplicateEmailException("Email already exists");
        }

        UserEntity userEntity = userMapper.toEntity(user);

        userEntity.setPassword(passwordEncoder.encode(user.getPassword()));
        UserEntity savedUserEntity = userRepository.save(userEntity);

        return userMapper.toUserDTO(savedUserEntity);
    }

    @Override
    public boolean verifyCredentials(String email, String password) {


        return false;
    }
}
