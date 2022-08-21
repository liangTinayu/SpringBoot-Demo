package com.lty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public  String doUserTest(){
        System.out.println("doUserTest~");
        return "this is /user/test";

    }

    @RequestMapping("/login")
    @ResponseBody
    public  String doUserLogin(){
        System.out.println("doUserLogin~");
        return "this is /user/login";

    }


}
