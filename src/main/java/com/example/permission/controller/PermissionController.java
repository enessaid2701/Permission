package com.example.permission.controller;

import com.example.permission.dto.CreateOrderResponse;
import com.example.permission.dto.CreatePermissionDTO;
import com.example.permission.dto.CreateUserDTO;
import com.example.permission.service.CreatePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@Controller("/permission")
public class PermissionController
{
    @Autowired
    private CreatePermissionService createPermissionService;

    @PostMapping("/create-permission")
    @ResponseBody
    public CreateOrderResponse createOrder(@RequestBody CreatePermissionDTO permissionDTO) {
        createPermissionService.createPermission(permissionDTO);
        CreateOrderResponse res = new CreateOrderResponse(true);
        return res;
    }

    @GetMapping
    @ResponseBody
    public
}
