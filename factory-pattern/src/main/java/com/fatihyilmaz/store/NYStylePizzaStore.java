package com.fatihyilmaz.store;

import com.fatihyilmaz.ingredientfactory.NYPizzaIngredientFactory;
import com.fatihyilmaz.ingredientfactory.PizzaIngredientFactory;
import com.fatihyilmaz.pizza.*;

public class NYStylePizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
