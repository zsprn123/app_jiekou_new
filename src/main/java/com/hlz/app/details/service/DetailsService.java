package com.hlz.app.details.service;

import com.hlz.app.details.model.DetailsDto;

import java.util.List;

public interface DetailsService {
    List<DetailsDto> FindDetails(String merchant_id);
}
