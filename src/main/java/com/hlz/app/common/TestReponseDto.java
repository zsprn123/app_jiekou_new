package com.hlz.app.common;


import java.util.List;

public class TestReponseDto extends ReponseDto {

    private List<?> Data;

    public List<?> getTitle2() {
        return title2;
    }

    public void setTitle2(List<?> title2) {
        this.title2 = title2;
    }

    private List<?> title2;

    public List<?> getData() {
        return Data;
    }

    public void setData(List<?> data) {
        Data = data;
    }
}
