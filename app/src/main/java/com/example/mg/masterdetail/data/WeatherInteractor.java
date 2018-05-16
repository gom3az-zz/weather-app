package com.example.mg.masterdetail.data;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherInteractor implements ILoadItemsInteractor {
    private static final String TAG = "WeatherInteractor";
    private static WeatherModel mWeatherModel;
    private static Weather10daysModel mWeather10DaysModel;
    private static WeatherInteractor weatherInteractor;

    private WeatherInteractor() {
        weatherCityData();
    }

    public static synchronized WeatherInteractor getInstance() {
        if (weatherInteractor == null) {
            weatherInteractor = new WeatherInteractor();
        }
        return weatherInteractor;
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
                mWeatherModel = response.body();
            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                Log.e(TAG, t.getMessage());

            }
        });
    }

    @Override
    public void weather10DaysData(final OnFinishedListener listener) {
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
            public void onResponse(Call<Weather10daysModel> call, Response<Weather10daysModel> response) {
                mWeather10DaysModel = response.body();
                try {
                    if (mWeatherModel == null) Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                listener.onFinished(mWeather10DaysModel, mWeatherModel);
            }

            @Override
            public void onFailure(Call<Weather10daysModel> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }
}
