package org.rkm.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class StockMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StockJdbcTemplete studentJDBCTemplate =
                (StockJdbcTemplete) context.getBean("studentJDBCTemplate");
        System.out.println("------Records Creation--------");
        //studentJDBCTemplate.create(100, "ITPL",20,100,5,new Date());
        //studentJDBCTemplate.listStudents();
        studentJDBCTemplate.getStudent(12);
    }
}
