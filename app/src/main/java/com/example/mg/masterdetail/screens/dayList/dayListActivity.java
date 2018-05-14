package com.example.mg.masterdetail.screens.dayList;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.RecycleViewAdapter.SimpleItemRecyclerViewAdapter;
import com.example.mg.masterdetail.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayDetail.dayDetailActivity;
import com.example.mg.masterdetail.screens.dayList.contract.DayListContract;
import com.example.mg.masterdetail.screens.dayList.presenter.DayListPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * An activity representing a list of days. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link dayDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class dayListActivity extends AppCompatActivity implements DayListContract.View {

    @BindView(R.id.text_city_name)
    TextView textCityName;
    @BindView(R.id.text_weather_condition)
    TextView textWeatherCondition;
    @BindView(R.id.image_weather_condition)
    ImageView imageWeatherCondition;
    @BindView(R.id.text_weather_temp)
    TextView textWeatherTemp;
    @BindView(R.id.text_conditon)
    TextView textCondition;
    @BindView(R.id.text_wind)
    TextView textWind;
    @BindView(R.id.text_humidity)
    TextView textHumidity;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;


    private DayListPresenter mDayListPresenter;
    private static final String TAG = "dayListActivity";
    @BindView(R.id.day_list)
    public
    RecyclerView recyclerView;

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_list);

        ButterKnife.bind(this);
        assert recyclerView != null;
        mDayListPresenter = new DayListPresenter(this);
    }

    @Override
    public void setupRecyclerView(@NonNull List<ForecastdayBeanX> daysData) {
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(
                this,
                daysData)
        );
    }

    @Override
    public void init(@NonNull WeatherModel.CurrentObservationBean todayData) {
        textCityName.setText(todayData.getDisplay_location().getFull());
        textHumidity.setText(todayData.getRelative_humidity());
        textWeatherTemp.setText(todayData.getTemperature_string());
        textWind.setText(todayData.getWind_gust_kph());
        textWeatherCondition.setText(todayData.getIcon());
        textCondition.setText(todayData.getIcon());
        Glide.with(this)
                .asGif()
                .load(todayData.getIcon_url())

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
}
