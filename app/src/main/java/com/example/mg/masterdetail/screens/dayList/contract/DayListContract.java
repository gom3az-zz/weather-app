package com.example.mg.masterdetail.screens.dayList.contract;

import android.support.annotation.NonNull;

import com.example.mg.masterdetail.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.model.WeatherModel;

import java.util.List;

public interface DayListContract {
    interface View {
        void setupRecyclerView(@NonNull List<ForecastdayBeanX> forecastDay);
        void init(@NonNull WeatherModel.CurrentObservationBean model);
        void showProgress();
        void hideProgress();
    }

    interface UserActions {
        void onResume();
        void onDestroy();

    }
}
