package com.example.mg.masterdetail.data

import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface IWeatherClient {

    companion object {
        const val BASE_URL = "https://api.weatherbit.io/"
        const val KEY = "e802a22d8af64f098c9df4144aa467d1"
        const val CITY = "cairo"
    }

    @Headers("Accept: application/json", "Cache-Control: max-age=640000")
    @GET("v2.0/current")
    suspend fun weatherForCity(@Query("city") country: String,
                               @Query("key") key: String): Response<WeatherModel>

    @Headers("Accept: application/json", "Cache-Control: max-age=640000")
    @GET("v2.0/forecast/daily")
    suspend fun weatherDaysForCity(@Query("city") country: String,
                                   @Query("key") key: String): Response<WeatherDaysModel>

}