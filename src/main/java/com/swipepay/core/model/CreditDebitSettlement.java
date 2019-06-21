package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "CREDIT_DEBIT_SETTLEMENT")
@EntityListeners(AuditingEntityListener.class)
public class CreditDebitSettlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX_NUM", unique = true, nullable = false)
    private int idxNum;

    @Column(name = "mid")
    @NotNull
    private String mid;

    @Column(name = "batch_group")
    @NotNull
    private String batchGroup;

    @Column(name = "trx_channel")
    private String trxChannel;

    @Column(name = "username")
    private String username;

    @Column(name = "tid")
    private String tid;

    @Column(name = "total_sale_base_amount")
    private BigInteger totalSaleBaseAmount;

    @Column(name = "total_refund_base_amount")
    private BigInteger totalRefundBaseAmount;

    @Column(name = "num_of_sale_trx")
    private int numOfSaleTrx;

    @Column(name = "num_of_refund_trx")
    private int numOfRefundTrx;

    @Column(name = "stan")
    private String stan;

    @Column(name = "batch_num")
    private int batchNum;

    @Column(name = "total_tip_amount")
    private BigInteger totalTipAmount;

    @Column(name = "num_of_tip")
    private int numOfTip;

    @Column(name = "settlement_host_time")
    private String settlementHostTime;

    @Column(name = "settlement_host_date")
    private String settlementHostDate;

    @Column(name = "second_settlement_flag")
    private int secondSettlementFlag;

    @Column(name = "db_timestamp")
    private Timestamp dbTimestamp;

    public int getIdxNum() {
        return idxNum;
    }

    public void setIdxNum(int idxNum) {
        this.idxNum = idxNum;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getBatchGroup() {
        return batchGroup;
    }

    public void setBatchGroup(String batchGroup) {
        this.batchGroup = batchGroup;
    }

    public String getTrxChannel() {
        return trxChannel;
    }

    public void setTrxChannel(String trxChannel) {
        this.trxChannel = trxChannel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public BigInteger getTotalSaleBaseAmount() {
        return totalSaleBaseAmount;
    }

    public void setTotalSaleBaseAmount(BigInteger totalSaleBaseAmount) {
        this.totalSaleBaseAmount = totalSaleBaseAmount;
    }

    public BigInteger getTotalRefundBaseAmount() {
        return totalRefundBaseAmount;
    }

    public void setTotalRefundBaseAmount(BigInteger totalRefundBaseAmount) {
        this.totalRefundBaseAmount = totalRefundBaseAmount;
    }

    public int getNumOfSaleTrx() {
        return numOfSaleTrx;
    }

    public void setNumOfSaleTrx(int numOfSaleTrx) {
        this.numOfSaleTrx = numOfSaleTrx;
    }

    public int getNumOfRefundTrx() {
        return numOfRefundTrx;
    }

    public void setNumOfRefundTrx(int numOfRefundTrx) {
        this.numOfRefundTrx = numOfRefundTrx;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        this.batchNum = batchNum;
    }

    public BigInteger getTotalTipAmount() {
        return totalTipAmount;
    }

    public void setTotalTipAmount(BigInteger totalTipAmount) {
        this.totalTipAmount = totalTipAmount;
    }

    public int getNumOfTip() {
        return numOfTip;
    }

    public void setNumOfTip(int numOfTip) {
        this.numOfTip = numOfTip;
    }

    public String getSettlementHostTime() {
        return settlementHostTime;
    }

    public void setSettlementHostTime(String settlementHostTime) {
        this.settlementHostTime = settlementHostTime;
    }

    public String getSettlementHostDate() {
        return settlementHostDate;
    }

    public void setSettlementHostDate(String settlementHostDate) {
        this.settlementHostDate = settlementHostDate;
    }

    public int getSecondSettlementFlag() {
        return secondSettlementFlag;
    }

    public void setSecondSettlementFlag(int secondSettlementFlag) {
        this.secondSettlementFlag = secondSettlementFlag;
    }

    public Timestamp getDbTimestamp() {
        return dbTimestamp;
    }

    public void setDbTimestamp(Timestamp dbTimestamp) {
        this.dbTimestamp = dbTimestamp;
    }
}
