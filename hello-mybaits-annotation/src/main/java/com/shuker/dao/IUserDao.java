package com.shuker.dao;

import com.shuker.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/2 18:59
 * @Version 1.0
 **/
public interface IUserDao {
    /**
     * @Description:查询所有用户
     * @Author:Shuker
     * @Date: 2020/12/2 18:59

     * @return: java.util.List<com.shuker.domain.User>
     **/
    @Select("select * from user")
    @Results(id = "userMap", value={
            @Result(id = true,column = "id", property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(property = "accounts",column = "id",many = @Many(select = "com.shuker.dao.IAccountDao.findAccountById",fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    /**
     * @Description:保存用户
     * @Author:Shuker
     * @Date: 2020/12/2 19:19
     * @param user:
     * @return: void
     **/
    @Insert("insert into user(username,sex,birthday,address)values(#{userName},#{userSex},#{userBirthday},#{userAddress})")
    void saveUser(User user);

    /**
     * @Description:用户更新操作
     * @Author:Shuker
     * @Date: 2020/12/2 19:33
     * @param user:
     * @return:
     **/
    @Update("update user set username=#{username},sex=#{sex},address=#{address},birthday=#{birthday}where id=#{id}")
    int updateUser(User user);

    /**
     * @Description:删除用户
     * @Author:Shuker
     * @Date: 2020/12/2 19:45
     * @param id:
     * @return: int
     **/
    @Delete("delete from user where id = #{id}")
    int deleteUserById(Integer id);

    /**
     * @Description:通过用户id查询用户信息
     * @Author:Shuker
     * @Date: 2020/12/3 0:05
     * @param id:
     * @return: com.shuker.domain.User
     **/
    @Select("select * from user where id =#{id}")
    User findById(Integer id);
}
