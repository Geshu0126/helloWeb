package com.shuker.service;

import com.shuker.service.handle.MySellHandle;
import com.shuker.service.impl.UsbKingFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName MainShop
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/25 13:36
 * @Version 1.0
 **/
public class MainShop {
    public static void main(String[] args) {
        //创建目标对象
        UsbSell sell = new UsbKingFactory();
        //创建InvocationHandle 对象
        InvocationHandler handler = new MySellHandle(sell);
        //创建代理类，使用proxy
        UsbSell proxyInstance = (UsbSell) Proxy.newProxyInstance(sell.getClass().getClassLoader(), sell.getClass().getInterfaces(), handler);
        float price = proxyInstance.sell(1);
        System.out.println("dynamic-proxy method execute ===>result=" +price);
    }
}
