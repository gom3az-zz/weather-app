package com.example.mg.masterdetail.data

import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel

interface ILoadItemsInteractor {

    suspend fun weatherCityData(): Result<WeatherModel>

    suspend fun weatherDaysData(): Result<WeatherDaysModel>
}