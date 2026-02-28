package com.taskmanager.api.mapper;

import com.taskmanager.api.dto.UserDTO;
import com.taskmanager.api.entity.UserEntity;
import com.taskmanager.api.model.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface UserMapper {

    @Mapping(target="password", ignore=true)
    UserEntity toEntity(Users user);

    UserDTO toUserDTO(UserEntity userEntity);
}
