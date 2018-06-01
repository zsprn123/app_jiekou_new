package com.hlz.app.url.dao;

import com.hlz.app.url.model.UrlInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UrlDao {
    List<UrlInfo> selectUrl();
}
