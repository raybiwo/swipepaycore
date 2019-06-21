package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "DEVICE")
@EntityListeners(AuditingEntityListener.class)
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "MERCHANT_ID")
    private int merchantId;

    @Column(name = "DEVICE_ID")
    @NotNull
    private String deviceId;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TMK")
    private String tmk;

    @Column(name = "ENC_PIN_IPEK")
    private String encPinIpek;

    @Column(name = "ENC_TRACK_IPEK")
    private String encTrackIpek;

    @Column(name = "ENC_EMV_IPEK")
    private String encEmvIpek;

    @Column(name = "PIN_KSN")
    private String pinKsn;

    @Column(name = "TRACK_KSN")
    private String trackKsn;

    @Column(name = "EMV_KSN")
    private String emvKsn;

    @Column(name = "LAST_DONGLE_REGISTRATION_UPDATE_TIMESTAMP")
    @NotNull
    private Timestamp lastDongleRegistrationUpdateTimestamp;

    @Column(name = "LAST_DUKPT_KEY_DOWNLOAD_TIMESTAMP")
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
