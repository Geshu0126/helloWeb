package com.shuker.domain;

/**
 * @ClassName Account
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/9 22:32
 * @Version 1.0
 **/
public class Account {
    private Integer id ;
    private String userName ;
    private double money ;
    private User user ;
    public Account() {
    }

    public Account(Integer id, String userName, double money, User user) {
        this.id = id;
        this.userName = userName;
        this.money = money;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
