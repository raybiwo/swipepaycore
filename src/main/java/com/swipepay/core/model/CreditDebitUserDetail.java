package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "CREDIT_DEBIT_USER_DETAIL")
@EntityListeners(AuditingEntityListener.class)
public class CreditDebitUserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "USERNAME")
    @NotNull
    private String username;

    @Column(name = "BATCH_GROUP")
    @NotNull
    private String batchGroup;

    @Column(name = "MERCHANT_MID_ID")
    @NotNull
    private int merchantMidId;

    @Column(name = "TID")
    @NotNull
    private String tid;

    @Column(name = "BATCH_NUM")
    @NotNull
    private int batchNum;

    @Column(name = "TLE_MK_ID")
    private String tleMkId;

    @Column(name = "TLE_MK")
    private String tleMk;

    @Column(name = "TLE_WK_ID")
    private String tleWkId;

    @Column(name = "TLE_WK_DEK")
    private String tleWkDek;

    @Column(name = "TLE_WK_MAK")
    private String tleWkMak;

    @Column(name = "PIN_BLOCK_MK")
    private String pinBlockMk;

    @Column(name = "PIN_BLOCK_WK")
    private String pinBlockWk;

    @Column(name = "LAST_CREDIT_DEBIT_USER_DETAIL_UPDATE_TIMESTAMP")
    @NotNull
    private Timestamp lastCreditBebitUserDetailUpdateTimestamp;

    @Column(name = "TRANSACTION_CHANNEL_ID")
    @NotNull
    private String transactionChannelId;

    @Column(name = "NEED_TLMK_DWL_FLAG")
    @NotNull
    private String needTlmkDwlFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBatchGroup() {
        return batchGroup;
    }

    public void setBatchGroup(String batchGroup) {
        this.batchGroup = batchGroup;
    }

    public int getMerchantMidId() {
        return merchantMidId;
    }

    public void setMerchantMidId(int merchantMidId) {
        this.merchantMidId = merchantMidId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        this.batchNum = batchNum;
    }

    public String getTleMkId() {
        return tleMkId;
    }

    public void setTleMkId(String tleMkId) {
        this.tleMkId = tleMkId;
    }

    public String getTleMk() {
        return tleMk;
    }

    public void setTleMk(String tleMk) {
        this.tleMk = tleMk;
    }

    public String getTleWkId() {
        return tleWkId;
    }

    public void setTleWkId(String tleWkId) {
        this.tleWkId = tleWkId;
    }

    public String getTleWkDek() {
        return tleWkDek;
    }

    public void setTleWkDek(String tleWkDek) {
        this.tleWkDek = tleWkDek;
    }

    public String getTleWkMak() {
        return tleWkMak;
    }

    public void setTleWkMak(String tleWkMak) {
        this.tleWkMak = tleWkMak;
    }

    public String getPinBlockMk() {
        return pinBlockMk;
    }

    public void setPinBlockMk(String pinBlockMk) {
        this.pinBlockMk = pinBlockMk;
    }

    public String getPinBlockWk() {
        return pinBlockWk;
    }

    public void setPinBlockWk(String pinBlockWk) {
        this.pinBlockWk = pinBlockWk;
    }

    public Timestamp getLastCreditBebitUserDetailUpdateTimestamp() {
        return lastCreditBebitUserDetailUpdateTimestamp;
    }

    public void setLastCreditBebitUserDetailUpdateTimestamp(Timestamp lastCreditBebitUserDetailUpdateTimestamp) {
        this.lastCreditBebitUserDetailUpdateTimestamp = lastCreditBebitUserDetailUpdateTimestamp;
    }

    public String getTransactionChannelId() {
        return transactionChannelId;
    }

    public void setTransactionChannelId(String transactionChannelId) {
        this.transactionChannelId = transactionChannelId;
    }

    public String getNeedTlmkDwlFlag() {
        return needTlmkDwlFlag;
    }

    public void setNeedTlmkDwlFlag(String needTlmkDwlFlag) {
        this.needTlmkDwlFlag = needTlmkDwlFlag;
    }
}
