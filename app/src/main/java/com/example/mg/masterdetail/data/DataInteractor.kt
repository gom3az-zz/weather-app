package com.example.mg.masterdetail.data

import android.util.Log
import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Response
import java.io.IOException

class DataInteractor : ILoadItemsInteractor, KoinComponent {

    private val mRetrofitClient: IWeatherClient by inject()

    override suspend fun weatherCityData(): WeatherModel? {
        return safeApiCall(mRetrofitClient.weatherForCity(IWeatherClient.CITY, IWeatherClient.KEY))
    }

    override suspend fun weatherDaysData(): WeatherDaysModel? {
        return safeApiCall(mRetrofitClient.weatherDaysForCity(IWeatherClient.CITY, IWeatherClient.KEY))
    }

    private fun <T : Any> safeApiCall(call: Response<T>): T? {

        val result: Result<T> = safeApiResult(call)
        var data: T? = null

        when (result) {
            is Result.Success ->
                data = result.data
            is Result.Error -> {
                Log.d("1.DataRepository", " & Exception - ${result.exception}")
            }
        }
        return data

    }

    private fun <T : Any> safeApiResult(call: Response<T>): Result<T> {
        if (call.isSuccessful) return Result.Success(call.body()!!)
        return Result.Error(IOException("Error Occurred during getting safe Api result, Custom ERROR "))
    }
}

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}