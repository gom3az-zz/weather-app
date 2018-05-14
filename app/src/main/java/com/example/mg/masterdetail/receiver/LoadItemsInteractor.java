package com.example.mg.masterdetail.receiver;

import com.example.mg.masterdetail.model.Weather10daysModel;
import com.example.mg.masterdetail.model.WeatherModel;

public interface LoadItemsInteractor {

    interface OnFinishedListener {
        void onFinished(Weather10daysModel tenDaysModel,
                        WeatherModel dayModel);
    }

    void findItems(OnFinishedListener listener);
}