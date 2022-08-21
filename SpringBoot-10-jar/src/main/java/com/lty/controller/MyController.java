package com.lty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

@RequestMapping("/main")
    public String doSome(Model mv){

        mv.addAttribute("data","SpringBoot中jar中数据");

        return  "index";

    }
}
