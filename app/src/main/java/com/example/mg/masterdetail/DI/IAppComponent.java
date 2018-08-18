package com.example.mg.masterdetail.DI;

import com.bumptech.glide.RequestManager;
import com.example.mg.masterdetail.DI.Modules.AppModule;
import com.example.mg.masterdetail.DI.Modules.NetworkModule;
import com.example.mg.masterdetail.WeatherApplication;
import com.example.mg.masterdetail.data.IWeatherClient;

import dagger.Component;

@IAppScope
@Component(modules = {AppModule.class, NetworkModule.class})
public interface IAppComponent {

    void inject(WeatherApplication application);

    RequestManager glide();

    IWeatherClient retrofitWeatherClient();
}
