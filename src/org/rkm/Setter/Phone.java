package org.rkm.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        PhoneBean pb = (PhoneBean)ap.getBean("phone");
        //pb.getDetails();
        ((ClassPathXmlApplicationContext) ap).close();
    }
}
