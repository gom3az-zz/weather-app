package com.example.mg.masterdetail.UI.DI;

import com.example.mg.masterdetail.DI.IAppComponent;
import com.example.mg.masterdetail.UI.WeatherFragment;

import dagger.Component;

@IFragScope
@Component(modules = FragmentModule.class, dependencies = IAppComponent.class)
public interface IFragComponent {

    void inject(WeatherFragment fragment);

}
