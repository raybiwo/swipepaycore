package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Entity
@Table(name = "CREDIT_DEBIT_TRX_REPORT")
@EntityListeners(AuditingEntityListener.class)
public class CreditDebitTrxReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX_NUM", unique = true, nullable = false)
    @NotNull
    private int idxNum;

    @Column(name = "MID")
    @NotNull
    private String mid;

    @Column(name = "TRX_CHANNEL")
    @NotNull
    private String trxChannel;

    @Column(name = "USERNAME")
    @NotNull
    private String username;

    @Column(name = "BATCH_GROUP")
    @NotNull
    private String batchGroup;

    @Column(name = "BANK_ID_ACQ")
    @NotNull
    private int bankIdAcq;

    @Column(name = "TRX_TYPE")
    @NotNull
    private String trxType;

    @Column(name = "TID")
    @NotNull
    private String tid;

    @Column(name = "BIN_RESULT")
    @NotNull
    private String binResult;

    @Column(name = "BASE_AMOUNT")
    @NotNull
    private BigInteger baseAmount;

    @Column(name = "TIP_AMOUNT")
    private BigInteger tipAmount;

    @Column(name = "STAN")
    @NotNull
    private String stan;

    @Column(name = "TRX_HOST_DATE")
    @NotNull
    private String trxHostDate;

    @Column(name = "TRX_HOST_TIME")
    @NotNull
    private String trxHostTime;

    @Column(name = "VOID_HOST_DATE")
    private String voidHostDate;

    @Column(name = "VOID_HOST_TIME")
    private String voidHostTime;

    @Column(name = "ENTRY_MODE")
    @NotNull
    private String entryMode;

    @Column(name = "MASKED_PAN")
    @NotNull
    private String maskedPan;

    @Column(name = "INVOICE_NUM")
    private int invoiceNum;

    @Column(name = "BATCH_NUM")
    @NotNull
    private int batchNum;

    @Column(name = "APPROVAL_CODE")
    @NotNull
    private String approvalCode;

    @Column(name = "RRN")
    @NotNull
    private String rrn;

    @Column(name = "IS_ON_US_FLAG")
    private int isOnUsFlag;

    @Column(name = "IS_DEBIT_FLAG")
    private int isDebitFlag;

    @Column(name = "PRINT_RECEIPT_EMAIL")
    private String printReceiptEmail;

    @Column(name = "PRINT_RECEIPT_EMAIL_FLAG")
    private int printReceiptEmailFlag;

    @Column(name = "PRINT_RECEIPT_PHONE_NUM")
    private String printReceiptPhoneNum;

    @Column(name = "PRINT_RECEIPT_PHONE_NUM_FLAG")
    private int printReceiptPhoneNumFlag;

    @Column(name = "DB_TIMESTAMP")
    @NotNull
    private String dbTimestamp;

    @Column(name = "BANK_MDR_VALUE")
    private double bankMdrValue;

    @Column(name = "MERCHANT_MDR_VALUE")
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
