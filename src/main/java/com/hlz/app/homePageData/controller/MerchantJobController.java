package com.hlz.app.homePageData.controller;

import com.hlz.app.common.TestReponseDto;
import com.hlz.app.homePageData.model.MerchantJob;
import com.hlz.app.homePageData.service.MerchantJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("/merchantJobInsertInfo")
public class MerchantJobController {
    private Logger logger = LoggerFactory.getLogger(MerchantJobController.class);
    private String logtitle = "商家招聘信息插入接口|#";

    @Autowired
    private MerchantJobService merchantJobService;

    @ResponseBody
    @GetMapping("/insertData")
    public TestReponseDto selectList(MerchantJob merchantJob){
        TestReponseDto dto = new TestReponseDto();
        String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase();
        merchantJob.setMerchantId(uuid);
//        JSON json = JSON.parseObject(data);
        //MerchantJob merchantJob = new MerchantJob();
       /* merchantJob.setBusinessLicens(((JSONObject) json).getString("BusinessLicens"));
        merchantJob.setJob(((JSONObject) json).getString("job"));
        merchantJob.setJobRequire(((JSONObject) json).getString("JobRequire"));
        merchantJob.setMerchantAddress(((JSONObject) json).getString("MerchantAddress"));
        merchantJob.setMerchantName(((JSONObject) json).getString("MerchantName"));
       merchantJob.setPeopleCount(((JSONObject) json).getString("PeopleCount"));
        merchantJob.setPhoneNum(((JSONObject) json).getString("PhoneNum"));
        merchantJob.setPrincipal(((JSONObject) json).getString("Principal"));*/
        try{
            int result = merchantJobService.insertInfo(merchantJob);
            if(result>0){
                dto.setMessage("插入成功");
                dto.setSuccess("1");
                logger.info(logtitle+"插入成功");
            }else{
                dto.setMessage("插入失败");
                dto.setSuccess("-1");
            }
        }catch (Exception e){
            e.printStackTrace();
            dto.setMessage("插入失败");
            dto.setSuccess("-1");
            logger.info(logtitle+"插入失败,"+"异常："+e);
        }
        return dto;
        }

}
