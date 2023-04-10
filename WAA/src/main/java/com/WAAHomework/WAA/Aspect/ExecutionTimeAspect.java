package com.WAAHomework.WAA.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Aspect
@Component
public class ExecutionTimeAspect implements ExecutionTime {

    @Around("@annotation(com.example.annotations.ExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String logMessage = className + "." + methodName + " took " + timeTaken + " ms.";
        System.out.println(logMessage);
        return proceed;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
