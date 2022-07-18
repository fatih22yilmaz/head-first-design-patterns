package com.fatihyilmaz.duck;

import com.fatihyilmaz.behavior.fly.FlyNoWay;
import com.fatihyilmaz.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a modle duck");
    }
}
