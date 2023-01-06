package com.example.permission.service;

import com.example.permission.dto.CreatePermissionDTO;
import com.example.permission.model.Permission;
import com.example.permission.model.PermissionStatus;
import com.example.permission.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePermissionService
{
    @Autowired
    private PermissionRepository permissionRepository;

    public void createPermission(CreatePermissionDTO createPermissionDTO)
    {
        Permission permission = new Permission();

        permission.setUserId(createPermissionDTO.getUserId());
        permission.setPermissionStartDate(createPermissionDTO.getPermissionStartDate());
        permission.setPermissionEndDate(createPermissionDTO.getPermissionEndDate());
        permission.setPermissionDayQuantity(createPermissionDTO.getPermissionDayQuantity());
        permission.setPermissionStatus(PermissionStatus.WAITING_APPROVAL);

        permissionRepository.save(permission);
    }
}
