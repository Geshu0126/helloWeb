package com.shuker.domain;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Producer
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/14 19:56
 * @Version 1.0
 **/
public class Producer {
    private String address ;
    private List<User> userList ;
    private Map<String,Account> accountMap;

    public Producer() {
    }

    public Producer(String address, List<User> userList, Map<String, Account> accountMap) {
        this.address = address;
        this.userList = userList;
        this.accountMap = accountMap;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "address='" + address + '\'' +
                ", userList=" + userList +
                ", userMap=" + accountMap +
                '}';
    }
}
