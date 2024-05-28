package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

@Entity
@Table(name = "BankCustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long account_num;
    private String cust_name;
    private double balance;
    private  long mobile;

    public Customer() {

    }

    public Customer(String cust_name, double balance, long mobile) {
        this.cust_name = cust_name;
        this.balance = balance;
        this.mobile = mobile;
    }

    public long getAccount_num() {
        return account_num;
    }

    public void setAccount_num(long account_num) {
        this.account_num = account_num;
    }

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
