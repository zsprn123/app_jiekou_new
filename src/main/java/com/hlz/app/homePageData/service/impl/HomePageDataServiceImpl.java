package com.hlz.app.homePageData.service.impl;

import com.github.pagehelper.PageHelper;
import com.hlz.app.homePageData.dao.HomePageDataDao;
import com.hlz.app.homePageData.model.HomePageDataDto;
import com.hlz.app.homePageData.service.HomePageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("homePageDataService")
public class HomePageDataServiceImpl implements HomePageDataService {

    @Autowired
    private HomePageDataDao homePageDataDao;

    @Override
    public List<HomePageDataDto> selectList(int pageNum, int pageSize ) {
        PageHelper.startPage(pageNum, pageSize);
        List<HomePageDataDto> list = homePageDataDao.selectHomePageDateList();
        return list ;
    }
}
