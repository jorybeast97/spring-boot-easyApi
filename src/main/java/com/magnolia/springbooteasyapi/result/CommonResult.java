package com.magnolia.springbooteasyapi.result;

import com.alibaba.fastjson.JSON;

/**
 * @author fanhao
 *
 * 作为RESTful统一返回格式
 */
public class CommonResult<T> {

    /**
     * 请求响应状态码
     */
    private Integer code;
    /**
     * 请求响应提示信息
     */
    private String message;
    /**
     * 请求返回实体
     */
    private T data;

    public CommonResult setCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        return this;
    }

    public CommonResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public CommonResult setData(T data) {
        this.data = data;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
