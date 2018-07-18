package com.hlz.app.user.controller;

import com.hlz.app.common.ReponseDto;
import com.hlz.app.common.TestReponseDto;
import com.hlz.app.user.model.UserInfo;
import com.hlz.app.user.model.UserInfoDto;
import com.hlz.app.user.service.impl.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {
    private Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    private String logtitle = "用户信息接口|#";

    @Autowired
    private UserInfoServiceImpl userInfoService;
    @ResponseBody
    @GetMapping("/userInfoData")
    public TestReponseDto FindUserInfo(String user_uuid){
        TestReponseDto dto =new TestReponseDto();
        try{
            List<UserInfoDto> list = userInfoService.FindUserInfo(user_uuid);
            dto.setData(list);
            dto.setMessage("操作成功");
            dto.setSuccess("1");
            logger.info(logtitle + "查询成功");
        }catch (Exception e){
            dto.setMessage("操作失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"查询失败,"+"异常："+e);
            e.printStackTrace();
        }
        return dto;
    }

    @ResponseBody
    @GetMapping("/add")
    public ReponseDto addUser( UserInfoDto userInfo){
        ReponseDto dto = new ReponseDto();
        try{
            int result =  userInfoService.addUserInfo(userInfo);
            if(result>0){
                dto.setMessage("用户信息插入成功");
                dto.setSuccess("1");
                logger.info(logtitle+"用户信息插入成功");
            }else{
                dto.setMessage("用户信息插入失败");
                dto.setSuccess("-1");
            }
        }catch (Exception e){
            e.printStackTrace();
            dto.setMessage("用户信息插入失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"用户信息插入失败,"+"异常："+e);
        }
        return dto;
    }
    }