package com.glqdlt.myhome.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/datatable/**").addResourceLocations("/webjars/my-datatable/1.0.1/");
        registry.addResourceHandler("/assets/bootstrap/**").addResourceLocations("/webjars/bootstrap/4.1.0/");
        registry.addResourceHandler("/assets/momentjs/**").addResourceLocations("/webjars/momentjs/2.15.1/");
        registry.addResourceHandler("/assets/sbadmin/**").addResourceLocations("classpath:/static/sb-admin/");
        registry.addResourceHandler("/assets/tagit/**").addResourceLocations("classpath:/static/tag-it/");
    }
}
