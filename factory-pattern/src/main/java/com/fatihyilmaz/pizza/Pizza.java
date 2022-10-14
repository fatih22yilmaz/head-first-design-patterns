package com.fatihyilmaz.pizza;

import com.fatihyilmaz.ingredients.cheese.Cheese;
import com.fatihyilmaz.ingredients.clams.Clams;
import com.fatihyilmaz.ingredients.dough.Dough;
import com.fatihyilmaz.ingredients.pepperoni.Pepperoni;
import com.fatihyilmaz.ingredients.sauce.Sauce;
import com.fatihyilmaz.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
