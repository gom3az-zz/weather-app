package com.example.mg.masterdetail.screens.dayList.presenter;

import android.app.ProgressDialog;
import android.content.Context;

import com.example.mg.masterdetail.data.ILoadItemsInteractor;
import com.example.mg.masterdetail.data.WeatherInteractor;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.WeatherFragment;
import com.example.mg.masterdetail.screens.dayList.contract.IDayListContract;
import com.example.mg.masterdetail.util.DialogUtils;
import com.example.mg.masterdetail.util.NetworkHelper;

public class DayListPresenter implements IDayListContract.UserActions,
        ILoadItemsInteractor.OnFinishedListener {

    private final Context mContext;
    //private static final String TAG = "DayListPresenter";
    private WeatherFragment mView;
    private ProgressDialog progressDialog;

    public DayListPresenter(WeatherFragment view) {
        this.mContext = view.getActivity();
        this.mView = view;
        new WeatherInteractor(this);
    }

    @Override
    public boolean checkConnection() {
        boolean chk = false;
        if (NetworkHelper.getInstance().isNetworkAvailable(mContext)) {
            progressDialog = DialogUtils.showLoadingDialog(mContext);
            chk = true;
        } else {
            mView.showNoInternet();
        }
        return chk;
    }

    @Override
    public void onFinishedWeather(WeatherModel dayModel) {
        mView.init(dayModel.getCurrent_observation());

    }

    @Override
    public void onFinishedWeatherTenDays(Weather10daysModel tenDaysModel) {
        progressDialog.cancel();
        mView.setupRecyclerView(tenDaysModel.getForecast().getSimpleforecast().getForecastday());

    }

}
