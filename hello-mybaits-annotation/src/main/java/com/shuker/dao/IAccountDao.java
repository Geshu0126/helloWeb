package com.shuker.dao;

import com.shuker.domain.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @ClassName IAccountDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/2 23:51
 * @Version 1.0
 **/
public interface IAccountDao {

    /**
     * @Description:查询所有账户信息
     * @Author:Shuker
     * @Date: 2020/12/2 23:51

     * @return: java.util.List<com.shuker.domain.Account>
     **/
    @Select("select * from account")
    @Results(id = "accountMap" ,value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "uid" , property = "uid"),
            @Result(column = "money" , property = "money"),
            @Result(column = "uid", property="user", one = @One(select = "com.shuker.dao.IUserDao.findById",fetchType = FetchType.EAGER))
    })
    List<Account> findAll();

    @Select("select * from account where uid = #{userId}")
    List<Account> findAccountById();
}
