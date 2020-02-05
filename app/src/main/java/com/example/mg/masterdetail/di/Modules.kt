package com.example.mg.masterdetail.di

import com.bumptech.glide.Glide
import com.example.mg.masterdetail.data.DataInteractor
import com.example.mg.masterdetail.data.IWeatherClient
import com.example.mg.masterdetail.data.WeatherService.Companion.provideCache
import com.example.mg.masterdetail.data.WeatherService.Companion.provideCacheFile
import com.example.mg.masterdetail.data.WeatherService.Companion.provideLoggingInterceptor
import com.example.mg.masterdetail.data.WeatherService.Companion.provideOkHttpClient
import com.example.mg.masterdetail.data.WeatherService.Companion.provideRetrofit
import com.example.mg.masterdetail.ui.DayListViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit


val dayViewModelModule = module {
    single { DataInteractor() }
    viewModel { DayListViewModel(get()) }
}

val appModule = module {
    single { Glide.with(androidContext()) }
}


val networkModule = module {
    single {
        provideLoggingInterceptor()
    }

    single(named(WEATHER_MODEL)) {
        provideRetrofit(get())
    }
    single {
        provideCache(get())
    }
    single {
        provideCacheFile(get())
    }
    single {
        provideOkHttpClient(get(), get())
    }

    single {
        get<Retrofit>(named(WEATHER_MODEL)).create(IWeatherClient::class.java)
    }
}

private const val WEATHER_MODEL = "weather"
