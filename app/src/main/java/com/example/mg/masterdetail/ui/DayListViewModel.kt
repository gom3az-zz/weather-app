package com.example.mg.masterdetail.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mg.masterdetail.data.DataInteractor
import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class DayListViewModel(private val dataInteractor: DataInteractor) : ViewModel() {

    private val _weatherObserver = MutableLiveData<WeatherModel>()
    val weatherObserver: LiveData<WeatherModel> = _weatherObserver

    private val _weatherDaysObserver = MutableLiveData<WeatherDaysModel>()
    val weatherDaysObserver: LiveData<WeatherDaysModel> = _weatherDaysObserver

    init {
        fetch()
    }

    private fun fetch() {
        CoroutineScope(IO).launch {
            var weatherDaysModel: WeatherDaysModel? = null
            var weatherModel: WeatherModel? = null

            runCatching {
                val weatherCityData = async { dataInteractor.weatherCityData() }
                val weatherData = async { dataInteractor.weatherDaysData() }

                weatherDaysModel = weatherData.await()
                weatherModel = weatherCityData.await()

            }.onSuccess {
                _weatherObserver.postValue(weatherModel)
                _weatherDaysObserver.postValue(weatherDaysModel)
            }.onFailure {
                _weatherObserver.postValue(weatherModel)
                _weatherDaysObserver.postValue(weatherDaysModel)
            }
        }
    }

}