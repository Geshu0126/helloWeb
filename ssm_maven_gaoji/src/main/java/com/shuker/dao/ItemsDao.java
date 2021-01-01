package com.shuker.dao;

import com.shuker.domain.Items;

/**
 * @ClassName ItemsDao
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 11:05
 * @Version 1.0
 **/
public interface ItemsDao {
    /**
     * @Description:通过id查询Items对象
     * @Author:Shuker
     * @Date: 2021/1/1 11:06
     * @param id:
     * @return: com.shuker.domain.Items
     **/
    public Items findById(Integer id);
}
