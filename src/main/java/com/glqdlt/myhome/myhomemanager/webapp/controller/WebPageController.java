package com.glqdlt.myhome.myhomemanager.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class WebPageController {

    @GetMapping("/dashboard")
    public String root() {
        return "index";
    }

    @GetMapping("/dashboard/book")
    public String bookDashboard(){
        return "book-dashboard";
    }


    @GetMapping("/dashboard/book/editor")
    public String bookEditor(){
        return "book-editor";
    }

}
