package com.fatihyilmaz.beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        Double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                return cost + .10;
            case GRANDE:
                return cost + .15;
            case VENTI:
                return cost + .29;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
