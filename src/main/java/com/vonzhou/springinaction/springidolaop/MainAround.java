package com.vonzhou.springinaction.springidolaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 排练
 * Created by vonzhou on 16/3/31.
 * performer.perform();
 */
public class MainAround {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-around.xml");
        Performer performer = (Performer)context.getBean("eddie");
        performer.perform();
    }
}
