package org.example;
import org.aspectj.lang.ProceedingJoinPoint;

class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature()
                + " executed in " + (end - start) + " ms");
        return result;

    }
}
