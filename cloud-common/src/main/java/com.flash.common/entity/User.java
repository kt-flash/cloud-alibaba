package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:39
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    @TableId(type = IdType.AUTO) //id自动递增
    private Long id;

    //@TableField(condition = SqlCondition.LIKE) //作为条件时使用like
    private String name;


    private Integer age;

    private String telephone;

    private String fax;

    private String email;

    @TableField(fill = FieldFill.INSERT) //insert操作时填充该字段
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ctime;

    @TableField(fill = FieldFill.UPDATE) //update操作时填充该字段
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gtime;

    private Long managerId;

    private String dbSource;

    @Version //实现乐观锁，更新时验证version
    private Integer version;

    @TableLogic //逻辑删除标识
    @TableField(select = false) //不查询该列
    @JsonIgnore //该字段不转json
    private Integer invalid;
}
