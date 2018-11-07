package com.sailing.bdip.metadata.common.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {

 private static final String DEFUALT_SUCCESS_MESSAGE = "SUCCESS";


    public static  Result getSuccessResult(){
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFUALT_SUCCESS_MESSAGE);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }

    public static <T> Result<T> getSuccessResult(T data){
         return new Result()
                 .setCode(ResultCode.SUCCESS)
                 .setMessage(DEFUALT_SUCCESS_MESSAGE)
                 .setData(data);
     }


}
