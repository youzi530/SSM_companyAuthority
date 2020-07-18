package com.hm.dao;

import com.hm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId =#{id})")
    public List<Permission> findPermissionByRoleId(String id);

    @Select("select * from permission")
    public List<Permission> findAll();

    @Insert("insert into permission(permissionName,url)values(#{permissionName},#{url})")
    public void save(Permission permission);
}
