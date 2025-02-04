package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.xml.transform.Result;

@Aspect
@Component
public class EmployeeLoggingAspect {

    @Around("execution (* com.example.demo.controller.EmployeeController.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("Before Method AOP : " + jointPoint.getSignature().getName());
        long start = System.currentTimeMillis();

        Object result = jointPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("After Method AOP: " + jointPoint.getSignature().getName());
        System.out.println("Executed in : " + (start - end));
        return result;
    }
}
