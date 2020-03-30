package com.flash.common.dto;

import com.flash.common.model.CodeEnum;
import lombok.Data;

import java.io.Serializable;


@Data
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final BaseResult<Boolean> SUCCESS;
    private static final BaseResult<Boolean> ERROR;

    static {
        new BaseResult();
        SUCCESS = buildSuccessResult(Boolean.valueOf(true));
        new BaseResult();
        ERROR = buildErrorResult(CodeEnum.code8999.getCode(), "系统错误");
    }

    private boolean success = true;
    private String message;
    private int code;
    private T content;

    public BaseResult() {
    }

    public static BaseResult<Boolean> buildSuccessResult() {
        return SUCCESS;
    }

    public static BaseResult<Boolean> buildErrorResult() {
        return ERROR;
    }

    public static <T> BaseResult<T> buildSuccessResult(T result) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(CodeEnum.code8200.getCode());
        baseResult.setContent(result);
        return baseResult;
    }

    public static <T> BaseResult<T> buildErrorResult(int errorCode, String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(errorCode);
        baseResult.setMessage(msg);
        baseResult.setSuccess(false);
        return baseResult;
    }

    public static <T> BaseResult<T> buildTipErrorResult(String msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(CodeEnum.code8996.getCode());
        baseResult.setMessage(msg);
        baseResult.setSuccess(false);
        return baseResult;
    }

    public boolean isSuccess() {
        return this.success && CodeEnum.code8200.getCode() == code;
    }
}
