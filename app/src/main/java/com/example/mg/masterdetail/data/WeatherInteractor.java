package com.example.mg.masterdetail.data;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.presenter.DayListPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherInteractor implements ILoadItemsInteractor {
    private static final String TAG = "WeatherInteractor";
    private static OnFinishedListener mListener;
    private static DayListPresenter mContext;


    // TODO: 5/17/2018 enhance network data fetchin
    public WeatherInteractor(DayListPresenter context) {
        WeatherInteractor.mContext = context;
        mListener = mContext;
        if (mContext.checkConnection()) {
            weather10DaysData();
            weatherCityData();
        }
    }

    @Override
    public void weatherCityData() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(IWeatherClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        IWeatherClient client = retrofit.create(IWeatherClient.class);

        Call<WeatherModel> call = client.weatherForCity(
                IWeatherClient.KEY,
                IWeatherClient.COUNTRY,
                IWeatherClient.CITY);
        call.enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(@NonNull Call<WeatherModel> call,
                                   @NonNull Response<WeatherModel> response) {
                mListener.onFinishedWeather(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<WeatherModel> call, @NonNull Throwable t) {
                Log.e(TAG, t.getMessage());

            }
        });
    }

    @Override
    public void weather10DaysData() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(IWeatherClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        IWeatherClient client = retrofit.create(IWeatherClient.class);

        Call<Weather10daysModel> call = client.weather10DaysForecast(
                IWeatherClient.KEY,
                IWeatherClient.COUNTRY,
                IWeatherClient.CITY);
        call.enqueue(new Callback<Weather10daysModel>() {
            @Override
            public void onResponse(@NonNull Call<Weather10daysModel> call, @NonNull Response<Weather10daysModel> response) {
                mListener.onFinishedWeatherTenDays(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<Weather10daysModel> call, @NonNull Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }
}
