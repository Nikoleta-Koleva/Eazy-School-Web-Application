package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@Controller indicates that a particular class serves the role of a controller
Understands from the request made in the browser that it needs to redirect to home.html
*/
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String displayHomePage() {
        return "home.html";
    }
}
