package org.rkm.database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class StockMapper implements RowMapper<Stock> {
    @Override
    public Stock mapRow(ResultSet resultSet, int i) throws SQLException {
        Stock stock = new Stock();
        stock.setId(100);
        stock.setName("SAP");
        stock.setNow(new Date());
        stock.setNumOfStock(10);
        stock.setStockPrice(200);
        stock.setTotalValue(2000);
        return stock;
    }
}
