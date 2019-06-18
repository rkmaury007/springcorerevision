package org.rkm.database;

import java.util.Date;

public class Stock {
    private int id;
    private String name;
    private float stockPrice;
    private double totalValue;
    private int numOfStock;
    private Date now;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public int getNumOfStock() {
        return numOfStock;
    }

    public void setNumOfStock(int numOfStock) {
        this.numOfStock = numOfStock;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }
}