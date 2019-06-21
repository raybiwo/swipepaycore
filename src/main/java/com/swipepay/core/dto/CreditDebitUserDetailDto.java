package com.swipepay.core.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

public class CreditDebitUserDetailDto {

    private int id;
    private String username;
    private String batch_group;
    private int merchant_mid_id;
    private String tid;
    private int batch_num;
    private String tle_mk_id;
    private String tle_mk;
    private String tle_wk_id;
    private String tle_wk_dek;
    private String tle_wk_mak;

    @Column(name = "PIN_BLOCK_MK")
    private String pin_block_mk;

    @Column(name = "PIN_BLOCK_WK")
    private String pin_block_wk;

    @Column(name = "LAST_CREDIT_DEBIT_USER_DETAIL_UPDATE_TIMESTAMP")
    @NotNull
    private Timestamp last_credit_debit_user_detail_update_timestamp;

    @Column(name = "TRANSACTION_CHANNEL_ID")
    @NotNull
    private String transaction_channel_id;

    @Column(name = "NEED_TLMK_DWL_FLAG")
    @NotNull
    private String need_tlmk_dwl_flag;

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

    public String getBatch_group() {
        return batch_group;
    }

    public void setBatch_group(String batch_group) {
        this.batch_group = batch_group;
    }

    public int getMerchant_mid_id() {
        return merchant_mid_id;
    }

    public void setMerchant_mid_id(int merchant_mid_id) {
        this.merchant_mid_id = merchant_mid_id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(int batch_num) {
        this.batch_num = batch_num;
    }

    public String getTle_mk_id() {
        return tle_mk_id;
    }

    public void setTle_mk_id(String tle_mk_id) {
        this.tle_mk_id = tle_mk_id;
    }

    public String getTle_mk() {
        return tle_mk;
    }

    public void setTle_mk(String tle_mk) {
        this.tle_mk = tle_mk;
    }

    public String getTle_wk_id() {
        return tle_wk_id;
    }

    public void setTle_wk_id(String tle_wk_id) {
        this.tle_wk_id = tle_wk_id;
    }

    public String getTle_wk_dek() {
        return tle_wk_dek;
    }

    public void setTle_wk_dek(String tle_wk_dek) {
        this.tle_wk_dek = tle_wk_dek;
    }

    public String getTle_wk_mak() {
        return tle_wk_mak;
    }

    public void setTle_wk_mak(String tle_wk_mak) {
        this.tle_wk_mak = tle_wk_mak;
    }

    public String getPin_block_mk() {
        return pin_block_mk;
    }

    public void setPin_block_mk(String pin_block_mk) {
        this.pin_block_mk = pin_block_mk;
    }

    public String getPin_block_wk() {
        return pin_block_wk;
    }

    public void setPin_block_wk(String pin_block_wk) {
        this.pin_block_wk = pin_block_wk;
    }

    public Timestamp getLast_credit_debit_user_detail_update_timestamp() {
        return last_credit_debit_user_detail_update_timestamp;
    }

    public void setLast_credit_debit_user_detail_update_timestamp(Timestamp last_credit_debit_user_detail_update_timestamp) {
        this.last_credit_debit_user_detail_update_timestamp = last_credit_debit_user_detail_update_timestamp;
    }

    public String getTransaction_channel_id() {
        return transaction_channel_id;
    }

    public void setTransaction_channel_id(String transaction_channel_id) {
        this.transaction_channel_id = transaction_channel_id;
    }

    public String getNeed_tlmk_dwl_flag() {
        return need_tlmk_dwl_flag;
    }

    public void setNeed_tlmk_dwl_flag(String need_tlmk_dwl_flag) {
        this.need_tlmk_dwl_flag = need_tlmk_dwl_flag;
    }
}
