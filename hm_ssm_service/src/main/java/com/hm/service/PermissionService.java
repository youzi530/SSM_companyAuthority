package com.hm.service;

import com.hm.domain.Permission;

import java.util.List;

public interface PermissionService {

    public List<Permission> findAll();

    public void save(Permission permission);
}
