package com.shuker;

/**
 * @ClassName HelloMaven
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/27 0:18
 * @Version 1.0
 **/
public class HelloMaven {
    /***
     * @Description: 简单的add操作
     * @Author:Shuker
     * @Date: 2020/11/27 0:19
     * @param a:
     * @param b:
     * @return: int
     **/
    public int add(int a, int b) {
        System.out.println("===第一个maven环境中的java类===");
        return a+b ;
    }

    /**
     * @Description: 主方法
     * @Author:Shuker
     * @Date: 2020/11/27 0:20
     * @param args:
     * @return: void
     **/
    public static void main(String[] args) {
        HelloMaven maven = new HelloMaven();
        int add = maven.add(10, 20);
        System.out.println(add);
    }
}
