package com.hlz.app.demo.dao.url;

import com.hlz.app.demo.model.url.UrlInfo;

import java.util.List;

public interface UrlDao {
    List<UrlInfo> selectUrl();
}
