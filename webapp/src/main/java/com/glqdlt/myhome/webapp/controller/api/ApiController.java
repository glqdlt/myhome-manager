package com.glqdlt.myhome.webapp.controller.api;

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
