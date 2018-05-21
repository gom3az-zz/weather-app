package com.example.mg.masterdetail.screens.dayList.presenter;

import com.example.mg.masterdetail.data.ILoadItemsInteractor;
import com.example.mg.masterdetail.data.WeatherInteractor;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.WeatherFragment;
import com.example.mg.masterdetail.screens.dayList.contract.IDayListContract;
import com.example.mg.masterdetail.util.NetworkHelper;

public class DayListPresenter implements IDayListContract.UserActions,
        ILoadItemsInteractor.OnFinishedListener {

    //private static final String TAG = "DayListPresenter";
    private WeatherFragment view;
    private WeatherInteractor mWeatherInteractor;

    public DayListPresenter(WeatherFragment view) {
        assert this.view != null;
        this.view = view;
        mWeatherInteractor = new WeatherInteractor(this);
    }

    @Override
    public boolean checkConnection() {
        boolean check;
        if (NetworkHelper.getInstance().isNetworkAvailable(view.getActivity())) {
            view.showProgress();
            check = true;
        } else {
            view.hideProgress();
            view.showNoInternet();
            check = false;
        }
        return check;
    }

    @Override
    public void onFinishedWeather(WeatherModel dayModel) {
        view.init(dayModel.getCurrent_observation());

    }

    @Override
    public void onFinishedWeatherTenDays(Weather10daysModel tenDaysModel) {
        view.hideProgress();
        view.setupRecyclerView(tenDaysModel.getForecast().getSimpleforecast().getForecastday());

    }
}
