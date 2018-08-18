package com.example.mg.masterdetail.UI;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.UI.DI.DaggerIFragComponent;
import com.example.mg.masterdetail.UI.DI.FragmentModule;
import com.example.mg.masterdetail.WeatherApplication;
import com.example.mg.masterdetail.data.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.util.DialogUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class WeatherFragment extends Fragment implements IDayListContract.IView {

    @Inject
    RequestManager glide;
    @Inject
    WeatherDayRecyclerViewAdapter adapter;
    @Inject
    DayListPresenter presenter;
    @Inject
    DialogUtils dialog;
    private ProgressDialog progressDialog;

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
    @BindView(R.id.text_no_internet)
    TextView textNoInternet;
    @BindView(R.id.day_list)
    RecyclerView recyclerView;

    Unbinder unbinder;
    //private static final String TAG = "WeatherFragment";
    private static final String KEY_TODAY = "KEY_TODAY";
    private static final String KEY_TEN_DAY = "KEY_TEN_DAY";
    private WeatherModel.CurrentObservationBean mTodayData;
    private List<ForecastdayBeanX> mDaysData;

    public WeatherFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerIFragComponent.builder()
                .iAppComponent(WeatherApplication.get(getActivity()).getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build().inject(this);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        unbinder = ButterKnife.bind(this, view);

        recyclerView.addItemDecoration(new DividerItemDecoration(
                recyclerView.getContext(),
                DividerItemDecoration.HORIZONTAL));

        if (savedInstanceState != null) {
            mTodayData = savedInstanceState.getParcelable(KEY_TODAY);
            mDaysData = savedInstanceState.getParcelableArrayList(KEY_TEN_DAY);
            init(mTodayData);
            setupRecyclerView(mDaysData);
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
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
        recyclerView.setAdapter(null);
        unbinder.unbind();
        presenter.onDestroy();
    }

    @Override
    public void setupRecyclerView(@NonNull List<ForecastdayBeanX> daysData) {
        mDaysData = daysData;
        recyclerView.setAdapter(adapter);
        adapter.setData(daysData);

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

        glide.asGif()
                .load(mTodayData.getIcon_url())
                .into(imageWeatherCondition);
    }

    @Override
    public void showNoInternet() {
        textNoInternet.setVisibility(View.VISIBLE);

    }

    @Override
    public void showLoading() {
        progressDialog = dialog.showLoadingDialog();
        progressDialog.show();

    }

    @Override
    public void hideLoading() {
        progressDialog.dismiss();
    }
}
