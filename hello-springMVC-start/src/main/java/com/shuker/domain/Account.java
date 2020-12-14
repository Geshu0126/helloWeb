package com.shuker.domain;

import java.io.Serializable;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/14 19:40
 * @Version 1.0
 **/
public class Account implements Serializable {
    private Integer accountId;
    private double money ;
    private User user ;

    public Account() {
    }

    public Account(Integer accountId, double money, User user) {
        this.accountId = accountId;
        this.money = money;
        this.user = user;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
