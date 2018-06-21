package com.hlz.app.user.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.user.dao.ResumeDao;
import com.hlz.app.user.model.ResumeDto;
import com.hlz.app.user.service.ResumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    private Logger logger = LoggerFactory.getLogger(ResumeController.class);
    private String logtitle = "简历插入接口|#";

    @Autowired
    private ResumeService resumeService;

    @ResponseBody
    @PostMapping("/insertResume")
    public TestReponseDto InsertResume(@RequestBody ResumeDto resumeDto){

        TestReponseDto dto = new TestReponseDto();
        String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase();
        resumeDto.setUserUuid(uuid);
        try{
             resumeService.InsertResume(resumeDto);
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

}
