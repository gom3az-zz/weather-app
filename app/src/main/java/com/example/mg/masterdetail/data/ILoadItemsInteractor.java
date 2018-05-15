package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

public interface ILoadItemsInteractor {

    void findItems(OnFinishedListener listener);

    interface OnFinishedListener {
        void onFinished(Weather10daysModel tenDaysModel,
                        WeatherModel dayModel);
    }
}