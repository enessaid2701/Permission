package com.example.permission.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User extends BaseEntity
{
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String role;
}
