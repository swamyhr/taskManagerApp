package com.taskmanager.api.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class User {

    @NotBlank(message = "First name should not be empty")
    private String firstName;
    private String lastName;

    @NotBlank(message = "Email should not be empty")
    @Email(message = "email should not be empty")
    @Column(unique=true, nullable = false)
    private String email;

    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "password is not matching the pattern")
    private String password;
}
