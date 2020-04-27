package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MessageTest {

    @Before
    public void setUp() {
        System.out.println("before");
    }

    @After
    public void tearDown() {
        System.out.println("after");
    }

    @Test
    public void test() {
        //查询类路径 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        //根据id获取bean
        //Spring就是一个大工厂（容器）专门生成bean bean就是对象
//        Message message = (Message) applicationContext.getBean("helloSpring");
        Message message = new Message();
        message.setMessage("hello java");
        //输出获取到的对象
        message.getMessage();
        System.out.println("message="+message);
    }
}