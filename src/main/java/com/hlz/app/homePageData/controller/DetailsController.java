package com.hlz.app.homePageData.controller;
import com.hlz.app.common.TestReponseDto;
import com.hlz.app.homePageData.model.DetailsDto;
import com.hlz.app.homePageData.service.impl.DetailsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Details")
public class DetailsController {
    private Logger logger = LoggerFactory.getLogger(DetailsController.class);
    private String logtitle = "招聘信息详细数据接口|#";

    @Autowired
    private DetailsServiceImpl detailsServiceImpl;
    @ResponseBody
    @GetMapping("/DetailsData")
    public TestReponseDto FindDetails(String merchant_id){
    System.out.println(merchant_id);
        TestReponseDto dto =new TestReponseDto();
        try{
            List<DetailsDto> list = detailsServiceImpl.FindDetails(merchant_id);
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