package com.taskmanager.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String id;
    private  String email;
    private String firstName;
    private String lastName;
}
