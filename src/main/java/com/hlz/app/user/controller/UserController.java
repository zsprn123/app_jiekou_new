package com.hlz.app.user.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hlz.app.user.model.UserInfo;
import com.hlz.app.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private String logtitle = "用户信息接口|#";

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(@RequestBody UserInfo userInfo){

        return userService.addUser(userInfo);
    }

    @ResponseBody
    @GetMapping("/all")
    public  JSONObject findAllUser(){
        JSONObject json = new JSONObject();
        try {
            List<UserInfo> list = userService.findAllUser();
            json.put("parameter", list);
            logger.info(logtitle+"查询成功");
        }catch (Exception e){
            logger.info(logtitle+"查询失败,"+"异常："+e);
        }
        return json;
    }

    public static void main(String[] args){
        UserInfo user =new UserInfo();
        user.setUserId(123);
        user.setPassword("4444");
        user.setUserName("zhangsan");
        user.setPhone("13511112222");
        System.out.println(JSON.toJSONString(user));
    }
}
