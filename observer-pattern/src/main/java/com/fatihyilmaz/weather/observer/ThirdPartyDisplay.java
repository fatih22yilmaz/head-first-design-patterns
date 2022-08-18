package com.fatihyilmaz.weather.observer;

import com.fatihyilmaz.weather.WeatherData;
import com.fatihyilmaz.weather.display.DisplayElement;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}
