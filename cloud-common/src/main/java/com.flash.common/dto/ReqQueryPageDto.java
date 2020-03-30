package com.flash.common.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @Author: LiLiang
 * @Date: 2019/12/13 10:39
 */
@Data
public class ReqQueryPageDto {

    private long size = 10;

    private long current = 1;

    private boolean isAsc = false;

    private String order = "ctime";

    public Page getPage(){
        return new Page(current, size);
    }


}
