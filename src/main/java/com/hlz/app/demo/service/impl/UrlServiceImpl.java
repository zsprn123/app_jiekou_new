package com.hlz.app.demo.service.impl;

import com.hlz.app.demo.dao.UrlDao;
import com.hlz.app.demo.model.UrlInfo;
import com.hlz.app.demo.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "urlService")
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlDao urlDao;
    @Override
    public List<UrlInfo> findUrl() {
        List<UrlInfo> list = urlDao.selectUrl();
        return list;
    }
}
