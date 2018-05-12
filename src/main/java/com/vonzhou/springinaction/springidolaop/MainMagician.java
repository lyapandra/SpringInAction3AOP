package com.vonzhou.springinaction.springidolaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * P99  sneaky : 卑鄙的
 * Created by vonzhou on 16/3/31.
 */
public class MainMagician {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("sneaky-magician.xml");
//        Volunteer volunteer = (Volunteer) context.getBean("volunteer");
        Thinker volunteer = (Thinker)context.getBean("volunteer");
        volunteer.thinkOfSomething("I want to play basketball, en");
//        System.out.println(volunteer.getThoughts());

    }
}
