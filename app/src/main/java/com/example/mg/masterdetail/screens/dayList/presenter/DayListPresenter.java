package com.example.mg.masterdetail.screens.dayList.presenter;

import com.example.mg.masterdetail.model.Weather10daysModel;
import com.example.mg.masterdetail.model.WeatherModel;
import com.example.mg.masterdetail.receiver.LoadItemsInteractor;
import com.example.mg.masterdetail.receiver.WeatherInteractor;
import com.example.mg.masterdetail.screens.dayList.contract.DayListContract;
import com.example.mg.masterdetail.screens.dayList.dayListActivity;

public class DayListPresenter implements DayListContract.UserActions, LoadItemsInteractor.OnFinishedListener {

    private dayListActivity view;
    private LoadItemsInteractor mWeatherInteractor;
    private static final String TAG = "DayListPresenter";

    public DayListPresenter(dayListActivity view) {
        assert this.view != null;
        this.view = view;
        mWeatherInteractor = new WeatherInteractor();
        mWeatherInteractor.findItems(this);
        view.showProgress();
    }

    @Override
    public void onFinished(Weather10daysModel tenDaysModel, WeatherModel dayModel) {
        view.hideProgress();
        view.init(dayModel.getCurrent_observation());
        view.setupRecyclerView(tenDaysModel.getForecast().getSimpleforecast().getForecastday());
    }

    @Override
    public void onResume() {
        assert view != null;
    }

    @Override
    public void onDestroy() {
        view = null;
    }
}
