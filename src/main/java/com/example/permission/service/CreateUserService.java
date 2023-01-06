package com.example.permission.service;

import com.example.permission.dto.CreateUserDTO;
import com.example.permission.model.User;
import com.example.permission.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService
{
    @Autowired
    private UserRepository userRepository;

    public void createUser(CreateUserDTO createUserDTO)
    {
        User user = new User();

        user.setFullName(createUserDTO.getFullName());
        user.setEmail(createUserDTO.getEmail());
        user.setPassword(createUserDTO.getPassword());
        user.setPhone(createUserDTO.getPhone());
        user.setRole(createUserDTO.getRole());

         userRepository.save(user);
    }
}
