package com.flash.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述 : 分页查询返回结果包装类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultDto<T extends Serializable> extends BaseDto {

    public static final PageResultDto EMPTY_RESULT =
            new PageResultDto(0L, 0L, 0L, Collections.EMPTY_LIST);
    private static final long serialVersionUID = 5316026762442064982L;
    /** 总数. */
    private long count;
    /** 当前页码. */
    private long currentPage;
    /** 每页记录数. */
    private long pageSize;
    /** The data. */
    private List<T> data;

    public PageResultDto() {
    }

    public PageResultDto(Long count, Long currentPage, Long pageSize, List<T> data) {
        this.count = (count == null ? 0 : count);
        this.currentPage = (currentPage == null ? 1 : currentPage);
        this.pageSize = (pageSize == null ? Integer.MAX_VALUE : pageSize);
        this.data = data;
    }
}
