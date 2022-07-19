package com.fatihyilmaz.weather.observer;

import com.fatihyilmaz.weather.display.DisplayElement;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
