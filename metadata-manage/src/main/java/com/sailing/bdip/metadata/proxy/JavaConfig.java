package com.sailing.bdip.metadata.proxy;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
//开启AspectJ 自动代理模式,如果不填proxyTargetClass=true，默认为false，
//即使用jdk默认代理模式，AspectJ代理模式是CGLIB代理模式
//如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
//如果目标对象实现了接口，可以强制使用CGLIB实现AOP (此例子我们就是强制使用cglib实现aop)
//如果目标对象没有实现了接口，必须采用CGLIB库，spring会自动在JDK动态代理和CGLIB之间转换
/**
 * proxyTargetClass: true 基于类的代理将起作用（这时需要cglib库） false:那么标准的JDK 基于接口的代理
 *
 */
@EnableAspectJAutoProxy(proxyTargetClass=false)
@ComponentScan
public class JavaConfig {

}
