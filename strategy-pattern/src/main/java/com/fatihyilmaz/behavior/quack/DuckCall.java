package com.fatihyilmaz.behavior.quack;

public class DuckCall implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack(just mimic'ing the duck sound)");
    }
}
