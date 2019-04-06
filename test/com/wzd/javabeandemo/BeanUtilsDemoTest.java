package com.wzd.javabeandemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class BeanUtilsDemoTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void getBean() throws InvocationTargetException, IllegalAccessException {
        BeanUtilsDemo demo = new BeanUtilsDemo();
        demo.getBean();
    }
}