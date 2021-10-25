package com.example.sbnwpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/")
    public String getHomePage() {
        System.out.println("This is home page");
        return "homepage";
    }

    @RequestMapping("/contact")
    public String getContactPage() {
        System.out.println("This is contact page");
        return "contactpage";
    }
    @RequestMapping("/greet")
    public ModelAndView greetUser(@RequestParam("uname") String uname) {
        ModelAndView mv = new ModelAndView("greetUser");
        mv.addObject("username", uname);
        return mv;
    }
}
