package com.baidu.springsecurity.controller;

import com.baidu.springsecurity.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping("/login")
    public void login(){
        usersService.findUser();
    }
}
