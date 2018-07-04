package com.hlz.app.homePageData.model;

import java.io.Serializable;

public class HomePageDataDto  implements Serializable {
    /**
     * 招聘岗位
     */
    private String job;
    /**
     * 商家地址
     */
    private String merchantAddress;
    /**
     * 薪资待遇
     * @return
     */
    private String payMoney;
    /**
     * 开始时间
     * @return
     */
    private String startTime;
    /**
     * 结束时间
     * @return
     */
    private String endTime;
    /**
     * 截止时间
     * @return
     */
    private String deadLineTime;
    /**
     * 商家名称
     */
    private String merchantName;
    /**
     * 商家id，设为uuid
     */
    private String  merchantId;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDeadLineTime() {
        return deadLineTime;
    }

    public void setDeadLineTime(String deadLineTime) {
        this.deadLineTime = deadLineTime;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}
