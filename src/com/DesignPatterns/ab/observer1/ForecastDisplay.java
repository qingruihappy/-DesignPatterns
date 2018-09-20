package com.DesignPatterns.ab.observer1;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject subject;

    public ForecastDisplay(Subject weatherData) {
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
