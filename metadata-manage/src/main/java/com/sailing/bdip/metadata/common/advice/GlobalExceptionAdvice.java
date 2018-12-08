package com.sailing.bdip.metadata.common.advice;


import com.sailing.bdip.metadata.common.core.Result;
import com.sailing.bdip.metadata.common.core.ResultGenerator;
import com.sailing.bdip.metadata.common.tool.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.binding.BindingException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@Slf4j
//@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(HttpServletRequest request, Exception e) {
        log.error(ExceptionUtil.exeptionToString(e,ExceptionUtil.EXCEPTION_DEFAULT_LENGTH));
        String message = null;
        if(e instanceof TypeMismatchException){// 参数类型不匹配异常
            TypeMismatchException ex = (TypeMismatchException) e;
            message = String.format("参数类型不匹配，类型应该为: %s", ex.getRequiredType());
        }else if(e instanceof MissingServletRequestParameterException){// 缺少参数异常
            MissingServletRequestParameterException ex = (MissingServletRequestParameterException) e;
            message = String.format("缺少参数: %s", ex.getParameterName());
        }else if(e instanceof HttpRequestMethodNotSupportedException){// 请求类型异常
            HttpRequestMethodNotSupportedException ex = (HttpRequestMethodNotSupportedException) e;
            message = String.format("接口请求类型应该为: %s", ex.getSupportedHttpMethods());
        }else if(e != null && e instanceof DataIntegrityViolationException){
            DataIntegrityViolationException ex = (DataIntegrityViolationException) e;
            message = String.format("数据库操作异常: [%s]", ex.getCause().getMessage());
        }else if(e != null && e instanceof MyBatisSystemException){
            MyBatisSystemException ex = (MyBatisSystemException) e;
            message = String.format("数据库操作异常: [%s]", ex.getCause().getMessage());
        }else if(e != null && e instanceof BadSqlGrammarException){
            BadSqlGrammarException ex = (BadSqlGrammarException) e;
            message = String.format("数据库操作异常: [%s]", ex.getCause().getMessage());
        }else if(e != null && e instanceof BindingException){
            BindingException ex = (BindingException) e;
            message = String.format("数据库操作异常: [%s]", ex.getMessage());
        }else {
            message = String.format("未知异常，请联系管理员 %s",e.getMessage());
        }

//        log.error("接口："+request.getRequestURI()+" 错误信息："+ExceptionUtil.exeptionToString(e,ExceptionUtil.EXCEPTION_DEFAULT_LENGTH));
        return ResultGenerator.getFailResult(message);
    }
}
