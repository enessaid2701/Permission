package com.example.permission.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Permission extends BaseEntity
{
    private long userId;
    private String permissionStartDate;
    private String permissionEndDate;
    private int permissionDayQuantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "permission_status")
    private PermissionStatus permissionStatus;

}
