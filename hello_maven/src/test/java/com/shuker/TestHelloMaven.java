package com.shuker;

import org.junit.Test;

/**
 * @ClassName TestHelloMaven
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/27 0:20
 * @Version 1.0
 **/
public class TestHelloMaven {
    @Test
    public void testHelloMaven(){
        HelloMaven maven = new HelloMaven();
        int add = maven.add(10, 30);
        System.out.println(add);
    }
}
