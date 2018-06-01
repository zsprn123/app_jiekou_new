package com.hlz.app.homePageData.service;


import com.hlz.app.homePageData.model.HomePageDataDto;

import java.util.List;

public interface HomePageDataService {
    List<HomePageDataDto> selectList(int pageNum, int pageSize);
}
