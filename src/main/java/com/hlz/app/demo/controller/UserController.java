package com.hlz.app.demo.controller;

import com.hlz.app.demo.model.UserInfo;
import com.hlz.app.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserInfo userInfo){
        return userService.addUser(userInfo);
    }

    @ResponseBody
    @GetMapping("/all")
    public List<?> findAllUser(){
        List<UserInfo> list = userService.findAllUser();
        return list;
    }
}
