package com.example.mg.masterdetail.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.mg.masterdetail.data.DataInteractor
import com.example.mg.masterdetail.data.Result
import com.example.mg.masterdetail.data.model.WeatherDaysModel
import com.example.mg.masterdetail.data.model.WeatherModel
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

    private fun fetch() {
        viewModelScope.launch(handler) {

            when (val weatherData = dataInteractor.weatherDaysData()) {
                is Result.Success -> {
                    _weatherDaysObserver.value = weatherData.data
                }
            }

            when (val weatherCityData = dataInteractor.weatherCityData()) {
                is Result.Success -> {
                    _weatherObserver.value = weatherCityData.data
                }
            }
        }
    }

}