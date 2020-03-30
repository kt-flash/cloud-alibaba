package com.flash.cloud.controller;

import com.flash.common.dto.BaseResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * @Author: LiLiang
 * @Date: 2020/3/17 11:07
 */
public class BaseController {

    public BaseResult handleValidateError(BindingResult result){
        if(result != null && result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                return BaseResult.buildTipErrorResult(error.getDefaultMessage());
            }
        }
        return null;
    }
}
