package com.alumni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("Home page handler");
        return null;
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("About page handler");
        return null;
    }
    
}
