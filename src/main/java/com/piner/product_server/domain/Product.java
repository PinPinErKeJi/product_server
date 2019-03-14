package com.piner.product_server.domain;

public class Product {
    private int id;
    //商品名称
    private String name;
    //价格
    private int price;
    //库存
    private int stare;
    public Product(){}
    public Product(int id, String name, int price, int stare) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stare = stare;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stare=" + stare +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStare() {
        return stare;
    }

    public void setStare(int stare) {
        this.stare = stare;
    }
}
