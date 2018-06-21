package com.hlz.app.user.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.homePageData.model.DetailsDto;
import com.hlz.app.user.model.CollectionDto;
import com.hlz.app.user.service.CollectionService;
import com.hlz.app.user.service.impl.CollectionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/collection")
public class CollectionController {
    private Logger logger = LoggerFactory.getLogger(CollectionController.class);
    private String logtitle = "收藏接口|#";

    @Autowired
    private CollectionService collectionService;
    private CollectionServiceImpl collectionServiceimpl;
    @ResponseBody
    @PostMapping("/insertCollection")
    public TestReponseDto InsertCollection(@RequestBody CollectionDto collectionDto){

        TestReponseDto dto = new TestReponseDto();
        try{
                collectionService.InsertCollection(collectionDto);
                dto.setMessage("插入成功");
                dto.setSuccess("1");
                logger.info(logtitle+"插入成功");
        }catch (Exception e){
            e.printStackTrace();
            dto.setMessage("插入失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"插入失败,"+"异常："+e);
        }
        return dto;
        }

    @ResponseBody
    @GetMapping("/selectCollection")
    public TestReponseDto FindCollection(String user_uuid){
        TestReponseDto dto =new TestReponseDto();
        try{
            List<CollectionDto> list = collectionServiceimpl.FindCollection(user_uuid);
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
