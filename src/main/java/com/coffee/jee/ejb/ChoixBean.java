package com.coffee.jee.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.coffee.jee.entity.Coffee;
import com.coffee.jee.repository.CoffeeRepository;

@Stateless
public class ChoixBean {

    @Inject
    CoffeeRepository coffeeRepository;

    public List<Coffee> getCoffees() {
        return coffeeRepository.getAllCoffee();
    }

    public void addCoffee(Coffee c) {
        coffeeRepository.save(c);
    }

    public Coffee getCoffeeById(String name){
        return coffeeRepository.getCoffeeById(name);
    }

    public void deleteCoffeeByName(String name) {
        coffeeRepository.deleteById(name);
    }

    public void updatePrice(Coffee coffee) {
        coffeeRepository.update(coffee);
    }

}
