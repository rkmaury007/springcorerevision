package org.rkm.database;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

public class StockJdbcTemplete {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(int id,String name,float stockPrice,double totalValue,int numOfStock,Date now) {
        String SQL = "insert into Stock (id, name,stockPrice,totalValue,numOfStock,now) values (?,?,?,?,?,?)";
        jdbcTemplateObject.update( SQL, id,name,stockPrice,totalValue,numOfStock,now);
        System.out.println("Created Record Name = " + name + " id = " + id);
        return;
    }
    public List<Stock> listStudents() {
        String SQL = "select * from Stock";
        List<Stock> students = jdbcTemplateObject.query(SQL, new StockMapper());
        return students;
    }
    public Stock getStudent(Integer id) {
        String SQL = "select * from Stock where id = ?";
        Stock student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StockMapper());
        return student;
    }
}
