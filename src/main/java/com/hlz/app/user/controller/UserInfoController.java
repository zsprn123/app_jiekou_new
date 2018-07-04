package com.hlz.app.user.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.user.model.UserInfoDto;
import com.hlz.app.user.service.impl.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
            logger.info(logtitle+"查询成功");
        }catch (Exception e){
            dto.setMessage("操作失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"查询失败,"+"异常："+e);
            e.printStackTrace();
        }
        return dto;
    }
}