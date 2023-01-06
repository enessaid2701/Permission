package com.example.permission.controller;

import com.example.permission.dto.CreateOrderResponse;
import com.example.permission.dto.CreateUserDTO;
import com.example.permission.service.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private CreateUserService createUserService;

    @PostMapping("/create-user")
    @ResponseBody
    public CreateOrderResponse createOrder(@RequestBody CreateUserDTO userDTO) {
        createUserService.createUser(userDTO);
        CreateOrderResponse res = new CreateOrderResponse(true);
        return res;
    }
}
