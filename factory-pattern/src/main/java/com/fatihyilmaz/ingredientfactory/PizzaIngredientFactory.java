package com.fatihyilmaz.ingredientfactory;

import com.fatihyilmaz.ingredients.cheese.Cheese;
import com.fatihyilmaz.ingredients.clams.Clams;
import com.fatihyilmaz.ingredients.dough.Dough;
import com.fatihyilmaz.ingredients.pepperoni.Pepperoni;
import com.fatihyilmaz.ingredients.sauce.Sauce;
import com.fatihyilmaz.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
