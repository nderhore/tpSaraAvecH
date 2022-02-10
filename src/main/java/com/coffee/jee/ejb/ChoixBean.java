package com.coffee.jee.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import com.coffee.jee.model.Coffee;

@Stateless
public class ChoixBean {

    static List<Coffee> coffees = new ArrayList<>();

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void addCoffee(com.coffee.jee.model.Coffee c) {
        coffees.add(c);
    }

    public void deleteCoffeeByName(String name) {
        List<Coffee> tempList = new ArrayList<>();
        for (var coff : coffees) {
            if (!coff.getName().equals(name)) {
                tempList.add(coff);
            }
        }
        coffees = tempList;
    }

    public void updatePrice(Coffee coffee) {
        var name = coffee.getName();
        var prix = coffee.getPrice();
        List<Coffee> tempList = new ArrayList<>();
        for (var cof : coffees) {
            if (cof.getName().equals(name)) {
                cof.setPrice(prix + 1);
            }
            tempList.add(cof);
        }
        coffees.clear();
        coffees.addAll(tempList);
    }

}
