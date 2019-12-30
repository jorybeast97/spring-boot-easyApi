package com.magnolia.springbooteasyapi.result;

/**
 * @author 范昊
 * 请求结果生成器
 */
public class ResultGenerator {

    /**
     * 默认成功返回结果
     */
    public static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";


    /**
     * 成功返回结果
     * @return
     */
    public static CommonResult getSuccessResult() {
        return new CommonResult()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     *带参结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> getSuccessResult(T data) {
        return new CommonResult<>()
                .setCode(ResultCode.SUCCESS)
                .setData(data)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 失败返回结果
     * @param data
     * @param errorMessage
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> getFailResult(T data , String errorMessage) {
        return new CommonResult<>()
                .setCode(ResultCode.FAIL)
                .setData(data)
                .setMessage(errorMessage);
    }

    /**
     * 资源不存在结果
     * @param notFoundMessage
     * @return
     */
    public static CommonResult getNotFoundResult(String notFoundMessage) {
        return new CommonResult()
                .setCode(ResultCode.NOT_FOUND)
                .setMessage(notFoundMessage);
    }

    /**
     * 签名校验失败结果
     * @param unauthorizedMessage
     * @return
     */
    public static CommonResult getUnauthorizedResult(String unauthorizedMessage) {
        return new CommonResult()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMessage(unauthorizedMessage);
    }
    
    public static CommonResult getServerErrorResult(String errorMessage) {
        return new CommonResult()
                .setCode(ResultCode.INTERNAL_SERVER_ERROR)
                .setMessage(errorMessage);
    }


}
