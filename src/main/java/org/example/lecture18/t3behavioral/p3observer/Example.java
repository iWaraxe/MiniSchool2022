package org.example.lecture18.t3behavioral.p3observer;

public class Example {
    public static void main(String[] args) {
        WeatherDataCenter weatherDataCenter = new WeatherDataCenter();
        WeatherDataReceiver weatherDataReceiver = new WeatherDataReceiver();
        weatherDataCenter.registerObserver(weatherDataReceiver);
        weatherDataCenter.registerObserver(new WeatherDataReceiver());

        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(29.3);
        weatherData.setPressure(760.4);

        weatherDataCenter.notifyObservers(weatherData);

        weatherDataCenter.removeObserver(weatherDataReceiver);


        weatherData.setTemperature(12.8);
        weatherData.setPressure(759.8);
        weatherDataCenter.notifyObservers(weatherData);

    }
}
