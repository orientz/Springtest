package com.tongji.Springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wb-cengyanyu on 2016/6/2.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
        People people=applicationContext.getBean("people", com.tongji.Springtest.People.class);
        people.getName();
    }
}
