package com.example.permission.repository;

import com.example.permission.model.Permission;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PermissionRepository extends CrudRepository<Permission, Long>
{
    Optional<Permission> findAllByUserId(Long id);
}
