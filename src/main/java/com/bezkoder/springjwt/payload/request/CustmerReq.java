package com.bezkoder.springjwt.payload.request;

import jakarta.validation.constraints.NotBlank;

public class CustmerReq {
    @NotBlank(message = "Custmer name should not be blank")
    private String cust_name;
    private double balance;

    private  long mobile;

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
