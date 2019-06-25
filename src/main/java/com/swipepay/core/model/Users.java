package com.swipepay.core.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "USERS")
@EntityListeners(AuditingEntityListener.class)
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID",unique=true, nullable = false)
    private int id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "USERNAME_CANONICAL")
    private String username_canonical;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "EMAIL_CANONICAL")
    private String email_canonical;

    @Column(name = "ENABLED")
    private int enabled;

    @Column(name = "SALT")
    private String salt;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "LAST_LOGIN")
    private Date last_login;

    @Column(name = "CONFIRMATION_TOKEN")
    private String confirmation_token;

    @Column(name = "PASSWORD_REQUESTED_AT")
    private Date password_requested_at;

    @Column(name = "ROLES")
    private String roles;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "IMEI")
    private String imei;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LAST_MOBILE_LOGIN")
    private Timestamp last_mobile_login;

    @Column(name = "MERCHANT_ID")
    private String merchant_id;

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

    public String getUsername_canonical() {
        return username_canonical;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_canonical() {
        return email_canonical;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getConfirmation_token() {
        return confirmation_token;
    }

    public void setConfirmation_token(String confirmation_token) {
        this.confirmation_token = confirmation_token;
    }

    public Date getPassword_requested_at() {
        return password_requested_at;
    }

    public void setPassword_requested_at(Date password_requested_at) {
        this.password_requested_at = password_requested_at;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getLast_mobile_login() {
        return last_mobile_login;
    }

    public void setLast_mobile_login(Timestamp last_mobile_login) {
        this.last_mobile_login = last_mobile_login;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }
}
