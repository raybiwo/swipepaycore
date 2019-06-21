package com.swipepay.core.dto;

public class MerchantMidDto {
    private int id;
    private String mid;
    private int merchantId;
    private String batchGroupId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getBatchGroupId() {
        return batchGroupId;
    }

    public void setBatchGroupId(String batchGroupId) {
        this.batchGroupId = batchGroupId;
    }
}
