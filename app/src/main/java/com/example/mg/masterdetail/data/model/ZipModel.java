package com.example.mg.masterdetail.data.model;

public class ZipModel {
    private Weather10daysModel weather10daysModel;
    private WeatherModel weatherModel;

    public ZipModel(WeatherModel weatherModel, Weather10daysModel weather10daysModel) {
        this.weather10daysModel = weather10daysModel;
        this.weatherModel = weatherModel;
    }

    public WeatherModel getWeatherModel() {
        return weatherModel;
    }

    public Weather10daysModel getWeather10daysModel() {
        return weather10daysModel;
    }
}
