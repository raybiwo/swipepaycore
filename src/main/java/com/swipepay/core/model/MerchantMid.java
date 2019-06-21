package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MERCHANT_MID")
@EntityListeners(AuditingEntityListener.class)
public class MerchantMid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "MID")
    @NotNull
    private String mid;

    @Column(name = "MERCHANT_ID")
    @NotNull
    private int merchantId;

    @Column(name = "BATCH_GROUP_ID")
    @NotNull
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
