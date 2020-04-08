package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 部门对象 sys_dept
 *
 * @author liliang
 */
@Data
public class SysDept extends BaseEntity {
    /**
     * 部门ID
     */
    @TableId(type = IdType.AUTO)
    private Long deptId;
    /**
     * 父部门ID
     */
    private Long parentId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 显示顺序
     */
    private String orderNum;
    /**
     * 负责人
     */
    private String leader;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 部门状态:0正常,1停用
     */
    private int status;
    /**
     * 父部门名称
     */
    private String parentName;


    @Override
    public String toString() {
        return "SysDept [deptId=" + deptId + ", parentId=" + parentId + ", deptName=" + deptName + ", orderNum=" + orderNum
                + ", leader=" + leader + ", phone=" + phone + ", email=" + email + ", status=" + status
                + ", parentName=" + parentName + "]";
    }

}
