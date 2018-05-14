package com.example.mg.masterdetail.receiver;

import com.example.mg.masterdetail.model.Weather10daysModel;
import com.example.mg.masterdetail.model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherClient {
    String BASE_URL = "http://api.wunderground.com";
    String KEY = "24b6732692393b6b";
    String country = "EG";
    String city = "Cairo";


    @GET("/api/{key}/conditions/q/{country}/{city}.json")
    Call<WeatherModel> weatherForCity(@Path("key") String key,
                                      @Path("country") String country,
                                      @Path("city") String city);

    @GET("/api/{key}/forecast10day/q/{country}/{city}.json")
    Call<Weather10daysModel> weather10DaysForecast(@Path("key") String key,
                                                   @Path("country") String country,
                                                   @Path("city") String city);
}
