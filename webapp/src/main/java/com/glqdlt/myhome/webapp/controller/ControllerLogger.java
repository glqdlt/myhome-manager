package com.glqdlt.myhome.webapp.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class ControllerLogger {

    @Before("execution(* com.glqdlt.myhome.webapp.controller..*Controller.*(..))")
    public void pre() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        LoggingHelper.loggingRequestDetail(request, "start");
    }

    @After("execution(* com.glqdlt.myhome.webapp.controller..*Controller.*(..))")
    public void post(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        LoggingHelper.loggingRequestDetail(request, "end");
    }

}
