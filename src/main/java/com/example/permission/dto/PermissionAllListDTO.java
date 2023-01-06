package com.example.permission.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionAllListDTO
{
    private long userId;
    private String fullName;
    private List<PermissionListDTO> permissionListDTO;
}
