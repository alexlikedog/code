package com.alex.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author alex
 * @Title: Container
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/1/5  13:58
 */
public class Container {
    public static ClassPathXmlApplicationContext getContextFromClassPathXmlApplicationContext(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:beans.xml");
        return context;
    }
}
