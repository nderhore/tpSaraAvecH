package com.coffee.jee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee {

    @Id
    private String name;

    private Double price;

    public Coffee() {
    }

    public Coffee(String name, Double price) {
        this.name = name;
        this.price = price;
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

}
