package com.hlz.app.common;


import java.util.List;

public class TestReponseDto extends ReponseDto {

    private List<?> Data;

    public List<?> getData() {
        return Data;
    }

    public void setData(List<?> data) {
        Data = data;
    }
}
