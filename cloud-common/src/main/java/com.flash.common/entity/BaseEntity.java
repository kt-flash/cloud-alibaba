package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.flash.common.utils.DateUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity基类
 *
 * @author liliang
 */
@Data
public class BaseEntity implements Serializable {
    /**
     * 搜索值
     */
    @TableField(exist = false)
    private String searchValue;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    /**
     * 备注
     */
    private String remark;


    public String getCreateTimeStr() {
        return createTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, createTime) : "";
    }

    public String getCreateDateTimeStr() {
        return createTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, createTime) : "";
    }

    public String getUpdateTimeStr() {
        return updateTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, updateTime) : "";
    }

    public String getUpdateDateTimeStr() {
        return updateTime != null ? DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, updateTime) : "";
    }


}
