package com.fatihyilmaz.store;

import com.fatihyilmaz.ingredientfactory.CaliforniaPizzaIngredientFactory;
import com.fatihyilmaz.ingredientfactory.PizzaIngredientFactory;
import com.fatihyilmaz.pizza.*;

public class CaliforniaStylePizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("California Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
