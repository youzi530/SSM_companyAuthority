package com.hm.service;

import com.hm.domain.Permission;
import com.hm.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll();

    public void save(Role role);

    Role findById(String roleId);

    List<Permission> findOthersPermission(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);
}
