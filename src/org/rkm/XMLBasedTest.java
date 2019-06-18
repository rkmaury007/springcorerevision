package org.rkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class XMLBasedTest {
    public static void main(String[] args) {
        //ApplicationContext app = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mobile mb=(Mobile)app.getBean("mobile");
        System.out.println(mb.getName());
        System.out.println(mb.getProcessor().getProcName());
    }
}
