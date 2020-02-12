package com.example.mg.masterdetail.data

import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Response

class DataInteractor : ILoadItemsInteractor, KoinComponent {

    private val mRetrofitClient: IWeatherClient by inject()

    override suspend fun weatherCityData(): Result<WeatherModel> {
        return withContext(Dispatchers.IO) {
            safeApiResult(mRetrofitClient.weatherForCity(IWeatherClient.CITY, IWeatherClient.KEY))
        }
    }

    override suspend fun weatherDaysData(): Result<WeatherDaysModel> {
        return withContext(Dispatchers.IO) {
            safeApiResult(mRetrofitClient.weatherDaysForCity(IWeatherClient.CITY, IWeatherClient.KEY))
        }
    }

    private fun <T> safeApiResult(call: Response<T>): Result<T> {
        if (call.isSuccessful) return Result.Success(call.body())

        when (call.code()) {
            500 -> throw Failure.ServerException
            400 -> throw Failure.InvalidUser
            else -> return Result.Error.ServerError(call.errorBody())
        }
    }
}

sealed class Result<out T> {
    data class Success<T>(val data: T?) : Result<T>()

    sealed class Error : Result<Nothing>() {
        data class ServerError(val errorBody: ResponseBody?) : Error()
        object InvalidUser : Error()
        object NetworkError : Error()
    }
}

sealed class Failure {
    object ServerException : Exception()
    object InvalidUser : Exception()
}