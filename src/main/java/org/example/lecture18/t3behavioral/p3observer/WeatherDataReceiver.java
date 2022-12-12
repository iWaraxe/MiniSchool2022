package org.example.lecture18.t3behavioral.p3observer;

public class WeatherDataReceiver implements Observer<WeatherData> {
    private WeatherData weatherData;
    @Override
    public void update(WeatherData data) {
        this.weatherData = data;
        System.out.println("WeatherData has been updated: " + weatherData);
    }
}
