package com.swipepay.core.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class DeviceDto {

    private int id;
    private int merchantId;
    private String deviceId;
    private String brand;
    private String type;
    private String description;
    private String tmk;
    private String encPinIpek;
    private String encTrackIpek;
    private String encEmvIpek;
    private String pinKsn;
    private String trackKsn;
    private String emvKsn;
    private Timestamp lastDongleRegistrationUpdateTimestamp;
    private Date lastDukptKeyDownloadTimestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTmk() {
        return tmk;
    }

    public void setTmk(String tmk) {
        this.tmk = tmk;
    }

    public String getEncPinIpek() {
        return encPinIpek;
    }

    public void setEncPinIpek(String encPinIpek) {
        this.encPinIpek = encPinIpek;
    }

    public String getEncTrackIpek() {
        return encTrackIpek;
    }

    public void setEncTrackIpek(String encTrackIpek) {
        this.encTrackIpek = encTrackIpek;
    }

    public String getEncEmvIpek() {
        return encEmvIpek;
    }

    public void setEncEmvIpek(String encEmvIpek) {
        this.encEmvIpek = encEmvIpek;
    }

    public String getPinKsn() {
        return pinKsn;
    }

    public void setPinKsn(String pinKsn) {
        this.pinKsn = pinKsn;
    }

    public String getTrackKsn() {
        return trackKsn;
    }

    public void setTrackKsn(String trackKsn) {
        this.trackKsn = trackKsn;
    }

    public String getEmvKsn() {
        return emvKsn;
    }

    public void setEmvKsn(String emvKsn) {
        this.emvKsn = emvKsn;
    }

    public Timestamp getLastDongleRegistrationUpdateTimestamp() {
        return lastDongleRegistrationUpdateTimestamp;
    }

    public void setLastDongleRegistrationUpdateTimestamp(Timestamp lastDongleRegistrationUpdateTimestamp) {
        this.lastDongleRegistrationUpdateTimestamp = lastDongleRegistrationUpdateTimestamp;
    }

    public Date getLastDukptKeyDownloadTimestamp() {
        return lastDukptKeyDownloadTimestamp;
    }

    public void setLastDukptKeyDownloadTimestamp(Date lastDukptKeyDownloadTimestamp) {
        this.lastDukptKeyDownloadTimestamp = lastDukptKeyDownloadTimestamp;
    }
}
