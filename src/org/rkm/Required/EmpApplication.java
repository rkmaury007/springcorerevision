package org.rkm.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApplication {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpBean e1=(EmpBean)ap.getBean("emp");
        System.out.println(e1.getDesignation());
    }
}
