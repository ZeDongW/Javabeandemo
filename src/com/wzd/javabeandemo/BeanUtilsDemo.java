package com.wzd.javabeandemo;

import com.wzd.entity.Emp;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：Administrator
 * @title :BeanUtilsDemo
 * @projectName :Javabeandemo
 * @description：JavaBeanUtils演示类
 * @version: 1.0
 * @date ：Created in 2019/04/06/0006 8:35
 * @modified By：
 */
public class BeanUtilsDemo {
    public void getBean() throws InvocationTargetException, IllegalAccessException {
        Emp e = new Emp();
        String id = "110";
        String name = "张三";
        String salary = "3456.78";
        String birthday = "1994.01.06";
        ConvertUtils.register(new Converter() {
            @Override
            public <T> T convert(Class<T> type, Object value) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
                Date parse = null;
                try {
                    parse = simpleDateFormat.parse((String) value);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                return (T) parse;
            }
        }, Date.class);
        BeanUtils.setProperty(e,"id",id);
        BeanUtils.setProperty(e,"name",name);
        BeanUtils.setProperty(e,"salary",salary);
        BeanUtils.setProperty(e,"birthday",birthday);
        System.out.println(e);
    }
}
