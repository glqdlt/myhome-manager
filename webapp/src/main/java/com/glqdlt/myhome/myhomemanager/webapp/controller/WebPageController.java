package com.glqdlt.myhome.myhomemanager.webapp.controller;

import com.glqdlt.myhome.persistence.myhomepersistence.book.entity.Book;
import com.glqdlt.myhome.myhomemanager.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class WebPageController {

    @Autowired
    BookService bookService;

    @GetMapping("/dashboard")
    public String root() {
        return "index";
    }

    @GetMapping("/dashboard/book")
    public String bookDashboard(){
        return "/book/book-dashboard";
    }

    @GetMapping("/dashboard/book/{id}")
    public String bookDetail(Model model,@PathVariable("id") Integer id){

        Book book = bookService.findById(id);
        model.addAttribute("book",book);
        return "/book/book-detail";
    }

    @GetMapping("/dashboard/book/editor")
    public String bookEditor(){
        return "/book/book-editor";
    }



    @GetMapping("/regist")
    public String regist(){
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

}
