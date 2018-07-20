package com.glqdlt.myhome.myhomemanager.webapp.controller.api;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@RequestMapping("/api")
@Deprecated
public @interface ApiController {
}
