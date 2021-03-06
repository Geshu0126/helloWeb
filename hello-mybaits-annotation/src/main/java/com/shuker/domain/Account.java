package com.shuker.domain;

import java.io.Serializable;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/2 23:50
 * @Version 1.0
 **/
public class Account implements Serializable {
    private Integer id ;
    private Integer uid ;
    private double money ;
    private User user ;

    public Account() {
    }

    public Account(Integer id, Integer uid, double money) {
        this.id = id;
        uid = uid;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
