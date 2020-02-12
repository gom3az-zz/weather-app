package com.example.mg.masterdetail.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.mg.masterdetail.data.DataInteractor
import com.example.mg.masterdetail.data.Result
import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class DayListViewModel(private val dataInteractor: DataInteractor) : BaseViewModel() {

    private val _weatherObserver = MutableLiveData<WeatherModel>()
    val weatherObserver: LiveData<WeatherModel>
        get() = _weatherObserver

    private val _weatherDaysObserver = MutableLiveData<WeatherDaysModel>()
    val weatherDaysObserver: LiveData<WeatherDaysModel>
        get() = _weatherDaysObserver

    init {
        fetch()
    }

    private fun fetch() = viewModelScope.launch(handler) {

        val weatherDeferred = async {
            dataInteractor.weatherCityData()
        }
        val weatherDaysDeferred = async { dataInteractor.weatherDaysData() }

        when (val weatherCityData = weatherDeferred.await()) {
            is Result.Success -> _weatherObserver.value = weatherCityData.data
        }

        when (val weatherData = weatherDaysDeferred.await()) {
            is Result.Success -> _weatherDaysObserver.value = weatherData.data
        }
    }
}