package org.rkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBased {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(AnnoBean.class);
        AnnoDemo annoDemo =(AnnoDemo)app.getBean("one");
        System.out.println(annoDemo.getDetails());
    }
}
