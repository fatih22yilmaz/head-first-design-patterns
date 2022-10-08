package com.fatihyilmaz.beverage;

public abstract class Beverage {
    public enum Size {
        TALL, GRANDE, VENTI
    }

    Size size = Size.TALL;

    String description = "Unkown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract Double cost();

    public String getDescription() {
        return description;
    }
}

