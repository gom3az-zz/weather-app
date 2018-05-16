package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

public interface ILoadItemsInteractor {

    void weatherCityData();

    void weather10DaysData(final OnFinishedListener dayListPresenter);

    interface OnFinishedListener {
        void onFinished(Weather10daysModel tenDaysModel,
                        WeatherModel dayModel);
    }
}