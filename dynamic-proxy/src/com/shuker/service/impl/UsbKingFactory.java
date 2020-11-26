package com.shuker.service.impl;

import com.shuker.service.UsbSell;

/**
 * @ClassName UsbKingFactory 目标类
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/25 13:20
 * @Version 1.0
 **/
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
