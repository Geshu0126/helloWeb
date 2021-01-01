package com.shuker.service;

import com.shuker.domain.Items;

/**
 * @ClassName ItemsService
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 11:36
 * @Version 1.0
 **/
public interface ItemsService {
    /**
     * @Description:业务层
     * @Author:Shuker
     * @Date: 2021/1/1 11:37
     * @param id:
     * @return: com.shuker.domain.Items
     **/
    public Items findById(Integer id);

}
