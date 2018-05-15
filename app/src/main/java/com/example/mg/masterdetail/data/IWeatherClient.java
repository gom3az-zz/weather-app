package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IWeatherClient {
    String BASE_URL = "http://api.wunderground.com";
    String KEY = "24b6732692393b6b";
    String COUNTRY = "EG";
    String CITY = "Cairo";


    @GET("/api/{key}/conditions/q/{COUNTRY}/{CITY}.json")
    Call<WeatherModel> weatherForCity(@Path("key") String key,
                                      @Path("COUNTRY") String country,
                                      @Path("CITY") String city);

    @GET("/api/{key}/forecast10day/q/{COUNTRY}/{CITY}.json")
    Call<Weather10daysModel> weather10DaysForecast(@Path("key") String key,
                                                   @Path("COUNTRY") String country,
                                                   @Path("CITY") String city);
}
