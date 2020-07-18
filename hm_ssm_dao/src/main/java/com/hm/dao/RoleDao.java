package com.hm.dao;

import com.hm.domain.Permission;
import com.hm.domain.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RoleDao {

    //根据用户id查询出所有对应的角色
    @Select("select * from role where id in(select roleId from users_role where userId = #{userId})")
    @Results({
            @Result(id = true , property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.hm.dao.PermissionDao.findPermissionByRoleId"))

    })
    public List<Role> findByUserId(String userId);

    @Select("select * from role")
    public List<Role> findAll();

    @Insert("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    public void save(Role role);

    @Select("select * from role where id = #{roleId}")
    Role findById(String roleId);

    @Select("select * from permission where id not in (select permissionId from role_permission where roleId =#{roleId})")
    List<Permission> findOthersPermission(String roleId);

    @Insert("insert into role_permission(permissionId,roleId)values(#{permissionId},#{roleId})")
    void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);
}
