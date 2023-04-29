package com.pyruz.observer;

import com.pyruz.observer.impl.Display;
import com.pyruz.observer.model.WeatherData;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Display display = new Display();

        weatherData.addObserver(display);

        weatherData.setMeasurements(75, 30, 50);
        weatherData.setMeasurements(80, 32, 60);
        weatherData.setMeasurements(70, 28, 40);
    }
}
