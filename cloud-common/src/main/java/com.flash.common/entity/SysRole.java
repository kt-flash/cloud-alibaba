package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Arrays;

/**
 * 角色对象 sys_role
 *
 * @author liliang
 */
@Data
public class SysRole extends BaseEntity {

    /**
     * 角色ID
     */
    @TableId(type = IdType.AUTO)
    private Long roleId;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色权限
     */
    private String roleKey;
    /**
     * 角色排序
     */
    private String roleSort;
    /**
     * 角色状态:0正常,1禁用
     */
    private Integer status;
    /**
     * 用户是否存在此角色标识 默认不存在
     */
    @TableField(exist = false)
    private boolean flag = false;
    /**
     * 菜单组
     */
    @TableField(exist = false)
    private Long[] menuIds;


    @Override
    public String toString() {
        return "SysRole [roleId=" + roleId + ", roleName=" + roleName + ", roleKey=" + roleKey + ", roleSort=" + roleSort
                + ", status=" + status + ", flag=" + flag + ", menuIds=" + Arrays.toString(menuIds) + "]";
    }

}
