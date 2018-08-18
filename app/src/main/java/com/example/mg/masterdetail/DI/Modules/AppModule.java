package com.example.mg.masterdetail.DI.Modules;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.mg.masterdetail.DI.IAppContext;
import com.example.mg.masterdetail.DI.IAppScope;
import com.example.mg.masterdetail.WeatherApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final WeatherApplication application;

    public AppModule(WeatherApplication application) {
        this.application = application;
    }

    @IAppScope
    @IAppContext
    @Provides
    public Context providesAppContext() {
        return application;
    }

    @IAppScope
    @Provides
    public RequestManager providesGlide() {
        return Glide.with(application);
    }


}
