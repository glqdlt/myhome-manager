package com.glqdlt.myhome.myhomemanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class WebController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/book-list")
    public String boolList(){
        return "book-list";
    }
}
