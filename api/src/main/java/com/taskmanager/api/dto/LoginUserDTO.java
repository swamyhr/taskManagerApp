package com.taskmanager.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginUserDTO {

    @NotBlank(message="Email should not be blank")
    @Email(message ="Email pattern is not correct")
    private String email;

    @NotBlank(message="Password must not be blank")
    private String password;
}
