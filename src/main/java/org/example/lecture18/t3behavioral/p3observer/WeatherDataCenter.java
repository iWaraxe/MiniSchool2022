package org.example.lecture18.t3behavioral.p3observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataCenter implements Observable<WeatherData> {
    private List<Observer<WeatherData>> observers = new ArrayList<>();
    private WeatherData weatherData;

    @Override
    public void notifyObservers(WeatherData weatherData) {
        this.weatherData = weatherData;
        for(Observer observer : this.observers) {
            observer.update(weatherData);
        }
    }

    @Override
    public void registerObserver(Observer<WeatherData> observer) {this.observers.add(observer);}

    @Override
    public void removeObserver(Observer<WeatherData> observer){this.observers.remove(observer);}
}
