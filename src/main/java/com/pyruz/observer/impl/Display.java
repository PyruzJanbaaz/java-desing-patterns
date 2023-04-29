package com.pyruz.observer.impl;

import com.pyruz.observer.intrface.Observer;

public class Display implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.print("Current temperature: " + temperature + ", ");
        System.out.print("Current pressure: " + pressure+ ", ");
        System.out.println("Current humidity: " + humidity);
    }
}