package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

public interface ILoadItemsInteractor {

    void weatherCityData();

    void weather10DaysData();

    interface OnFinishedListener {
        void onFinishedWeather(WeatherModel dayModel);

        void onFinishedWeatherTenDays(Weather10daysModel tenDaysModel);


    }
}