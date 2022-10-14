package com.fatihyilmaz.ingredientfactory;

import com.fatihyilmaz.ingredients.cheese.Cheese;
import com.fatihyilmaz.ingredients.cheese.MozarellaCheese;
import com.fatihyilmaz.ingredients.clams.Clams;
import com.fatihyilmaz.ingredients.clams.FrozenClams;
import com.fatihyilmaz.ingredients.dough.Dough;
import com.fatihyilmaz.ingredients.dough.ThickCrustDough;
import com.fatihyilmaz.ingredients.pepperoni.Pepperoni;
import com.fatihyilmaz.ingredients.pepperoni.SlicedPepperoni;
import com.fatihyilmaz.ingredients.sauce.PlumTomatoSauce;
import com.fatihyilmaz.ingredients.sauce.Sauce;
import com.fatihyilmaz.ingredients.veggies.BlackOlives;
import com.fatihyilmaz.ingredients.veggies.Eggplant;
import com.fatihyilmaz.ingredients.veggies.Spinach;
import com.fatihyilmaz.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
