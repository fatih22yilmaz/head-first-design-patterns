package com.fatihyilmaz;

import com.fatihyilmaz.behavior.fly.FlyRocketPowered;
import com.fatihyilmaz.duck.Duck;
import com.fatihyilmaz.duck.MallardDuck;
import com.fatihyilmaz.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
