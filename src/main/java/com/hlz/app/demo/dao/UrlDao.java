package com.hlz.app.demo.dao;

import com.hlz.app.demo.model.UrlInfo;

import java.util.List;

public interface UrlDao {
    List<UrlInfo> selectUrl();
}
