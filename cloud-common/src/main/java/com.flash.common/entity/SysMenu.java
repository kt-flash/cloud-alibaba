package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色对象 sys_menu
 *
 * @author liliang
 */
@Data
public class SysMenu extends BaseEntity {
    /**
     * 菜单ID
     */
    @TableId(type = IdType.AUTO)
    private Long menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 父菜单名称
     */
    @TableField(exist = false)
    private String parentName;
    /**
     * 父菜单ID
     */
    private Long parentId;
    /**
     * 显示顺序
     */
    private String orderNum;
    /**
     * 菜单URL
     */
    private String url;
    /**
     * 类型:0目录,1菜单,2按钮
     */
    private String menuType;
    /**
     * 菜单状态:0显示,1隐藏
     */
    private int visible;
    /**
     * 权限字符串
     */
    private String perms;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 子菜单
     */
    @TableField(exist = false)
    private List<SysMenu> children = new ArrayList<>();


    @Override
    public String toString() {
        return "SysMenu [menuId=" + menuId + ", menuName=" + menuName + ", parentName=" + parentName + ", parentId="
                + parentId + ", orderNum=" + orderNum + ", url=" + url + ", menuType=" + menuType + ", visible="
                + visible + ", perms=" + perms + ", icon=" + icon + ", children=" + children + "]";
    }

}
