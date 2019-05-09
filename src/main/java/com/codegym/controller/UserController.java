package com.codegym.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {
    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    @GetMapping("/user")
    public String user(Principal principal){

        System.out.println(principal.getName());
        return "index";
    }
    @GetMapping("/admin")
    public String admin(){
        SecurityContext context = SecurityContextHolder.getContext();
        return "index";
    }
}
