package com.hlz.app.homePageData.model;

import java.io.Serializable;

public class HomePageDataDto implements Serializable {

    private String job;
    private String merchant_address;
    private String part_time_date;
    private String pay_money;
    private String settlement;
    private String business_licens;
    private String merchant_name;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMerchant_address() {
        return merchant_address;
    }

    public void setMerchant_address(String merchant_address) {
        this.merchant_address = merchant_address;
    }

    public String getPart_time_date() {
        return part_time_date;
    }

    public void setPart_time_date(String part_time_date) {
        this.part_time_date = part_time_date;
    }

    public String getPay_money() {
        return pay_money;
    }

    public void setPay_money(String pay_money) {
        this.pay_money = pay_money;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getBusiness_licens() {
        return business_licens;
    }

    public void setBusiness_licens(String business_licens) {
        this.business_licens = business_licens;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }
}
