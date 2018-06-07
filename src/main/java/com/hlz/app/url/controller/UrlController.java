package com.hlz.app.url.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.url.model.UrlInfo;
import com.hlz.app.url.service.UrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/url")
public class UrlController {
    private Logger logger = LoggerFactory.getLogger(UrlController.class);
    private String logtitle = "主页图片URL接口|#";

    @Autowired
    private UrlService urlService;
    @ResponseBody
    @GetMapping("/all")
    public TestReponseDto findUrl(){

        TestReponseDto dto =new TestReponseDto();
        try{
            List<UrlInfo> list = urlService.findUrl();
            dto.setData(list);
            dto.setTitle2(list);
            dto.setMessage("操作成功");
            dto.setSuccess("1");
            logger.info(logtitle+"查询成功");
        }catch (Exception e){
            dto.setMessage("操作失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"查询失败,"+"异常："+e);
        }
        return dto;
    }
}