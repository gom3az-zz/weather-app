package com.example.mg.masterdetail.data.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class WeatherViewModel extends ViewModel {
    private final MutableLiveData<WeatherModel> selectedArticle =
            new MutableLiveData<WeatherModel>();
    private LiveData<WeatherModel> articleList;

    public void setSelectedArticle(WeatherModel article) {
        selectedArticle.setValue(article);
    }

    public LiveData<WeatherModel> getArticleList() {
        return articleList;
    }

    public void loadWeather() {
    }
}

