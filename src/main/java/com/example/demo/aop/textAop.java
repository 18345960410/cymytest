package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect

public class textAop {



    @Pointcut("execution(* com.example.demo.controller.Myfirst.getFirst(..))")
    public void aopTest() {
        System.out.println("=============++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


    @AfterReturning(returning = "result", pointcut = "aopTest()")
    public void afterMethodSendToken(JoinPoint jp, Object result) {
        System.out.println("返回"+result.toString());
    }

    @Before("aopTest()")
    public void beforMethodSendToken(JoinPoint jp) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        // 打印请求内容
//        log.info("===============请求内容===============");
//        log.info("请求地址:" + request.getRequestURL().toString());
//        log.info("请求方式:" + request.getMethod());
//        log.info("请求类方法:" + jp.getSignature());
//        log.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));

//        Object[] args = jp.getArgs();
//        String classType = jp.getTarget().getClass().getName();
//        Class<?> clazz = Class.forName(classType);
//
//        String clazzName = clazz.getName();
//        String methodName = jp.getSignature().getName(); // 获取方法名称
//        // 获取参数名称和值
//
//        StringBuffer sb = RequedtParameter.getNameAndArgs(this.getClass(), clazzName, methodName, args);
//        log.info("请求类方法参数名称和值：" + sb);
//        log.info("===============请求内容===============");



    }

}
