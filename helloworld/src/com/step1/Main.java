package com.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        helloWorld obj = (helloWorld) context.getBean("helloworld");
        obj.getMessage();
    }
}
