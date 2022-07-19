package com.fatihyilmaz.weather.subject;

import com.fatihyilmaz.weather.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
