package com.shuker.domain;

/**
 * @ClassName AccountUser
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 20:47
 * @Version 1.0
 **/
public class AccountUser extends Account {
    private String accountUserName ;
    private String accountAddress ;

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    @Override
    public String toString() {
        return super.toString()+"AccountUser{" +
                "accountUserName='" + accountUserName + '\'' +
                ", accountAddress='" + accountAddress + '\'' +
                '}';
    }
}
