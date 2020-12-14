package com.shuker.domain;

import java.util.Date;

/**
 * @ClassName FormatTest
 * @Description TODO 自定义类型转换的实体类
 * @Author Shuker
 * @Date 2020/12/14 21:52
 * @Version 1.0
 **/
public class FormatTest {
    private Date dateTime ;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "FormatTest{" +
                "dateTime=" + dateTime +
                '}';
    }
}
