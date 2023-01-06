package com.example.permission.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePermissionDTO
{
    private long userId;
    private String permissionStartDate;
    private String permissionEndDate;
    private int permissionDayQuantity;
}
