package com.company;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionalDisplay currentConditionalDisplay = new CurrentConditionalDisplay(weatherData);

        weatherData.setMeasurements(80, 65,30.4f);
        weatherData.setMeasurements(80, 30,30.2f);
        weatherData.setMeasurements(20, 65,30.2f);
    }
}
