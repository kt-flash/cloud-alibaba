package com.flash.common.entity;

import lombok.Data;

/**
 * 角色和菜单关联 sys_role_menu
 *
 * @author liliang
 */
@Data
public class SysRoleMenu {
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 菜单ID
     */
    private Long menuId;


    @Override
    public String toString() {
        return "SysRoleMenu [roleId=" + roleId + ", menuId=" + menuId + "]";
    }

}
