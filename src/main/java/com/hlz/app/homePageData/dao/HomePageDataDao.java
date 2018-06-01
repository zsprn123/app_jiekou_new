package com.hlz.app.homePageData.dao;

import com.hlz.app.homePageData.model.HomePageDataDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface HomePageDataDao {

    List<HomePageDataDto> selectHomePageDateList();

}
