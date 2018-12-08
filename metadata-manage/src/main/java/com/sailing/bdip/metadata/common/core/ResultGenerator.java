package com.sailing.bdip.metadata.common.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {

 private static final String DEFUALT_SUCCESS_MESSAGE = "SUCCESS";


    public static  Result getSuccessResult(){
        return new Result()
                .setCode(ResultCode.SUCCESS.getCode())
                .setMessage(ResultCode.SUCCESS.getMessage());
    }

    public static Result getFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL.getCode())
                .setMessage(message);
    }

    public static <T> Result<T> getSuccessResult(T data){
         return new Result()
                 .setCode(ResultCode.SUCCESS.getCode())
                 .setMessage(ResultCode.SUCCESS.getMessage())
                 .setData(data);
     }

    public static <T> Result<T> getFailResult(T data,int code,String msg){
        return new Result()
                .setCode(code)
                .setMessage(msg)
                .setData(data);
    }

    public static <T> Result<T> getFailResult(T data,ResultCode resultCode){
        return new Result()
                .setCode(resultCode.getCode())
                .setMessage(resultCode.getMessage())
                .setData(data);
    }

    public static <T> Result<T> getSuccessResult(T data,int code,String msg){
        return new Result()
                .setCode(code)
                .setMessage(msg)
                .setData(data);
    }

    public static <T> Result<T> getSuccessResult(T data,ResultCode resultCode){
        return new Result()
                .setCode(resultCode.getCode())
                .setMessage(resultCode.getMessage())
                .setData(data);
    }



}
