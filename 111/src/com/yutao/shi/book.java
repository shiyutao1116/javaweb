package com.yutao.shi;

import java.math.BigDecimal;

/**
 * @author shiyutao
 * @create 2021-10-08 12:19
 */
public class book {
    private  String sn;
    private  String name;
    private Double price;
    private  String author;

    public book(String sn, double v, String author, String nameText) {
    }

    public book(String sn, String name, Double price, String author) {
        this.sn = sn;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
