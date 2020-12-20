package com.shuker.dao;

import com.shuker.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName AccountDao 账户dao接口
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/19 14:09
 * @Version 1.0
 **/
@Repository
public interface AccountDao {

    /**
     * @Description: 查询所有
     * @Author:Shuker
     * @Date: 2020/12/19 14:10

     * @return: java.util.List<com.shuker.domain.Account>
     **/
    @Select("select * from account1")
    List<Account> findAll();


    /**
     * @Description:保存账户的方法
     * @Author:Shuker
     * @Date: 2020/12/19 14:10
     * @param account:
     * @return: void
     **/
    @Insert("insert into account1(name,money)values(#{name},#{money})")
    void saveAccount(Account account);
}
