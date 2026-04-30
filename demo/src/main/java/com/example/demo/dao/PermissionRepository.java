package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.*;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    boolean existsByName(String name);
}