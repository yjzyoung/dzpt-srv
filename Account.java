package com.ourteam.dzpt.entity;

public class Account {
    private int userId;
    private String payPassword;
    private long balacne;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public long getBalacne() {
        return balacne;
    }

    public void setBalacne(long balacne) {
        this.balacne = balacne;
    }
}
