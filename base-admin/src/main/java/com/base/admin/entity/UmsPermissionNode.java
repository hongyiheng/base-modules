package com.base.admin.entity;


import com.base.mbg.model.UmsPermission;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台权限节点封装
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    @ApiModelProperty(value = "子级权限")
    private List<UmsPermissionNode> children;
}
