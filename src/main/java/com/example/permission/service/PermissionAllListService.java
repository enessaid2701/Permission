package com.example.permission.service;

import com.example.permission.model.Permission;
import com.example.permission.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PermissionAllListService
{
    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private DateService dateService;

    private List<Permission> getPermissionListDTOS(Iterator<Permission> per)
    {
        List<Permission> permissionAllListDTOS = new ArrayList<>();
        while (per.hasNext()){
            Permission permission = per.next();
            Iterable<Permission> permission1 = permissionRepository.findAll();
            permissionAllListDTOS.add((Permission) permission1);
        }
        return permissionAllListDTOS;
    }

    
}
