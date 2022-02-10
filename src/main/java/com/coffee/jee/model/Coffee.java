package com.coffee.jee.model;

public class Coffee {
    private String name;
    private Integer price;

    public Coffee() {
    }

    public Coffee(String name, Integer price) {
        this.name = name;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
