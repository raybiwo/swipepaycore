package com.swipepay.core.dto;

import java.math.BigInteger;
import java.sql.Timestamp;

public class CreditDebitSettlementDto {

    private int idxNum;
    private String mid;
    private String batchGroup;
    private String trxChannel;
    private String username;
    private String tid;
    private BigInteger totalSaleBaseAmount;
    private BigInteger totalRefundBaseAmount;
    private int numOfSaleTrx;
    private int numOfRefundTrx;
    private String stan;
    private int batchNum;
    private BigInteger totalTipAmount;
    private int numOfTip;
    private String settlementHostTime;
    private String settlementHostDate;
    private int secondSettlementFlag;
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
