package com.fatihyilmaz.weather;

import com.fatihyilmaz.weather.observer.Observer;
import com.fatihyilmaz.weather.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(getTemperature(), getHumidity(), getPressure()));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private float getTemperature() {
        return this.temperature;
    }

    private float getHumidity() {
        return this.humidity;
    }

    private float getPressure() {
        return this.pressure;
    }
}
