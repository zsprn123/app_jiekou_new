package com.hlz.app.homePageData.service;

import com.hlz.app.homePageData.model.DetailsDto;

import java.util.List;

public interface DetailsService {
    List<DetailsDto> FindDetails(String merchant_id);
}
