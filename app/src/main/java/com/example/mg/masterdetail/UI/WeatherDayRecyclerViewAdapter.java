package com.example.mg.masterdetail.UI;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.UI.DI.IFragScope;
import com.example.mg.masterdetail.data.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

@IFragScope
public class WeatherDayRecyclerViewAdapter
        extends RecyclerView.Adapter<WeatherDayRecyclerViewAdapter.ViewHolder> {

    private List<ForecastdayBeanX> mValues;
    private RequestManager mGlide;

    @Inject
    public WeatherDayRecyclerViewAdapter(RequestManager glide) {
        mGlide = glide;
    }

    public void setData(List<ForecastdayBeanX> values) {
        mValues = values;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.day_list_content,
                                parent,
                                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.weatherDay.setText(String.format("%s %s",
                mValues.get(position).getDate().getWeekday_short(),
                mValues.get(position).getDate().getDay()
        ));
        mGlide
                .load(mValues.get(position).getIcon_url())
                .into(holder.weatherIc);
        holder.weatherDegree.setText(String.format("%s / %s",
                mValues.get(position).getLow().getCelsius(),
                mValues.get(position).getHigh().getCelsius()));

    }

    @Override
    public int getItemCount() {
        try {
            return mValues.size();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.text_weather_day)
        TextView weatherDay;
        @BindView(R.id.image_weather)
        ImageView weatherIc;
        @BindView(R.id.text_weather_degree)
        TextView weatherDegree;


        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}