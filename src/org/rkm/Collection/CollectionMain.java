package org.rkm.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean)applicationContext.getBean("collection");
        System.out.println(collectionBean.getEmpList());
        System.out.println(collectionBean.getEmpSet());
        System.out.println(collectionBean.getEmpMap());
    }
}
