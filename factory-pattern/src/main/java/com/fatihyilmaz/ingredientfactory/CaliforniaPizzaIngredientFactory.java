package com.fatihyilmaz.ingredientfactory;

import com.fatihyilmaz.ingredients.cheese.Cheese;
import com.fatihyilmaz.ingredients.clams.Clams;
import com.fatihyilmaz.ingredients.clams.FrozenClams;
import com.fatihyilmaz.ingredients.dough.Dough;
import com.fatihyilmaz.ingredients.pepperoni.Pepperoni;
import com.fatihyilmaz.ingredients.sauce.Sauce;
import com.fatihyilmaz.ingredients.veggies.Veggies;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
