package com.example.mg.masterdetail.UI;

import com.example.mg.masterdetail.UI.DI.IFragScope;
import com.example.mg.masterdetail.data.DataInteractor;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;

@IFragScope
public class DayListPresenter implements IDayListContract.IPresenter {

    private final WeatherFragment mView;
    private final DataInteractor mDataInteractor;
    private CompositeDisposable compositeDisposable;

    @Inject
    DayListPresenter(WeatherFragment view, DataInteractor interactor) {
        mView = view;
        mDataInteractor = interactor;
        compositeDisposable = new CompositeDisposable();
    }


    @Override
    public void onResume() {
        Single<WeatherModel> weatherModelSingle = mDataInteractor.weatherCityData();
        Single<Weather10daysModel> weather10daysModelSingle = mDataInteractor.weather10DaysData();


        compositeDisposable.add(weatherModelSingle.doOnSubscribe(__ -> mView.showLoading())
                .doOnSuccess(weatherModel -> mView.init(weatherModel.getCurrent_observation()))
                .flatMap(__ -> weather10daysModelSingle)
                .doOnSuccess(weather10daysModel ->
                        mView.setupRecyclerView(weather10daysModel.getForecast()
                                .getSimpleforecast().getForecastday()))
                .doFinally(mView::hideLoading)
                .subscribe(__ -> {
                        }, throwable -> mView.showNoInternet()
                ));


    }

    @Override
    public void onDestroy() {
        compositeDisposable.clear();
    }
}
