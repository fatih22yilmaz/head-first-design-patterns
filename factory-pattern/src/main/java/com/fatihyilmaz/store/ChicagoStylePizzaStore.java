package com.fatihyilmaz.store;

import com.fatihyilmaz.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.fatihyilmaz.ingredientfactory.PizzaIngredientFactory;
import com.fatihyilmaz.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
