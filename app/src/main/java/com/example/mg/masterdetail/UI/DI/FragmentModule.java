package com.example.mg.masterdetail.UI.DI;

import com.example.mg.masterdetail.UI.WeatherFragment;

import dagger.Module;
import dagger.Provides;

@Module
public
class FragmentModule {
    private final WeatherFragment fragment;

    public FragmentModule(WeatherFragment fragment) {
        this.fragment = fragment;
    }

    @IFragScope
    @Provides
    public WeatherFragment providesContext() {
        return fragment;
    }
}
