package com.example.mg.masterdetail.screens.dayList;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.data.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.contract.IDayListContract;
import com.example.mg.masterdetail.screens.dayList.presenter.DayListPresenter;
import com.example.mg.masterdetail.util.WeatherDayRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherFragment extends Fragment implements IDayListContract.View {


    @BindView(R.id.text_city_name)
    TextView textCityName;
    @BindView(R.id.text_weather_condition)
    TextView textWeatherCondition;
    @BindView(R.id.image_weather_condition)
    ImageView imageWeatherCondition;
    @BindView(R.id.text_weather_temp)
    TextView textWeatherTemp;
    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.text_conditon)
    TextView textCondition;
    @BindView(R.id.text_wind)
    TextView textWind;
    @BindView(R.id.text_humidity)
    TextView textHumidity;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    @BindView(R.id.frameLayout)
    LinearLayout frameLayout;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.text_no_internet)
    TextView textNoInternet;
    @BindView(R.id.day_list)
    RecyclerView recyclerView;

    Unbinder unbinder;

    private static final String KEY_TODAY = "TODAY";
    private static final String KEY_TEN_DAY = "KEY_TEN_DAY";
    private DayListPresenter mDayListPresenter;
    private WeatherModel.CurrentObservationBean mTodayData;
    private List<ForecastdayBeanX> mDaysData;

    public WeatherFragment() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.setRetainInstance(true);
        if (savedInstanceState != null) {
            mTodayData = savedInstanceState.getParcelable(KEY_TODAY);
            mDaysData = savedInstanceState.getParcelableArrayList(KEY_TEN_DAY);
        }

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        unbinder = ButterKnife.bind(this, view);
        mDayListPresenter = new DayListPresenter(this);
        if (savedInstanceState != null) {
            init(mTodayData);
            setupRecyclerView(mDaysData);
        }
        return view;
    }

    @Override
    public void setupRecyclerView(@NonNull List<ForecastdayBeanX> daysData) {
        mDaysData = daysData;
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(
                Objects.requireNonNull(getContext()),
                DividerItemDecoration.HORIZONTAL));
        recyclerView.setAdapter(new WeatherDayRecyclerViewAdapter(mDaysData));
    }

    @Override
    public void init(@NonNull WeatherModel.CurrentObservationBean todayData) {
        mTodayData = todayData;
        textCityName.setText(mTodayData.getDisplay_location().getFull());
        textWeatherCondition.setText(mTodayData.getIcon());
        textWeatherTemp.setText(mTodayData.getTemperature_string());

        textCondition.setText(String.format("condition\n%s", mTodayData.getIcon()));
        textWind.setText(String.format("wind speed\n%s kph", String.valueOf(mTodayData.getWind_kph())));
        textHumidity.setText(String.format("humidity\n%s", mTodayData.getRelative_humidity()));

        Glide.with(this)
                .asGif()
                .load(mTodayData.getIcon_url())
                .into(imageWeatherCondition);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showNoInternet() {
        textNoInternet.setVisibility(View.VISIBLE);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_TODAY, mTodayData);
        outState.putParcelableArrayList(KEY_TEN_DAY, (ArrayList<? extends Parcelable>) mDaysData);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
