package com.example.mg.masterdetail.data;

import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface IWeatherClient {
    String BASE_URL = "http://api.wunderground.com";
    String KEY = "24b6732692393b6b";
    String COUNTRY = "EG";
    String CITY = "Cairo";

    @Headers({
            "Accept: application/json",
            "Cache-Control: max-age=640000"
    })
    @GET("/api/{key}/conditions/q/{COUNTRY}/{CITY}.json")
    Single<WeatherModel> weatherForCity(@Path("key") String key,
                                        @Path("COUNTRY") String country,
                                        @Path("CITY") String city);

    @Headers({
            "Accept: application/json",
            "Cache-Control: max-age=640000"
    })
    @GET("/api/{key}/forecast10day/q/{COUNTRY}/{CITY}.json")
    Single<Weather10daysModel> weather10DaysForecast(@Path("key") String key,
                                                     @Path("COUNTRY") String country,
                                                     @Path("CITY") String city);
}
