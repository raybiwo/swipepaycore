package com.swipepay.core.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MerchantReportDto {

    private String merchantName;
    private String salesCode;
    private String category;
    private String mid;
    private String tid;
    private Timestamp trxPertama;
    private BigDecimal transAmt;
    private Double earn;
    private String description;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public Timestamp getTrxPertama() {
        return trxPertama;
    }

    public void setTrxPertama(Timestamp trxPertama) {
        this.trxPertama = trxPertama;
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public Double getEarn() {
        return earn;
    }

    public void setEarn(Double earn) {
        this.earn = earn;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
