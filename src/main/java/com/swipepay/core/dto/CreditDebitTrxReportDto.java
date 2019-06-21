package com.swipepay.core.dto;
import java.math.BigInteger;

public class CreditDebitTrxReportDto {

    private int idxNum;
    private String  mid;
    private String trxChannel;
    private String username;
    private String batchGroup;
    private int bankIdAcq;
    private String trxType;
    private String tid;
    private String binResult;
    private BigInteger baseAmount;
    private BigInteger tipAmount;
    private String stan;
    private String trxHostDate;
    private String trxHostTime;
    private String voidHostDate;
    private String voidHostTime;
    private String entryMode;
    private String maskedPan;
    private int invoiceNum;
    private int batchNum;
    private String approvalCode;
    private String rrn;
    private int isOnUsFlag;
    private int isDebitFlag;
    private String printReceiptEmail;
    private int printReceiptEmailFlag;
    private String printReceiptPhoneNum;
    private int printReceiptPhoneNumFlag;
    private String dbTimestamp;
    private double bankMdrValue;
    private double merchantMdrValue;

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

    public String getBatchGroup() {
        return batchGroup;
    }

    public void setBatchGroup(String batchGroup) {
        this.batchGroup = batchGroup;
    }

    public int getBankIdAcq() {
        return bankIdAcq;
    }

    public void setBankIdAcq(int bankIdAcq) {
        this.bankIdAcq = bankIdAcq;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getBinResult() {
        return binResult;
    }

    public void setBinResult(String binResult) {
        this.binResult = binResult;
    }

    public BigInteger getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigInteger baseAmount) {
        this.baseAmount = baseAmount;
    }

    public BigInteger getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(BigInteger tipAmount) {
        this.tipAmount = tipAmount;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getTrxHostDate() {
        return trxHostDate;
    }

    public void setTrxHostDate(String trxHostDate) {
        this.trxHostDate = trxHostDate;
    }

    public String getTrxHostTime() {
        return trxHostTime;
    }

    public void setTrxHostTime(String trxHostTime) {
        this.trxHostTime = trxHostTime;
    }

    public String getVoidHostDate() {
        return voidHostDate;
    }

    public void setVoidHostDate(String voidHostDate) {
        this.voidHostDate = voidHostDate;
    }

    public String getVoidHostTime() {
        return voidHostTime;
    }

    public void setVoidHostTime(String voidHostTime) {
        this.voidHostTime = voidHostTime;
    }

    public String getEntryMode() {
        return entryMode;
    }

    public void setEntryMode(String entryMode) {
        this.entryMode = entryMode;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        this.batchNum = batchNum;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public int getIsOnUsFlag() {
        return isOnUsFlag;
    }

    public void setIsOnUsFlag(int isOnUsFlag) {
        this.isOnUsFlag = isOnUsFlag;
    }

    public int getIsDebitFlag() {
        return isDebitFlag;
    }

    public void setIsDebitFlag(int isDebitFlag) {
        this.isDebitFlag = isDebitFlag;
    }

    public String getPrintReceiptEmail() {
        return printReceiptEmail;
    }

    public void setPrintReceiptEmail(String printReceiptEmail) {
        this.printReceiptEmail = printReceiptEmail;
    }

    public int getPrintReceiptEmailFlag() {
        return printReceiptEmailFlag;
    }

    public void setPrintReceiptEmailFlag(int printReceiptEmailFlag) {
        this.printReceiptEmailFlag = printReceiptEmailFlag;
    }

    public String getPrintReceiptPhoneNum() {
        return printReceiptPhoneNum;
    }

    public void setPrintReceiptPhoneNum(String printReceiptPhoneNum) {
        this.printReceiptPhoneNum = printReceiptPhoneNum;
    }

    public int getPrintReceiptPhoneNumFlag() {
        return printReceiptPhoneNumFlag;
    }

    public void setPrintReceiptPhoneNumFlag(int printReceiptPhoneNumFlag) {
        this.printReceiptPhoneNumFlag = printReceiptPhoneNumFlag;
    }

    public String getDbTimestamp() {
        return dbTimestamp;
    }

    public void setDbTimestamp(String dbTimestamp) {
        this.dbTimestamp = dbTimestamp;
    }

    public double getBankMdrValue() {
        return bankMdrValue;
    }

    public void setBankMdrValue(double bankMdrValue) {
        this.bankMdrValue = bankMdrValue;
    }

    public double getMerchantMdrValue() {
        return merchantMdrValue;
    }

    public void setMerchantMdrValue(double merchantMdrValue) {
        this.merchantMdrValue = merchantMdrValue;
    }
}
