package com.base.admin.dao;


import com.base.mbg.model.UmsPermission;
import com.base.mbg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义角色权限关系管理Dao

 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
