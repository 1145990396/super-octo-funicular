/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.grabber.common.service.integrate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author wuxianxin
 * @version RdsCheckAspect.java, v 0.1 2023年08月08日 Administrator Exp $
 */
@Aspect
@Component
public class RdsCheckAspect {

    @Around("annotation(com.grabber.common.service.integrate.aspect.RdsCaptcha)")
    public Object pre(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("111");

        return joinPoint.proceed();
    }
}