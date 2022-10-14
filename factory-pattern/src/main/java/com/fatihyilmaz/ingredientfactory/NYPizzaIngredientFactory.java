package com.fatihyilmaz.ingredientfactory;

import com.fatihyilmaz.ingredients.cheese.Cheese;
import com.fatihyilmaz.ingredients.cheese.ReggianoCheese;
import com.fatihyilmaz.ingredients.clams.Clams;
import com.fatihyilmaz.ingredients.clams.FreshClams;
import com.fatihyilmaz.ingredients.dough.Dough;
import com.fatihyilmaz.ingredients.dough.ThinCrustDough;
import com.fatihyilmaz.ingredients.pepperoni.Pepperoni;
import com.fatihyilmaz.ingredients.pepperoni.SlicedPepperoni;
import com.fatihyilmaz.ingredients.sauce.MarinaraSauce;
import com.fatihyilmaz.ingredients.sauce.Sauce;
import com.fatihyilmaz.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
