package com.example.mg.masterdetail.screens.dayList.presenter;

import com.example.mg.masterdetail.data.ILoadItemsInteractor;
import com.example.mg.masterdetail.data.WeatherInteractorI;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.contract.IDayListContract;
import com.example.mg.masterdetail.screens.dayList.dayListActivity;

public class DayListPresenter implements IDayListContract.UserActions, ILoadItemsInteractor.OnFinishedListener {

    private static final String TAG = "DayListPresenter";
    private dayListActivity view;
    private ILoadItemsInteractor mWeatherInteractor;

    public DayListPresenter(dayListActivity view) {
        assert this.view != null;
        this.view = view;
        mWeatherInteractor = new WeatherInteractorI();
        mWeatherInteractor.findItems(this);
        view.showProgress();
    }

    @Override
    public void onFinished(Weather10daysModel tenDaysModel, WeatherModel dayModel) {
        view.hideProgress();
        view.init(dayModel.getCurrent_observation());
        view.setupRecyclerView(tenDaysModel.getForecast().getSimpleforecast().getForecastday());
    }
}
