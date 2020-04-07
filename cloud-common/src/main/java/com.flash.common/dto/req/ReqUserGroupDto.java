package com.flash.common.dto.req;

import com.flash.common.validator.annotation.Fax;
import com.flash.common.validator.annotation.Telephone;
import com.flash.common.validator.group.AddGroup;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * User保存修改Dto
 * @author: liliang.<br>
 */
@Data
public class ReqUserGroupDto {

    @NotNull(message="id不能为空")
    private Long id;

    @NotBlank(message="名称能为空", groups = {AddGroup.class})
    private String name;

    @Range(min = 1,max = 150,message = "age不合法",groups = {AddGroup.class})
    private Integer age;

    //自定义注解
    @Telephone(message = "电话格式不正确", nullable = true, groups = {AddGroup.class})
    private String telephone;

    //自定义注解
    @Fax(message="传真格式不正确", nullable = true, groups = {AddGroup.class})
    private String fax;

    @Email(message="邮箱格式不正确", groups = {AddGroup.class})
    private String email;


    @NotNull(message="managerId不能为空", groups = {AddGroup.class})
    private Long managerId;

}
