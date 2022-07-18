package com.fatihyilmaz.duck;

import com.fatihyilmaz.behavior.fly.FlyWithWings;
import com.fatihyilmaz.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
