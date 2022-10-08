package com.fatihyilmaz.beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();
}
