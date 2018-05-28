package com.hlz.app.demo.controller.url;

import com.hlz.app.demo.model.base.TestReponseDto;
import com.hlz.app.demo.model.url.UrlInfo;
import com.hlz.app.demo.service.url.UrlService;
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
    public TestReponseDto findUrl(){
        TestReponseDto dto =new TestReponseDto();
        try{
            List<UrlInfo> list = urlService.findUrl();
            dto.setTitle(list);
            dto.setTitle2(list);
            dto.setMessage("操作成功");
            dto.setSuccess("1");
        }catch (Exception e){
            dto.setMessage("操作失败");
            dto.setSuccess("-1");
        }
        return dto;
    }
}
