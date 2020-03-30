package com.flash.cloud.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flash.common.dto.BaseResult;
import com.flash.common.dto.PageResultDto;
import com.flash.common.dto.req.ReqUserGroupDto;
import com.flash.common.dto.req.ReqUserQueryDto;
import com.flash.common.entity.User;
import com.flash.common.service.UserClientService;
import com.flash.common.validator.group.ValidationGroup1;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LiLiang
 * @Date: 2020/1/2 16:23
 */
@RestController
@RequestMapping(value = "/user")
public class UserConsumerController extends BaseController{


    @Autowired
    private UserClientService userClientService;

    /**
     * 添加用户-服务消费者
     * @param reqUserDto
     * @param result
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public BaseResult add(@RequestBody @Validated(value = {ValidationGroup1.class}) ReqUserGroupDto reqUserDto,
                           BindingResult result) {
        BaseResult baseResult = handleValidateError(result);
        if(baseResult != null){
            return baseResult;
        }
        User user = new User();
        BeanUtils.copyProperties(reqUserDto, user);

        User user2 = userClientService.add(user);
        return BaseResult.buildSuccessResult(user2);
    }

    /**
     * 更新用户-服务消费者
     * @param reqUserDto
     * @param result
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public BaseResult update(@RequestBody @Validated ReqUserGroupDto reqUserDto,
                          BindingResult result) {
        BaseResult baseResult = handleValidateError(result);
        if(baseResult != null){
            return baseResult;
        }
        User user = new User();
        BeanUtils.copyProperties(reqUserDto, user);

        User user2 = userClientService.update(user);
        return BaseResult.buildSuccessResult(user2);
    }

    /**
     * 分页查询User
     * @param reqUserDto
     * @param result
     * @return
     */
    @RequestMapping(value = "pageList", method = RequestMethod.POST)
    public BaseResult pageList(@RequestBody @Validated ReqUserQueryDto reqUserDto,
                               BindingResult result) {
        BaseResult baseResult = handleValidateError(result);
        if(baseResult != null){
            return baseResult;
        }
        Page page = userClientService.pageList(reqUserDto);

        return BaseResult.buildSuccessResult(new PageResultDto(page.getTotal(),
                page.getPages(), page.getSize(), page.getRecords()));
    }

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public BaseResult get(@PathVariable String id) {
        User user = userClientService.get(id);
        return BaseResult.buildSuccessResult(user);
    }

    /**
     * 逻辑删除User
     * @param id
     * @return
     */
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public BaseResult delete(@PathVariable String id) {
        boolean isDeleted = userClientService.delete(id);
        return BaseResult.buildSuccessResult(isDeleted);
    }

}
