package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/*
@Controller indicates that a particular class serves the role of a controller
Understands from the request which contains localhost:8080, localhost:8080/,
localhost:8080/home in the browser that it needs to redirect to home.html
*/
@Controller
public class HomeController {
    @RequestMapping(value={"","/","home"})
    public String displayHomePage() {
        return "home.html";
    }

    /*
    Model parameter is an interface inside Spring MVC framework that acts
    as a container between the UI and backend code
    */
    /*
    public String displayHomePage(Model model) {
        model.addAttribute("username", "John Doe");
        return "home.html";
    }
    */
}
