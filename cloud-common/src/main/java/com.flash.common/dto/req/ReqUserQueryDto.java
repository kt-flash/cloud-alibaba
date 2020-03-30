package com.flash.common.dto.req;

import com.flash.common.dto.ReqQueryPageDto;
import lombok.Data;

/**
 * User查询Dto
 * @author: liliang.<br>
 */
@Data
public class ReqUserQueryDto extends ReqQueryPageDto {

    private String id;

    private String name;

    private Integer age;

    private String telephone;

    //自定义注解
    private String fax;

    private String email;

    private String managerId;

}
