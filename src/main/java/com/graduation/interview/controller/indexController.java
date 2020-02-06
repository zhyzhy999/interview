package com.graduation.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class indexController {
    @GetMapping("/index")
    public String index(Model model){
        System.out.println("请求进入controller");
        return "index";
    }
}
