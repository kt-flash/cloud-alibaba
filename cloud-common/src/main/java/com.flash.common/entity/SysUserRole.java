package com.flash.common.entity;

import lombok.Data;

/**
 * 用户和角色关联 sys_user_role
 * 
 * @author liliang
 */
@Data
public class SysUserRole
{
    /** 用户ID */
    private Long userId;
    /** 角色ID */
    private Long roleId;

    @Override
    public String toString()
    {
        return "SysUserRole [userId=" + userId + ", roleId=" + roleId + "]";
    }

}
