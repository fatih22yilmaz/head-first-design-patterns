package com.fatihyilmaz.weather.observer;

import com.fatihyilmaz.weather.WeatherData;
import com.fatihyilmaz.weather.display.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity.");
    }
}
