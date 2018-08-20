package com.example.mg.masterdetail.UI;

import android.support.annotation.NonNull;

import com.example.mg.masterdetail.data.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.data.model.WeatherModel;

import java.util.List;

public interface IDayListContract {
    interface IView {
        void setupRecyclerView(@NonNull List<ForecastdayBeanX> forecastDay);

        void init(@NonNull WeatherModel.CurrentObservationBean model);

        void showNoInternet();

        void showLoading();

        void hideLoading();


    }

    interface IPresenter {

        void onResume();

        void onDestroy();
    }
}
