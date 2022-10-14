package com.fatihyilmaz.store;

import com.fatihyilmaz.pizza.Pizza;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
