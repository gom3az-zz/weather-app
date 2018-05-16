package com.example.mg.masterdetail.screens.dayList.contract;

import android.support.annotation.NonNull;

import com.example.mg.masterdetail.data.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.data.model.WeatherModel;

import java.util.List;

public interface IDayListContract {
    interface View {
        void setupRecyclerView(@NonNull List<ForecastdayBeanX> forecastDay);

        void init(@NonNull WeatherModel.CurrentObservationBean model);

        void showProgress();

        void hideProgress();

        void showNoInternet();
    }

    interface UserActions {
        void fetchData();

    }
}
