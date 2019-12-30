package com.magnolia.springbooteasyapi.result;

/**
 * @author
 *
 * 请求结果状态码
 */
public enum ResultCode {

    //请求成功
    SUCCESS(200),
    //请求失败
    FAIL(400),
    //未认证(签名无效)
    UNAUTHORIZED(401),
    //资源不存在(接口不存在)
    NOT_FOUND(404),
    //服务器内部错误
    INTERNAL_SERVER_ERROR(500)
    ;


    private final Integer code;

    ResultCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
