package com.hlz.app.demo.model.base;

import com.hlz.app.demo.model.base.ReponseDto;
import com.hlz.app.demo.model.url.UrlInfo;

import java.util.List;

public class TestReponseDto extends ReponseDto {

    private List<UrlInfo> title;

    public List<UrlInfo> getTitle2() {
        return title2;
    }

    public void setTitle2(List<UrlInfo> title2) {
        this.title2 = title2;
    }

    private List<UrlInfo> title2;
    public List<UrlInfo> getTitle() {
        return title;
    }

    public void setTitle(List<UrlInfo> title) {
        this.title = title;
    }
}
