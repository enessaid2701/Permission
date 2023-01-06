package com.example.permission.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionListDTO
{
    private String permissionStartDate;
    private String permissionEndDate;
    private int permissionDayQuantity;
}
