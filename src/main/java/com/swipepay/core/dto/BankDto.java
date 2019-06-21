package com.swipepay.core.dto;

public class BankDto {
    private String name;
    private String code;
    private String printReceiptLogo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrintReceiptLogo() {
        return printReceiptLogo;
    }

    public void setPrintReceiptLogo(String printReceiptLogo) {
        this.printReceiptLogo = printReceiptLogo;
    }
}
