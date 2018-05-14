package com.example.mg.masterdetail.receiver;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.mg.masterdetail.model.Weather10daysModel;
import com.example.mg.masterdetail.model.WeatherModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.lang.Thread.sleep;

public class WeatherInteractor implements LoadItemsInteractor {
    private static final String TAG = "WeatherInteractor";
    private static WeatherModel mWeatherModel;
    private static Weather10daysModel mWeather10DaysModel;

    public WeatherInteractor() {

        weather10DaysData();
        weatherCityData();
    }

    @Override
    public void findItems(final OnFinishedListener listener) {

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(mWeather10DaysModel, mWeatherModel);
            }
        }, 1200);
    }


    private void weatherCityData() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(WeatherClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        WeatherClient client = retrofit.create(WeatherClient.class);

        Call<WeatherModel> call = client.weatherForCity(
                WeatherClient.KEY,
                WeatherClient.country,
                WeatherClient.city);
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

    private void weather10DaysData() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(WeatherClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        WeatherClient client = retrofit.create(WeatherClient.class);

        Call<Weather10daysModel> call = client.weather10DaysForecast(
                WeatherClient.KEY,
                WeatherClient.country,
                WeatherClient.city);
        call.enqueue(new Callback<Weather10daysModel>() {
            @Override
            public void onResponse(Call<Weather10daysModel> call, Response<Weather10daysModel> response) {
                mWeather10DaysModel = response.body();
            }

            @Override
            public void onFailure(Call<Weather10daysModel> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }

}
