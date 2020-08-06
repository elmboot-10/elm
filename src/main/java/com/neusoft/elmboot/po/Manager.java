package com.neusoft.elmboot.po;

public class Manager {

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Manager() {
    }

    public Manager(String account, String password) {
        this.account = account;
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Manager{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}