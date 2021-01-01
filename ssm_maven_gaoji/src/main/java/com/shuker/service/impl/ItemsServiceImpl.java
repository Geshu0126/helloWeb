package com.shuker.service.impl;

import com.shuker.dao.ItemsDao;
import com.shuker.domain.Items;
import com.shuker.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ItemsServiceImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 11:38
 * @Version 1.0
 **/
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao ;
    /**
     * @param id :
     * @Description:业务层
     * @Author:Shuker
     * @Date: 2021/1/1 11:37
     * @return: com.shuker.domain.Items
     **/
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
