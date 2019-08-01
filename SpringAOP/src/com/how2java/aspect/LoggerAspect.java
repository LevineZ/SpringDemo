package com.how2java.aspect;
import org.aspectj.lang.ProceedingJoinPoint;

package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("loggerAspect")
public class LoggerAspect {
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("start log:" + joinPoint.getSignature().getName());
//        Object object = joinPoint.proceed();
//        System.out.println("end log:" + joinPoint.getSignature().getName());
//        return object;
//    }


    public void timing(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature().getName()+"耗时："+(end-start)+"mm");
    }
}
