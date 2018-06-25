package com.hlz.app.homePageData.service.impl;

import com.hlz.app.homePageData.dao.DetailsDao;
import com.hlz.app.homePageData.model.DetailsDto;
import com.hlz.app.homePageData.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("DetailsService")
public  class DetailsServiceImpl implements DetailsService {
    @Autowired
    private DetailsDao detailsDao;

    @Override
    public List<DetailsDto> FindDetails(String merchant_id) {
        Map<String,Object> queryMap = new HashMap<String,Object>();
        queryMap.put("id",merchant_id);
        List<DetailsDto> list = detailsDao.selectDetailsDataList(queryMap);
        return list;
    }
}
