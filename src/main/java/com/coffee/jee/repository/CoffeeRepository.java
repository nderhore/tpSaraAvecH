package com.coffee.jee.repository;

import com.coffee.jee.entity.Coffee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Coffee> getAllCoffee(){
        return new ArrayList<>(entityManager.createQuery("select c from Coffee c",Coffee.class).getResultList());
    }

    public Coffee getCoffeeById(String name){
        return entityManager.find(Coffee.class, name);
    }

    public Coffee save(Coffee Coffee) {
        //On verifie si l'objet n'est pas null
        if(Coffee != null) {
            entityManager.persist(Coffee);
        }
        return Coffee;
    }

    public Coffee update(Coffee Coffee) {
        return entityManager.merge(Coffee);
    }

    public void deleteById(String name) {
        Coffee leCoffee = this.getCoffeeById(name);
        entityManager.remove(leCoffee);
    }
}
