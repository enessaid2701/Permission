package com.example.permission.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO
{
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String role;
}
