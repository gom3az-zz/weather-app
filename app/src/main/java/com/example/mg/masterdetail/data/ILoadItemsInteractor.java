package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import io.reactivex.Single;

public interface ILoadItemsInteractor {
    Single<WeatherModel> weatherCityData();

    Single<Weather10daysModel> weather10DaysData();

}