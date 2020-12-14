package com.shuker.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateConvert
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/14 22:20
 * @Version 1.0
 **/
/*在接口上面指定转换的类型*/
/*在springmvc.xml文件中配置*/
public class DateConvert implements Converter<String, Date> {

    public Date convert(String source) {
        /*校验数据*/
        if (source == null) {
            throw new RuntimeException("参数不能为空");
        }
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //解析字符串
            Date date = dateFormat.parse(source);
            return date;
        } catch (Exception e) {
            throw new RuntimeException("类型转换错误");
        }
    }
}
