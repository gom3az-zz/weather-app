package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.UI.DI.IFragScope;
import com.example.mg.masterdetail.UI.IDayListContract;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@IFragScope
public class DataInteractor implements IDayListContract.IDataInteractor {
    private final String TAG = "DataInteractor";
    private final IWeatherClient mRetrofitClient;

    @Inject
    public DataInteractor(IWeatherClient client) {
        mRetrofitClient = client;
    }


    @Override
    public Single<WeatherModel> weatherCityData() {
        return mRetrofitClient.weatherForCity(mRetrofitClient.KEY,
                mRetrofitClient.COUNTRY,
                mRetrofitClient.CITY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Single<Weather10daysModel> weather10DaysData() {
        return mRetrofitClient.weather10DaysForecast(mRetrofitClient.KEY,
                mRetrofitClient.COUNTRY,
                mRetrofitClient.CITY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
