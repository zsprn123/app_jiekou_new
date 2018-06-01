package com.hlz.app.homePageData.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.homePageData.model.HomePageDataDto;
import com.hlz.app.homePageData.service.impl.HomePageDataServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/homePageData")
public class HomePageDataController {
    private Logger logger = LoggerFactory.getLogger(HomePageDataController.class);
    private String logtitle = "主页数据接口|#";

    @Autowired
    private HomePageDataServiceImpl homePageDataServiceImpl;
    @ResponseBody
    @GetMapping("/queryData")
    public TestReponseDto selectList(int pageNum,int pageSize){

        TestReponseDto dto =new TestReponseDto();
        try{
            List<HomePageDataDto> list = homePageDataServiceImpl.selectList(pageNum,pageSize);
            dto.setData(list);
            dto.setMessage("操作成功");
            dto.setSuccess("1");
            logger.info(logtitle+"查询成功");
        }catch (Exception e){
            e.printStackTrace();
            dto.setMessage("操作失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"查询失败,"+"异常："+e);
        }
        return dto;
    }
}