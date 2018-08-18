package com.example.mg.masterdetail.UI;

import com.example.mg.masterdetail.UI.DI.IFragScope;
import com.example.mg.masterdetail.data.DataInteractor;
import com.example.mg.masterdetail.data.model.ZipModel;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;

@IFragScope
public class DayListPresenter implements IDayListContract.IPresenter {

    private final WeatherFragment mView;
    private final DataInteractor mDataInteractor;
    private CompositeDisposable compositeDisposable;

    @Inject
    public DayListPresenter(WeatherFragment view, DataInteractor interactor) {
        mView = view;
        mDataInteractor = interactor;
        compositeDisposable = new CompositeDisposable();
    }


    @Override
    public void onResume() {
        compositeDisposable.add(Single.zip(mDataInteractor.weatherCityData(),
                mDataInteractor.weather10DaysData(), ZipModel::new)
                .doOnSubscribe(__ -> mView.showLoading())
                .doFinally(mView::hideLoading)
                .subscribe(
                        zipModel -> {
                            mView.init(
                                    zipModel.getWeatherModel().getCurrent_observation());

                            mView.setupRecyclerView(
                                    zipModel.getWeather10daysModel()
                                            .getForecast().getSimpleforecast().getForecastday());
                        },
                        throwable -> mView.showNoInternet()));

    }

    @Override
    public void onDestroy() {
        compositeDisposable.clear();
    }
}
