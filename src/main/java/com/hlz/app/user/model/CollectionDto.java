package com.hlz.app.user.model;
public class CollectionDto {
    private String userUuid;
    private String merchantName;
    private String modifTime;
    private String merchantId;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getModifTime() {
        return modifTime;
    }

    public void setModifTime(String modifTime) {
        this.modifTime = modifTime;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
}
