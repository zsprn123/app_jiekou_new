package com.hlz.app.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.hlz.app.demo.model.UrlInfo;
import com.hlz.app.demo.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/url")
public class UrlController {

    @Autowired
    private UrlService urlService;
    @ResponseBody
    @GetMapping("/all")
    public JSONObject findUrl(){
        List<UrlInfo> list = urlService.findUrl();
        JSONObject json= new JSONObject();
        json.putIfAbsent("title", list);
        //json.put("title", list);
        return json;
    }
}
